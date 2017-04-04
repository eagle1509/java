/**
 * Created by wangce on 2017/2/13.
 */

/*class Student
{
    String name;
    int age;
    void study
    {
        System.out.println("good studey");
    }
}

class Worker
{
    String age;
    int age;
    void work
    {
        System.out.println("good work");
    }

}
*/
/*
Student and Worker有同样的属性，可以将其抽取出来新建一个类，并让该类和Student Work产生联系。
提高了代码的复用性
让类与类之间产生了关系，才有了多态
必须类与类之间有所属关系才可以继承，不要为了获取其他类的功能简化代码而继承
java只能单继承，不支持多继承，可以多层继承
*/

class Person
{
    String name;
    int age;
}

class Student extends Person
{
    void student()
    {
        System.out.println("good study");
    }

}

class Worker extends Person
{
    void work()
    {
        System.out.println("good work");
    }
}
public class ExtendDemo {
    public static void main(String args[])
    {

    }
}
