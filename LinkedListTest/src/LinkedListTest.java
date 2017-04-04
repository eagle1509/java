import java.util.LinkedList;

/**
 * Created by wangce on 2017/2/21.
 */

/*
使用LinkedList来模拟堆栈或者队列数据结构

堆栈：先进后出， first in last out, 如同一个杯子
队列：先进先出， first in first out, 如同一个管子
 */

class Queue
{
    private LinkedList link;

    Queue()
    {
        link = new LinkedList();
    }

    public void myAdd(Object obj)
    {
        link.addFirst(obj);
    }

    public Object myGet()
    {
        return link.removeLast();
    }

    public boolean isNull()
    {
        return link.isEmpty();
    }
}

public class LinkedListTest {

    public static void main(String[] args)
    {
        Queue dl = new Queue();
        dl.myAdd("java01");
        dl.myAdd("java02");
        dl.myAdd("java03");
        dl.myAdd("java04");
        dl.myAdd("java05");

        while(!dl.isNull()) {
            System.out.println(dl.myGet());
        }



    }
}
