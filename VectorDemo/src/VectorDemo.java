import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by wangce on 2017/2/21.
 */

/*
vector中特有的方法
枚举是Vector特有的取出方式
发现枚举和迭代器很像，其实一样的。

因为枚举的明晨以及方法名称过长，被迭代器代替
 */

public class VectorDemo
{
    public static void main(String [] args)
    {
        Vector v = new Vector();

        v.add("java01");
        v.add("java02");
        v.add("java03");
        v.add("java04");
        v.add("java05");

        Enumeration en = v.elements();

        while(en.hasMoreElements())
        {
            System.out.println(en.nextElement());
        }

    }
}
