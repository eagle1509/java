/**
 * Created by wangce on 2017/4/3.
 */
public class TestForLoop {
    public static void main(String [] args){
        System.out.println(position(2,4,5,4));
    }
    public static double position(double s0, double v0,double a0,double t){
        return(s0+v0*t+0.5*a0*t*t);
    }
}

class Two{
    public static void main(String [] args) {
        for (int x = 1; x <= 10; x++) {
            System.out.print((int)Math.pow(x,2)+"\t");
        }
    }
}

class Three{
    public static void main(String [] args){

    }

    public static void fibonacci(int totalnumber){
        if (totalnumber<=2) {
            for (int x = 1; x <= totalnumber; x++) {
                System.out.print(1);
            }
        }else {
            System.out.print("1 1");
            for (int x = 3; x<= totalnumber; x++){
                int number = 0;
                number = 2+number;
                System.out.print(number);
            }

            }
        }
    }

    long num1 = 1;
    long num2 = 1;
    long temp = 0;
        for (int i = 2; i < n; i++) {
        temp = num2;
        num2 += num1;
        num1 = temp;
        }
        return num2;