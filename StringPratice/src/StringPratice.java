/**
 * Created by wangce on 2017/2/19.
 */


public class StringPratice
{

    public static void sop(String str)
    {
        System.out.println(str);
    }

    //pratice 1 去除字符串两边空格

    public static String myTrim(String str)
    {
        int start = 0, end = str.length()-1;

        while(start<=end && str.charAt(start)==' ')
            start++;
        while(start<=end && str.charAt(end)==' ')
            end--;

        return str.substring(start,end+1);
    }

    //pratice 2 将字符串反转，先将字符串转变为数组，将数组反转，然后再变为字符串

    public static String reverseString(String s)
    {
        char[] chs = s.toCharArray();

        reverse(chs);

        return new String(chs);
    }

    public static String reverseString(String s, int start, int end)
    {
        char[] chs = s.toCharArray();

        reverse(chs, start, end);

        return new String(chs);

    }

    private static void reverse(char[] arr)
    {
        for (int start = 0, end = arr.length-1; start<end ; start++,end--)
        {
            swap(arr,start,end);
        }
    }

    private static void reverse(char[] arr, int x, int y)
    {
        for (int start = x, end = y-1; start<end ; start++,end--)
        {
            swap(arr,start,end);
        }
    }

    private static void swap(char[] arr, int x, int y)
    {
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    //pratice 3 获取一个字符串在另一个字符串中出现的次数

    public static int getSubCount(String str, String key)
    {
        int count = 0;
        int index = 0;

        while((index = str.indexOf(key))!=-1)
        {
            sop("str="+str);
           str =  str.substring(index+key.length());
           count++;
        }
        return count;
    }

    //pratice 3(2)

    public static int getSubCount2(String str,String key)
    {
        int count = 0;
        int index = 0;

        while((index = str.indexOf(key,index))!=-1)
        {
            sop("index="+index);
            index = index +key.length();

            count++;
        }
        return count;
    }



    public static void main(String[] args)
    {
        String s = "     ab cd     ";
        sop("("+s+")");
        //s = myTrim(s);
        sop("("+s+")");

        sop("("+reverseString(s)+")");

        sop(reverseString(s,6,9));

        String str = "abcddenddghiddkmndd";
        sop("count"+getSubCount(str,"dd"));
        sop("count"+getSubCount2(str,"dd"));
    }
}
