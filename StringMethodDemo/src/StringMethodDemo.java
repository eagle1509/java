/**
 * Created by wangce on 2017/2/19.
 */

/*
Some methods:

1。获取：
    1。1 字符串中的包含的字符数，也就是字符串的长度。
        int length():获取长度；
   1。2 根据位置获取位置山某个字符。
        char charAt(int index):
   1。3 根据字符获取该字符在字符串中的位置。
        int indexOf(int ch):返回的是ch在字符串中第一次出现的位置，ch为编码
        int indexOf(int ch,int fromIndex): 从fromIndex指定位置开始，获取ch在字符串中出现的位置。
        int lastIndexOf(int ch):从最后位置开始获取ch在字符串中出现的位置。

2。判断
    2。1 字符串中是否包含某一个字符。
        boolean contains(str):
        特殊：indexOf(str):可以索引str第一次出现的位置，如果返回-1，表示该str不在字符串中存在
            所以，也可以用于对制定判断是否包含。
            if(str.indexOf("aa")!=-1)
            而且该方法可以判断，还可以获取出现的位置。

    2。2 字符串中是否有内容。
        boolean isEmpty(str): 原理就是判断长度是否为0。 "" null
    2。3 字符串是否是以指定内容开头
        boolean startsWith(str):
    2。4 字符串是否是以制定内容结尾。
        boolean endsWith(str):
    2。5 判断字符串中内容是否相同，复写了object类中的equals方法。
        boolean equals(str)
    2。6 判断内容是否相同，并忽略大小写。
        boolean equalsIgnoreCase();

3。转换：
    3。1 将字符数组转成字符串
        构造函数：String(char[])
                 String(char[],offset,count):将字符数组中的一部分转成字符串
        静态方法：
                  static String copyValueOf(char[]);
                  static String copyValueof(char[] datam int offset, int count)
                  static String valueof(char[]):
    3。2 将字符串转成字符数组
       char[] tocharArray():

    3。3 将字节数组转成字符串
        String(byte[])
        String(byte[],offset,count):将字符数组中的一部分转成字符串

    3。4 将字符串转成字节数组
        byte[] getBytes():

    3。5 将基本数据类型转成字符串。
        static String valueof(int)
        static String valueof(double)

        3+"";//String.valueof(3);

        特殊：字符串和字符数组在转换过程中可以制定编码表。

4。替换：
    String replace(oldchar,newchar);



5。切割：
    String[] split(regex);


6。子串：
    获取字符串中的一部分
    String substring(begin);
    String substring(begin,end);


7。转换，去除空格，比较。
    7。1 将字符串转成大写或者小写
        String toUpperCase();
        String toLowerCase();

    7。2 将字符串两端的多个空格去除
        String trim();

    7。3 对两个字符串进行自然顺序比较
        int compareTo(String);

 */


public class StringMethodDemo
{

    public static void method_7()
    {
        String s = "   Hello Java   ";
        sop(s.toLowerCase());
        sop(s.toUpperCase());
        sop(s.trim());

        String s1 = "abc";
        String s2 = "aaa";

        sop(s1.compareTo(s2));

    }

    public static void method_sub()
    {
        String s = "abcdefgh";
        sop(s.substring(2));
        //从指定位置到结尾,如果角标不存在，会存在字符串角标越界异常
        sop(s.substring(2,4));
        //包含头，不包含尾 s.substring(0,s.length());
    }



    public static void method_split()
    {
        String s = "zhangsan,lili,wangwu";

        String[] arr = s.split(",");

        for (int x = 0; x<arr.length; x++)
        {
            sop(arr[x]);
        }
    }

    public static void method_replace()
    {
        String s = "hello world";

        //String s1 = s.replace('a','n');
        //如果被替换的字符不存在，则返回原串

        String s1 = s.replace("java","world");

        sop("s="+s);
        //s并没有改变，因为字符串被初始化后不能被改变
        sop("s1="+s1);
    }


    public static void method_trans()
    {
        char[] arr = {'a','b','c','d','e','f'};

        String s = new String(arr);
        String s1 = new String(arr,1,3);
        //1-起始位置，3-数量

        String s2 = "zxcvbnm";
        char[] chs = s2.toCharArray();

        for(int x = 0; x<chs.length; x++)
        {
            sop("chas="+chs[x]);
        }

        sop("s="+s);
    }

    public static void method_get()
    {
        String str = "abcdefghiabcd";

        //length
        sop(str.length());

        //根据索引获取字符
        sop(str.charAt(4));

        //根据字符获取索引，如果没有找到，传回-1
        sop(str.indexOf('a',3));

        //反响索引一个字符出现的位置
        sop(str.lastIndexOf("a"));

    }

    public static void method_is()
    {
        String st = "ArrayDemo.java";

        //判断字符串中是否以array开头
        sop(st.startsWith("array"));

        //判断字符串中是否以。java结尾
        sop(st.endsWith(".java"));

        //判断字符串中是否含有demo
        sop(st.contains("Demo"));
    }


    public static void main(String[] args){

        /*
        String s1 = "abc";
        String s2 = new String("abc");

        String s3 = "abc";

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        */
        method_7();
        method_sub();
        method_split();
        method_replace();
        method_get();
        method_is();
        method_trans();

    }

    public static void sop(Object obj)
    {
        System.out.println(obj);
    }
}
