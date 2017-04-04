/**
 * Created by wangce on 2017/2/13.
 */

/*
构造函数在父子继承类中特点：
子类中构造函数会在第一行隐式一行代码：super（）
为什么子类一定要访问父类重的构造函数


 */
class Fu
{
    Fu()
    {
        System.out.println("fu run");
    }
    Fu(int x)
    {
        System.out.println("fu"+x);
    }
}

class Zi extends Fu
{
    Zi()
    {   //super()
        System.out.println("zi run");
    }
    Zi(int x)
    {
        //super()
        System.out.println("zi"+x);
    }
}
public class ExtendsDemo2 {
    public static void main(String [] args)
    {
        Zi z = new Zi();
        Zi z1 = new Zi(4);
    }

}
