package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.print('\u00AE');
        char chr = 'A';
        System.out.print(chr);

        double a = 20;
        double b = 80;
        double c = (a+ b)*25;
        double reminder = c%40;

        if(reminder<=20)
        {
            System.out.print("Total");
        }
    }
}
