/**
 * Created by wangce on 2017/2/15.
 */

/*
1.对多异常的处理，建议写更加详细的异常类型；只要存在异常，程序就会结束并跳转到catch处理
2.声明几个异常就对应有几个catch
3.如果多个carch块中的异常出现继承，父类异常放在最下面
4.不要定义多余的catch块
5.在进行catch处理时，catch中一定要定义具体的处理方式，不要只定义一句e.printStackTrace().
 */
class Demo
{
    int div(int a, int b) throws ArithmeticException,ArrayIndexOutOfBoundsException
    //在功能上通过throws的关键字表明该功能有可能出现问题
    {
        int[] arr = new int[a];
        System.out.println(arr[4]);
        return a/b;
    }
}

public class ExceptionDemo
{
    public static void main(String [] args)
    {
        Demo d = new Demo();

        try
        {
         int x = d.div(4,0);
         System.out.println("x="+x);
        }
        /*
        catch (Exception E)
        {
        }
        所有异常均课处理，但无针对性。处理不具体
         */
        catch (ArithmeticException e) //Exception e = new arithmeticException();
        {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            //异常名称，异常信息

            e.printStackTrace();
            //jvn默认的异常处理机制就是在调用该方法并打印
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.print(e.getMessage());
            System.out.println(e.toString());
            System.out.println("越界");
        }

        //int x = d.div(4,0);
        //System.out.println("x="+x);
        System.out.println("over");
    }


}
