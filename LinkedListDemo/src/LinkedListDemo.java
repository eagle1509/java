import java.util.LinkedList;

/**
 * Created by wangce on 2017/2/21.
 */

/*
LinkList特有方法：

addFirst();
addLast();

getFirst();
getLast();
获取元素，但不删除元素.如果集合中没有元素，会出现NoSuchElementException

removeFirst();
removeLast();
获取元素，但是元素被删除。如果集合中没有元素，会出现NoSuchElementException

在1.6出现了替代方法

offerFirst();
offerLast();

peekFirst();
peekLast();
获取元素，但不删除元素.如果集合中没有元素，会返回null

pollFirst();
pollLast();
获取元素，但是元素被删除。如果集合中没有元素，会返回null


*/


public class LinkedListDemo
{
    public static void main(String [] args)
    {
        LinkedList link = new LinkedList();

        link.addFirst("java01");
        link.addFirst("java02");
        link.addFirst("java03");
        link.addFirst("java04");
        link.addFirst("java05");

        sop(link);

        sop(link.getFirst());
        sop(link.getLast());

        //sop(link.removeFirst());
        //sop("size="+link.size());

        /*while(!link.isEmpty())
        {
            sop(link.removeFirst());
        }*/


    }

    public static void sop(Object obj)
    {
        System.out.println(obj);
    }
}
