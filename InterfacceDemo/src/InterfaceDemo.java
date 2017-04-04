/**
 * Created by wangce on 2017/2/14.
 */
/*
初期理解：可以被认为是一个特殊的抽象类
当抽象类种方法都是抽象的，那么该类可以通过借口的形式来表示。

接口定义时：
1，常见定义：常量和抽象方法
2。都有固定修饰符：
常量：public static final int/double/...
方法: public abstract
这些修饰符都是固定的，只要在interface下，就会自动补全.

借口不可以创建对象，因为有抽象方法。
需要被子类实现，子类对借口重的抽象方法全部覆盖后，子类才可以实例化。
否则，子类是一个抽象类。

接口可以被类多实现，也是对多继承不支持的转换形式：java支持多实现.



 */

interface Inter
{
    public static final int NUM = 3;
    public abstract void show();
}

interface  InterA
{
    public abstract void show();
}


class Demo
{
    public void function(){}
}

//先继承再实现可以扩展功能

class Test extends Demo implements Inter,InterA
{
    @Override
    public void show() {

    }

}

interface A
{
    void methodA();
}

interface B extends A
{
    void methodB();
}

interface C extends B
{
    void methodC();
}

class D implements C
{
    public void methodA(){}
    public void methodB(){}
    public void methodC(){}
}

public class InterfaceDemo {
    public static void main(String[] args)
    {
        Test t = new Test();
        System.out.println(t.NUM);
        System.out.println(Test.NUM);
        System.out.print(Inter.NUM);

    }
}
