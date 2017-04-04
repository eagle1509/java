/**
 * Created by wangce on 2017/2/13.
 */

/*
设计模式：gof 解决某一类问题最有效的方法
单例设计模式：解决一个类在内存中只存在一个对象。

想要保证对象唯一
1，为了避免其他程序过多建立该类对象，现禁止其他程序建立该类对象
2，在本类中自定义一个对象。
3，可以对外提供一些访问方式。

步骤：
1,将构造函数私有化，
2,在类中创建一个本类对象，
3,提供一个方法可以获取到该类对象。


 */

class Single
{
    private int num;
    private Single(){}

    static Single s = new Single();

    public static Single getInstance()
    {
        return s;
    }
    public int getNum()
    {
        return num;
    }
}


class Student
{
    private int age;
    private Student(){}

    public static Student s = new Student();

    public static Student getStudent()
    {
        return s;
    }


    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
}

public class SingleDemo
{
    public static void main(String[] args)
    {
        Single s1 = Single.getInstance();
        Single s2 = new Single();
        Single s3 = new Single();
        s2.getNum(30);
        System.out.println(s2.getNum());
    }
}

