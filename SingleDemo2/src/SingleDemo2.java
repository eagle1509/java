/**
 * Created by wangce on 2017/2/18.
 */



class Single2
{
    private static final Single s = new Single();
    private Single(){}
    public static Single getInstance()
    {
        return s;
    }

}

//通过双if语句来保证效率，不需要每一个循环都读锁，而且通过锁来保证安全性

class Single
{
    private static Single s = null;
    private Single()()

    public static  Single getInstance()
            //静态函数锁的是类，即.class;非静态锁的是this
    {
        if(s==null)
        {
            synchronized (Single.class)
            {
                if(s==null)
                {
                    s = new single();
                }
            }
            return s;
        }
    }
}

public class SingleDemo2 {
}
