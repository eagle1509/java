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
        fibonacci(12);
    }

    public static void fibonacci(int totalnumber){
        if (totalnumber<=2) {
            for (int x = 1; x <= totalnumber; x++) {
                System.out.print(1+"\t");
            }
        }else {
            System.out.print("1 1");
            long num1 = 1;
            long num2 = 1;
            long temp = 0;
            for (int i = 2; i < totalnumber; i++) {
                temp = num2;
                num2 += num1;
                num1 = temp;
                System.out.print("\t" + num2);
            }
        }
    }
}

class Four{
    public static void main(String [] args){
        printStars(4);
    }

    public static void printStars(int lines){
        for(int i = 0; i < lines; i++){
            System.out.println("*****");
        }
    }
}

class Five{
    public static void main(String [] args){
        printStarinDoubleFor(3);
    }

    public static void printStarinDoubleFor(int lines){
        for(int x = 1; x <= lines; x++){
            for(int y = 1; y <= x; y++){
                //for(int y = 1; y < x; y+=)
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

class Six{
    public static void main(String [] args){
        printNumsinDoubleFor(5);
    }

    public static void printNumsinDoubleFor(int lines){
        for(int x = 1; x <=lines; x++){
            for(int y = 1; y <= x; y++){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}

class Seven{
    public static void main(String [] args){
        printSlantingNums(5);
    }

    public static void printSlantingNums(int lines){
        for(int x = 1; x <= lines; x++){
            for(int y = lines; y >= x; y--){
                System.out.print(" ");
            }
            System.out.println(x);
        }
    }
}

class Eight{
    public static void main(String [] args){
        printAngleNums(5);
    }

    public static void printAngleNums(int lines){
        for(int x = 1; x<= lines; x++){
            for(int y = lines; y >= x; y--){
                System.out.print(" ");
            }
            for(int z = 1; z <= x; z++){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}

class Nine {
    public static void main(String[] args) {
        line();
        secondLine();
        thirdLine();
        line();
    }

    public static void line() {
        for (int x = 0; x < 40; x++) {
            System.out.print('-');
        }
        System.out.println();
    }

    public static void secondLine() {
        for (int x = 0; x < 10; x++) {
            System.out.print("_-^-");
        }
        System.out.println();
    }

    public static void thirdLine() {
        for (int x = 0; x < 2; x++) {
            for (int y = 1; y < 10; y++) {
                for (int z = 0; z < 2; z++) {
                    System.out.print(y);
                }
            }
            System.out.print("00");
        }
        System.out.println();
    }
}

class Ten{
    public static void main(String [] args){
        numsLoop();
    }

    public static void numsLoop(){
        for ( int x = 0; x < 6; x++){
            for ( int y = 1; y< 10; y++){
                System.out.print(y);
            }
            System.out.print('0');
        }
        System.out.println();
    }
}

class Eleven{
    public static void main( String [] args){
        numsLoop2(4,3);
    }

    public static void numsLoop2(int maxnum , int maxloop){
        for( int x = 0; x <= maxloop; x++){
            for( int y = 1; y <= maxnum; y++){
                System.out.print(y);
            }
            System.out.print(0);
        }
    }
}

class Twelve{
    public static void main( String [] args){
        numLoopForLines(3,3);
    }

    public static void numLoopForLines(int loop , int lines ){
        for ( int x = 0; x < lines; x++){
            for (int y = 0; y <= 9; y++){
                for (int z = 1; z <= loop; z++){
                    System.out.print(y);
                    }
                }
                System.out.println("");
        }

    }
}

class Thirteen{
    public static void main(String [] args){
        verseNumLoopForLines(5,5);
    }

    public static void verseNumLoopForLines( int loop, int lines){
        for ( int x = 0; x < lines; x++){
            for ( int y = 9; y >= 0; y--){
                for ( int z = 0; z <= loop; z++){
                    System.out.print(y);
                }
            }
            System.out.println();
        }

    }
}

class Fourteen{
    public static void main (String [] args){
        verseLessNumLoopForLines(5,4);
    }

    public static void verseLessNumLoopForLines(int maxnum, int lines){
        for ( int x = 0; x< lines; x++){
            for ( int y = maxnum; y > 0; y--){
                for ( int z = 0; z < y; z++){
                    System.out.print(y);
                }
            }

            System.out.println();
        }
    }
}

class Fifteen {
    public static void main(String[] args) {
        printDesign();
    }

    public static void printDesign() {

        for (int x = 1; x <=9 ; x+=2) {
            for (int i = 10; i > x; i-=2) {
                System.out.print('-');
            }
            for ( int y = 1; y <= x; y++){
                System.out.print(x);
            }
            for (int i = 10; i > x; i-=2) {
                System.out.print('-');
            }

            System.out.println();
        }
    }
}

//not finish yet
class Sixteen {
    public static void main( String [] args){
        SlshFigure(3);
    }

    public static void SlshFigure( int height){

        for ( int x = 1; x <= height; x++){
            for ( int y = 1; y <= 2 * (x-1); y++){
                System.out.print("\\\\");
            }

            for (int i = 2 + 4*height; i>=x; i-=2){
                System.out.print("!!");
            }



            System.out.println();
        }
    }
}