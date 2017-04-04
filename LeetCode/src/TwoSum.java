import java.util.Arrays;

/**
 * Created by wangce on 2017/2/21.
 */
/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        int x, y;
        int[] a = new int[2];
        //a = new int[2];

        for (x = 0; x < nums.length - 1; x++) {
            for (y = x + 1; y < nums.length; y++) {
                if (nums[x] + nums[y] == target) {
                    //int a [] = new int[2];
                    a[0] = x;
                    a[1] = y;
                }
            }
        }

        return a;
    }


    public static void main(String [] args){


        int b[] = {3,2,4};
        System.out.println(Arrays.toString((twoSum(b,6))));
    }
}

