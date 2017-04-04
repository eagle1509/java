/**
 * Created by wangce on 2017/2/11.
 */

class Person{
    private String name;
    private int age;

    /*person()
    {
        System.out.println();
    }
    */
    //构造代码块
    //给所有对象进行统一初始化，且优先级高于构造函数
    //定义对象的共性初始化内容
    {
        System.out.println("Person code run");
    }

    Person(String name)
    {
        this.name = name;
        /*
        this 用来区别局部变量和成员变量同名情况
        this:代表本类的对象，所在函数所属对象的引用
        构造函数间调用同名智能用this（），只能放在构造函数语句的第一行
         */
        System.out.println("name="+this.name+",age="+this.age);
        cry();
    }

    Person(String name,int age)
    {
    this.name = name;
    this.age = age;
    System.out.println("name = "+this.name+",age="+this.age);
    }

    Person(int age)
    {
        this.age = age;
    }
    public void cry()
    {
        System.out.println("cry");
    }

    //需求：定义一个比较年龄是否相同的功能
    public boolean compare(Person p)
    {
        return this.age==p.age;
    }
}
public class PersonDemo {
    public static void main(String[] args) {
        //Person p1 = new Person();
        //new Person();
        Person p2 = new Person("lisi");
        Person p3 = new Person("wangwu",10);
        Person p4 = new Person(20);
        Person p5 = new Person(25);
        boolean b = p4.compare(p5);
        System.out.println(b);
    }
}

