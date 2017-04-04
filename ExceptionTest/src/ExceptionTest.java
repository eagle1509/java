/**
 * Created by wangce on 2017/2/16.
 */

class NoValueException extends RuntimeException
{
    NoValueException (String message)
    {
        super(message);
    }
}


interface Shape
{
    void getArea();
}

class Rec implements Shape
{
    private int len,wid;
     Rec (int len, int wid)throws NoValueException
     {
         if(len<=0 || wid<=0)
             throw new NoValueException("出现非法值");
         this.len = len;
         this.wid = wid;
     }

     public void getArea()
     {
         System.out.println(len*wid);
     }
}

class Circle implements Shape
{
    private int radius;
    public static final double P = 3.14;
    Circle(int radius)
    {
        this.radius = radius;
    }

    public void getArea()
    {
        System.out.println(radius*radius*P);
    }
}

public class ExceptionTest
{
    public static void main(String [] args)
    {


        try
        {
            Rec r = new Rec(-3,4);
            r.getArea();
        }
        catch (NoValueException e)
        {
            System.out.println(e.toString());
        }
        //r.getArea();

    }
}
