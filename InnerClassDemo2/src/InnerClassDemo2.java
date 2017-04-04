/**
 * Created by wangce on 2017/2/15.
 */

class Outer
{
    int x =3;

    void method(final int  a) //内部类只能访问被final修饰的局部变量，不可以访问它所在的局部中的变量
    {
        final int y = 4;
        class Inner
        {
            void funciotn()
            {
                System.out.println(a);
            }
        }

        new Inner().funciotn();
    }

}

public class InnerClassDemo2 {
    public static void main(String[] args)
    {
        Outer out = new Outer();
        out.method(7);
        out.method(8);//执行完上一行语句后会释放栈内存。
    }
}
