import static com.sun.tools.doclint.Entity.sum;

/**
 * Created by wangce on 2017/1/24.
 */
public class FunctionTest {
    public static void main (String [] rgs )
    {
        sum(4,6);
        System.out.println(sum);
    System.out.println();
    }
    public static int sum(int a, int b)
    {
        return a+b;

    }
}
