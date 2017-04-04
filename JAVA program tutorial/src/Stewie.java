/**
 * Created by wangce on 2017/4/2.
 */
public class Stewie {

    public static void main(String[] args) {

        String str = "|| Victroy is mine! ||";
        cover(str.length());
        System.out.println(str);
        bottom(str.length());
    }

    public static void cover(int x) {
        for (int y = 0; y < x; y++) {
            System.out.print('/');
        }
        System.out.println("");
    }

    public static void bottom(int x) {
        for (int y = 0; y < x; y++) {
            System.out.print('\\');
        }
    }
}

class WellFormed{
    public static void main(String [] args) {
        System.out.println("A well-formed Java program has");
        System.out.println("a main method with { and }");
        System.out.println("braces.\n");
        System.out.println("A System.ou.println statement\n" +
                "has ( and ) and usually a\n" +
                "String that starts and ends\n" +
                "with a \" character.\n" +
                "(But we type \\ \" instead!)");

    }
}

class Difference{
    public static void main(String [] args){
        System.out.println("What is the difference between\n" +
                "a ' and a \"? Or between a \" and a \\\"?\n");
        System.out.println("One is what we see when we're typing our program.\n" +
                "The other is waht appears on the \"console.\"");
    }
}

class MuchBetter{
    public static void main(String [] args){
        System.out.println("A \'quoted\" String is \n" +
                "'much' better if you learn\n" +
                "the rules of \"escape sequence.\"\n" +
                "Also,\"\"represents an empty String.\n" +
                "Dont't forget: use\\\' instead of \" !\n" +
                "''is not the same as \"");
    }
}


class Meta{
    public static void main(String [] args){
        System.out.println("class Meta\n" +
                "public static void main(String [] args){\n" +
                "System.out.println(\'Hello,world!\");\n" +
                "}\n" +
                "}");
    }
}

class Mantra{
    public static void main(String [] args){
        Output();
        Output();
    }

    public static void Output(){
        System.out.println("There's one thing every coder must understand:\n" +
                "The System.out.println command.\n");
    }
}

class Stewie2{
    public static void main(String [] args){
        String str = "|| Victory is mine! ||";
        cover(str.length());
        letter(str);
        bottom(str.length());
        letter(str);
        bottom(str.length());
        letter(str);
        bottom(str.length());
        letter(str);
        bottom(str.length());
        letter(str);
        bottom(str.length());
    }

    public static void cover(int x){
        for (int y = 0; y<x; y++){
            System.out.print('/');
        }
        System.out.println("");
    }

    public static void letter(String str){
        System.out.println(str);
    }

    public static void bottom(int x){
        for (int y = 0; y<x; y++){
            System.out.print("\\");
        }
        System.out.println("");
    }
}

class Egg{
    public static void main(String [] args){
        cover();
        bottom();
        line();
        cover();
        bottom();
        line();
        bottom();
        cover();
        line();
        bottom();
    }
    public static void cover(){
        System.out.println("  _______  ");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }
    public static void bottom(){
        System.out.println("\\         /");
        System.out.println(" \\       / ");
        System.out.println("  -------  ");
    }
    public static void line(){
        System.out.println("-\"-'-\"-'-\"-");
    }
}


class FightSong{
    public static void main(String [] args){
        first();
        second();
        second();
        first();
    }

    public static void first(){
        go();
        youCan();
        System.out.println("");
    }
    public static void second(){
        go();
        youCan();
        youRe();
        in();
        go();
        youCan();
        System.out.println("");
    }

    public static void go(){
        System.out.println("Go, team, go!");
    }
    public static void youCan(){
        System.out.println("You can do it.");
    }
    public static void youRe(){
        System.out.println("You're the best.");
    }
    public static void in(){
        System.out.println("In the West.");
    }
}

class Starfigures{

    public static void main(String [] args){
        doubleFive();
        x();
        System.out.println("\n\n");
        doubleFive();
        x();
        doubleFive();
        System.out.println("\n\n");
        one();
        one();
        one();
        doubleFive();
        x();
    }

    public static void x(){
        two();
        one();
        two();
    }

    public static void doubleFive(){
        System.out.println("*****\n*****");
    }

    public static void two(){
        System.out.println(" * * ");
    }

    public static void one(){
        System.out.println("  *  ");
    }
}

class Lanterns{
    public static void main(String [] args){
        threeTimes();
        System.out.print("\n");
        threeTimes();
        line();
        thirteen();
        threeTimes();
        threeTimes();
        five();
        line();
        line();
        five();
        five();

    }

    public static void threeTimes(){
        five();
        nine();
        thirteen();

    }

    public static void thirteen(){
        for(int x = 0; x<13;x++){
            System.out.print('*');
        }
        System.out.println("");
    }

    public static void nine(){
        System.out.println("  *********  ");
    }

    public static void five(){
        System.out.println("    *****    ");
    }

    public static void line(){
        System.out.println("* | | | | | *");
    }
}

class EggStop{
    public static void main(String [] args){
        cover();
        bottom();
        bottom();
        line();
        cover();
        System.out.println("|   STOP  |");
        bottom();

        cover();
        line();
    }

    public static void cover(){
        System.out.println("  _______  ");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }
    public static void bottom(){
        System.out.println("\\         /");
        System.out.println(" \\       / ");
        System.out.println("  -------  ");
    }
    public static void line(){
        System.out.println("+---------+");
        //System.out.println("");
    }
}

class Shining{
    public static void main(String [] args){
        for(int x = 0; x<10; x++){
            System.out.println("All work and no play makes jack a dull boy.");
        }
    }
}