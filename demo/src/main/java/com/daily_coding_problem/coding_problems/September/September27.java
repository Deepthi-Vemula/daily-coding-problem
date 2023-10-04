package com.daily_coding_problem.coding_problems.September;

/*
 * Given an array of integers, 
 * return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 * 
 * Follow-up: what if you can't use division?
 */
public class September27 {

    public int[] productOfAllNumbersExceptIndex(int[] list) {
        int[] result = new int[list.length];
        int[] leftPdt = new int[list.length];
        int[] rightPdt = new int[list.length];
        //populate Left to Right product array
        leftPdt[0] = list[0];
        for(int i = 1; i < list.length; i++) {
            leftPdt[i] = leftPdt[i-1] * list[i];
        }

        //populate Right to Left product array
        rightPdt[list.length-1] = list[list.length-1];
        for(int i = list.length-2; i >= 0; i--) {
            rightPdt[i] = rightPdt[i+1] * list[i];
        }
        result[0] = rightPdt[1];
        result[list.length-1] = leftPdt[list.length-2];
        //populate result array
        for(int i=1; i < list.length-1; i++){
            result[i] = leftPdt[i-1] * rightPdt[i+1];
        }
        return result;
        
    }
    
}
