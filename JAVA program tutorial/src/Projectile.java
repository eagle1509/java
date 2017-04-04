/**
 * Created by wangce on 2017/4/2.
 */
import java.util.*;

//This program is used to compute the trajectory of a projectile
public class Projectile {

    public static final double ACCELLERATION = -9.81;

    public static void main (String[] args) {


        Scanner console = new Scanner(System.in);
        System.out.println("velocity (meters/seconds) ?");
        double velocity = console.nextDouble();
        System.out.println("angle (degree) ?");
        double angle = Math.toRadians(console.nextDouble());
        System.out.println("number of steps to display?");
        int steps = console.nextInt();

        printTable(velocity, angle, steps);

        }

    public static double round(double x){

        return Math.round(x * 100.0)/100.0;
    }

    public static void printTable(double velocity, double angle, int steps){
        double xVelocity = velocity * Math.cos(angle);
        double yVelocity = velocity * Math.sin(angle);

        double totalTime = -2.0 * yVelocity / ACCELLERATION;

        double timeIncreament = totalTime / steps;
        double xIncreament = xVelocity * timeIncreament;

        double x = 0.0;
        double y = 0.0;
        double t = 0.0;
        System.out.println("step\tx\ty\ttime");
        System.out.println("0\t0.0\t0.0\t0.0");

        for(int i = 1; i<=steps; i++){

            t += timeIncreament;
            x += xIncreament;
            y = yVelocity * t + 0.5 * ACCELLERATION * t * t;
            System.out.println(i + "\t" + round(x) +"\t" + round(y) +
                    "\t" + round(t));
            }
    }
}
