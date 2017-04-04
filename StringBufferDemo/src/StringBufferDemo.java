/**
 * Created by wangce on 2017/2/20.
 */

/*
StringBuffer是String的缓冲区
是一个容器
1。长度可变化
2。可以字节操作多个数据类型
3。最终会通过toString方法变为字符串

C creat
U update
R read
D delete

1.存储
    StringBuffer append():将指定数据添加到结尾处
    StringBuffer insert(index, 数据):可以将数据插入到指定index位置

2.删除
    StringBuffer delete(start,end):删除缓冲区重的数据，包含start，不包含end。
    StringBuffer deleteCharAt(index):删除指定位置的字符。

3.获取
    char charAt(int index)
    int indexOf(String str)
    int lastindexOf(String str)
    int length()
    String substring(int start, int end)

4.修改
    StringBuffer replace(start, end , string);
    void setCharAt(int index, char ch);

5.反转
    StringBuffer reverse();

6.void getChars(int srcBegin, int srcEnd, char[] set, int dstBegin)
将缓冲区中的指定数据存储到指定数组中

7.在jdk1.5版本后出现了StringBuilder.

StringBuffer是线程同步的。适用于多线程
StringBuilder是线程不同步的。适用于单线程

提高效率，简化书写，提高安全性，推荐使用StringBuilder

 */

public class StringBufferDemo
{

    public static void sop(String str)
    {
        System.out.println(str);
    }

    public static void method_Add()
    {
        StringBuffer sb = new StringBuffer();

        sb.append("abc").append(true).append(34);

        //StringBuffer sb1 = sb.append(34);
        //sop("sb==sb1"+(sb==sb1));

        sb.insert(1,"qq");//插入某一位置后
        sop(sb.toString());//abcture34
        //sop(sb1.toString());
    }

    public static void method_Del()
    {
        StringBuffer sb = new StringBuffer("abcdef");

        //sb.delete(1,3);

        //情况换成清空缓冲区。
        //sb.delete(0,sb.length());

        //sb.delete(2,3);
        sb.deleteCharAt(2);

        sop(sb.toString());

    }

    public static void method_Update()
    {
        StringBuffer sb = new StringBuffer("abcdef");

        //sb.replace(1,4,"java");

        sop(sb.toString());
        sb.setCharAt(2,'k');

        sop(sb.toString());
    }


    public static void main(String [] args)
    {
        StringBuffer sb = new StringBuffer("abcdefghi");

        char[] chs = new char[4];


        sb.getChars(1,4,chs,0);

        for(int x  = 0; x<chs.length; x++)
        {
            sop("chs["+"]"+chs[x]+";");
        }

        method_Add();
    }
}
