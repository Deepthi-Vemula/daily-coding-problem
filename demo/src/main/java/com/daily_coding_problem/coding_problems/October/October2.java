package com.daily_coding_problem.coding_problems.October;

import java.util.HashMap;
import java.util.Map;

/*
 * Good morning! Here's your coding interview problem for today.
 * This problem was asked by Facebook.
 * Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
 * For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
 * You can assume that the messages are decodable. For example, '001' is not allowed.
 */
public class October2 {
    public int countWaysToDecode(String message, int i){
        // Let's assume the mapping is a = 1, b = 2, ... z = 26
        int n = message.length(); 
        
        //Base Condition
        if(i >= n-1) return 1;

        //Loop condition
        int s1 = message.charAt(0) - '0';
        int s2 = Integer.parseInt(message.substring(i, i+2));
        System.out.println("s1: " + s1 + " s2: " + s2);
        int numWays = 0;
        if(1 <= s1 && s1 <= 9)
            numWays+= countWaysToDecode(message, i+1);
        if(1 <= s2 && s2 <= 26)
            numWays += countWaysToDecode(message, i+2);
        System.out.println("n: " + n + " i: " + i);
        System.out.println("\tnumWays: " + numWays);
        return numWays;
    }

    public static void main(String[] args) {
        October2 october2 = new October2();
        int result = october2.countWaysToDecode("111", 0);
        System.out.println("Result: " + result);
    }

}
