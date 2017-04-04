/**
 * Created by wangce on 2017/2/14.
 */
/*
多态：事物存在的多种表现形态

human: man woman;
animal: cat,dog:
cat x = new cat();
animal x = new cat();

多态的体现：
    父类引用指向了自己的子类对象。
    父类引用也可以接收自己的子类对象。

多态的前提：
    必须是类与类之间有关系，要么继承，要么实现。
    通常会存在覆盖。

多态的好处：
    提高了程序的扩展性。

多态的弊端：
    提高了扩展性，但是只能使用父类的引用访问父类中的成员。

多态的应用：

 */

//animal.cat dog

abstract class Animal
{
    abstract void eat();
}

class Cat extends Animal
{
    public void eat()
    {
        System.out.println("eat fish");
    }
    public void catchMouse()
    {
        System.out.println("CatchMouse");
    }
}

class Dog extends Animal
{
    public void eat()
    {
        System.out.println("eat bone");
    }
    public void guard()
    {
        System.out.println("guard");
    }
}

class Pig extends Animal
{
    public void eat()
    {
        System.out.println("siliao");
    }
    public void gongDi()
    {
        System.out.println("gongDi");
    }
}

public class DuotaiDemo {
    public static void main(String[] args)
    {
        //Cat c =new Cat();
        //c.eat();
        //Dog d = new Dog();
        //d.eat();
        //Cat c1 =new Cat();
        //function(c1);
        function(new Dog());
        Animal c = new Cat();
        c.eat();

    }
    public static void function(Animal a)
    {
        a.eat();
    }
    /*
    public static void function(Cat c)
    {
        c.eat();
    }
    public static void function(Dog d)
    {
        d.eat();
    }
    */
}
