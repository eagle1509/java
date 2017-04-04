/**
 * Created by wangce on 2017/2/18.
 */

/*
wait;
notify;
notifyAll();
都是用在同步中，因为要对持有监视器（锁）的线程操作。
因为只有同步才有锁的概念。

为什么这些操作线程的方法要定义在object中？
因为这些方法在操作线程中，必须要表示他们锁操作线程持有的锁，
只有同一个锁上的被等待线程可以被同一个锁上notify唤醒，不可以对不同锁中的线程进行唤醒。

等待和唤醒必须是同一个锁。

而锁可以是任意对象，可以被任意对象调用的方法定义在object中。

 */


class Res{

    private String name;
    private String sex;
    private boolean flag = false;

    public synchronized void set(String name, String sex)
    {
        //可能出现安全问题
        if(flag)
            try{this.wait();}catch(Exception e){}
        this.name = name;
        this.sex = sex;
        flag = true;
        this.notify();

    }

    public void out()
    {
        if(!flag)
            try{this.wait();}catch(Exception e){}
        System.out.println(name+"..."+sex);
        flag = false;
        this.notify();
    }

}

class Input implements Runnable
{

    private Res r;

    Input(Res r)
    {
        this.r =r;
    }
    public void run()
    {
        int x = 0;
        while(true)
        {
            /*synchronized(r)
            {
                if(r.flag)
                    try{r.wait();}catch(Exception e){}
                    */
                if (x == 0)
                {
                   //r.name = "mike";
                    // r.sex = "man";

                   r.set("mike","man");
                }
                else{
                    //r.name = "丽丽";
                    //r.sex = "女";

                    r.set("丽丽","女");

                }
                x = (x+1)%2;
                //r.flag = true;
                //r.notify();
            }
        }
}

class Output implements Runnable{
    private Res r;

    Output(Res r)
    {
        this.r =r;
    }
    public void run (){
        while(true)
        {
            //synchronized (r)
            {
                /*
                if(!r.flag)
                    try{r.wait();}catch(Exception e){}
                System.out.println(r.name+"..."+r.sex);
                r.flag = false;
                r.notify();
                */
                r.out();
            }
        }
    }
}

public class InputOutputDemo {
    public static void main(String [] args){
        Res r = new Res();

        /*Input in = new Input(r);
        Output out = new Output(r);

        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);

        t1.start();
        t2.start();
        */

        new Thread(new Input(r)).start();
        new Thread(new Output(r)).start();
    }

}

