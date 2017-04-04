/**
 * Created by wangce on 2017/2/21.
 */

/*
Reverse digits of an integer.

        Example1: x = 123, return 321
        Example2: x = -123, return -321

思路：
给定一个数，如321。
先求它和10的余数，为1，将1存储。
然后求它和10的商；32
然后再求这个商的余数，为2； 将2存储。
然后求32和10的商；为3
然后再求3和10的余数，为3，将3储存。
最后求3和10的商 为0 程序结束。
*/

class Reverse_Interger {

    public static void main(String[] args) {

        reverse(0);


    }

    public static void reverse(int x) {

        int result = 0;
        if (x > 0) {
            while (x % 10 != 0) {
                result = x % 10;
                x = x / 10;
                System.out.print(result);

            }
        } else if(x<0){
            x = -x;
            System.out.print("-");
            while (x % 10 != 0) {
                result = x % 10;
                x = x / 10;
                System.out.print(result);
            }
        } else{
            System.out.print(0);
        }
    }
}