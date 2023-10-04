package com.daily_coding_problem.coding_problems.September;

import java.util.Arrays;

/* 
*This problem was recently asked by Google.
*Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
*For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
*Bonus: Can you do this in one pass? 
*/
public class September26 {
    public boolean checkSumInList(int k, int[] list) {
        Arrays.sort(list);
        int left = 0;
        int right = list.length-1;
        while(left < right) {
            if(list[left] + list[right] == k) {
                return true;
            } else if(list[left] + list[right] < k) {
                left++;
            } else {
                right--;
            }
        }
        return false;
        
    }
}
