package com.daily_coding_problem.coding_problems.September;

import java.util.Arrays;

/*
 * Good morning! Here's your coding interview problem for today.
 * This problem was asked by Stripe.
 * Given an array of integers, 
 * find the first missing positive integer in linear time and constant space. 
 * In other words, find the lowest positive integer that does not exist in the array. 
 * The array can contain duplicates and negative numbers as well.
 * 
 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
 * You can modify the input array in-place.
 */
public class September29 {
    public static int getMinpositiveMissingNumber(int[] arr){
        int n = arr.length;
        int negative = n-1;
        System.out.println("Raw Array :" + Arrays.toString(arr));
        //Step 1: Remove negative numbers from the array
        for(int i=0; i<negative ;i++){
            if(arr[i] <= 0){
                //Swap numbers
                System.out.println("negative number : " + i + ", number : " + arr[i]);
                int temp = arr[i];
                arr[i] = arr[negative];
                arr[negative] = temp;
                negative --;
            }
        }
         n = negative + 1;
        System.out.println("After removing negative numbers : " + "negative : " + n + " Array:, " + Arrays.toString(arr));
        for(int i=0; i<n; i++){
            if(arr[i] > n || arr[i] == (i+1) || arr[i] <= 0) continue;
            System.out.println("index : " + i + ", val : " + arr[i]);
            int temp = arr[i];
            arr[i] = arr[arr[i]-1];
            arr[temp-1] = temp;
        }
        System.out.println("After updating places: " + Arrays.toString(arr));
        for(int i=0;i<n;i++){
            if(arr[i] != (i + 1))
                return (i+1);
        }
        return n+1;
    }    
    public static void main(String[] args){
        int[] list = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(September29.getMinpositiveMissingNumber(list));
    }
 
}
