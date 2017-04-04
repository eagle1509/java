/**
 * Created by wangce on 2017/2/13.
 */
class GetTime {

    private final void getTime()
    {
    long start = System.currentTimeMillis();
    long end = System.currentTimeMillis();
    runCode();
    System.out.println("time = "+(end-start));
    }

    public void runCode(){}
}

class SubTime extends GetTime
{
    public void runcode()
    {
        for(int x = 0; x<4000; x++)
        {
            System.out.print(x);
        }
    }
}
public class TemplateDemo
{

}
