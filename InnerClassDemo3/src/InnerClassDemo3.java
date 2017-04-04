/**
 * Created by wangce on 2017/2/15.
 */


/*
匿名内部类就是内部类的简写格式。
定义匿名内部类的前提：内部类必须是继承一个类或者实现接口。
匿名内部类的格式：new 父类或者接口(){}
匿名内部类就是一个匿名子类对象。
匿名对象对方法只能调用一次
 */

abstract class AbsDemo
{
    abstract void show();

}

class Outer
{
    int x =3;

    /*
    class Inner extends AbsDemo
    {
        void show()
        {
            System.out.print("method :"+x);
        }
        void abc()
        {
            System.out.print("hah");
        }

    }
    */

    public void function()
    {
        //new Inner().show();
        //AbsDemo a = new Inner()
        AbsDemo d = new AbsDemo() //匿名内部对象，用父类对象代替，并且实现父类中的抽象方法，并加上show实现语句。
                                    //多态形式只能调用父类中的方法
        {
            void show()
            {
                System.out.println("x="+x);
            }
            void abc()
            {
                System.out.println("hah");
            }
        };

        d.show();
        //d.abc 不行，编译失败



    }
}

public class InnerClassDemo3
{
    public static void main(String[] args)
    {
        new Outer().function();
    }
}
