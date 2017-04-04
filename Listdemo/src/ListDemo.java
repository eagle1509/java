/**
 * Created by wangce on 2017/2/21.
 */

/*
Collection:
List:元素是有序的，元素可以重复，因为该集合体系有索引

    ArrayList:底层的数据结构使用的是数组结构，不同步的，特点：查询速度很快。但是增删稍慢。可变长度数组，初始长度为10，需要延长时会建立新数组然后延长。
    LinkedList:底层使用的是链表数据结构，特点：增删速度很快，查询稍慢
    Vector:底层是数组数据结构，是同步的。功能和List一样，1.2后改进为List。


Set:元素是无序的，元素不可以重复

List特有方法：
    特有方法：凡是可以操作角标的方法都是该体系特有的方法

    增：
        add(index,element);
        addAll(index,Collection);
    删：
        remove(index);
    改：
        set(index, element);
    查：
        get(index);
        subList(from,to);
        listIterator();

    List集合特有的迭代器。ListIterator是Iterator的子接口。
    在迭代时。不可以通过集合对象的方法操作集合中的元素，因为会发生
    ConcurrentModificationException异常

    所以，在迭代器时，只能用迭代器的放过操作元素，可是Iterator方法有限
    只能对元素进行判断，取出，删除的操作
    如果想要其他的操作，如添加修改等，就需要使用其子接口，ListIterator

    该接口只能通过List的Iterator获取

 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo
{
    public static void sop(Object obj)
    {
        System.out.println(obj);
    }

    public static void method()
    {
        ArrayList al = new ArrayList();

        //在指定位置添加元素
        al.add("java01");
        al.add("java02");
        al.add("java03");
        al.add("java04");

        sop("原集合是："+al);

        al.add(1,"java09");

        //删除指定位置的元素
        //al.remove(2);

        //修改元素
        //al.set(2,"java007");

        //通过角标获取元素
        sop("get(1):"+al.get(1));

        sop(al);

        //获取所有元素
        for(int x= 0; x<al.size(); x++)
        {
            System.out.println("al("+x+")="+al.get(x));
        }

        Iterator it = al.iterator();

        while(it.hasNext())
        {
            sop("next"+it.next());
        }

        //通过indexOf获取对象的位置
        sop(al.indexOf("java02"));

        List sub = al.subList(1,3);

        sop("sub="+sub);

    }

    public static void main(String[] args)
    {
        //演示列表迭代器

        ArrayList al = new ArrayList();

        //在指定位置添加元素
        al.add("java01");
        al.add("java02");
        al.add("java03");
        al.add("java04");

        //在迭代过程中准备添加活着删除元素
        /*Iterator it = al.iterator();

        while(it.hasNext())
        {
            Object obj = it.next();

            if(obj.equals("java02"))
            {
                //al.add("java008");
                it.remove();
            }

            sop("obj"+obj);
        }
        */

        ListIterator li = al.listIterator();

        while(li.hasNext())
        {
            Object obj = li.next();

            if(obj.equals("java02"))
            {
                //li.add("java009");
                li.set("java006");
            }

            sop(al);
        }






    }
}
