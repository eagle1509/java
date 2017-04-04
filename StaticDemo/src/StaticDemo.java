/**
 * Created by wangce on 2017/2/12.
 */

/*
static 是一个修饰符，只能用来修饰成员（成员变量和成员函数。
当成员被静态修饰后，就多了一个调用方式，除了可以被对象调用后，还可以被类名调用。
格式：类名.静态成员。
随着类的加载而加载；会随着类的消失而消失，存在周期最长
优先于对象存在；静态先，对象后
被所有对象共享；
可以直接被类名调用；

实例变量和类变量：
1.  类变量随着类的加载而存在于方法区中
    实例变量随着对象的建立存在于堆内存中
2.  类变量生命周期最长，随着类的消失而消失
    实例变量生命周期随着对象的消失而消失

使用注意事项：
静态方法只能访问静态成员。
非静态方法可以访问静态和非静态。
静态方法中不可以定义this,super关键字。因为静态优先于对象存在。
主函数是静态的。

静态有利有弊：
利：对对象的共享属性进行单独空间的存储，节省内存，没必要每一个对象都存储一份。
    可以直接被类名调用。
弊：生命周期过长。
    访问出现局限性，只能访问静态。
 */
class Person
{
    String name;
    static String country = "CN";
    public void show()
    {
        System.out.println(name+"::"+country);
    }

}

public class StaticDemo {
    public static void main(String[] args)
    {
        Person p = new Person();
        p.name = "zhangsan";
        p.show();
        System.out.println(Person.country);
    }
}
