/**
 * Created by wangce on 2017/2/15.
 */

/*外部类和内部类访问规则：
    内部类可以直接访问外部类中的成员，包括私有。格式为： 外部类名.this
    外部类要访问内部类，必须要建立内部类对象
  访问规则：
  当内部类定义在外部类成员位置上时，而且非私有，可以在其他外部类中直接建立内部类对象。
  格式：
        外部类名。内部类名 变量名 = 外部类对象。内部类对象
        Outer,Inner in = new Outer().new Inner();

  当内部类在成员位置上时，可以被成员修饰符修饰
  比如： privat：将内部类进行封装
        Static：将内部类静态，只能访问外部类中的static成员，出现了访问局限

        在外部其他类中，访问static内部类非静态成员：
        newOuter.Inner().function();
        在外部类中，访问static内部静态成员：
        Outer.Inner.function();
    当内部类中定义了静态成员，该内部类必须是静态的；
    当外部类中的静态方法访问内部时，内部也要是静态的；

*/

class Outer
{
    private int x =3;

    class Inner //static class Inner
    {
        int x= 4;
        void function() //static void function
        {
            int x=6;
            System.out.println("inner : "+Outer.this.x);
        }
    }

    void method()
    {
        Inner in = new Inner();
        in.function();
    }

}

public class InnerClassDemo {
    public static void main(String [] args)
    {
        Outer out = new Outer();
        out.method();

        //直接访问内部类重的成员
        Outer.Inner in = new Outer().new Inner();
        in.function();

    }

}
