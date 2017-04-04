package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //int has width of 32
        //int myminvalue = 10000;

        //byte has width of 8
        //byte mybytevalue = 127;
        //could be more efficiency than int

        //short has width of 16
        //short yshortnumber = 32767;

        //long has width of 64
        //long mylongunumber = 100L;
        //must end with L or l

        byte bytevarible = 10;
        short shortvarible = 1000;
        int intvarible = 10000;
        long longvarible = (50000L + 10L * (bytevarible + intvarible + shortvarible));

        System.out.println("longvarible = " + longvarible);





    }
}
