package com.daily_coding_problem.coding_problems.September;
import org.omg.CORBA.IntHolder;
import org.testng.internal.collections.Pair;

/*
 * Good morning! Here's your coding interview problem for today.
 * This problem was asked by Jane Street.
 * cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. 
 * For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
 * 
 * Given this implementation of cons:
 * def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair
 * Implement car and cdr.
 */


public class September30 {
    public Pair<Integer, Integer> cons(int a, int b){
        Pair<Integer, Integer> ans = new Pair<Integer, Integer>(Integer.valueOf(a),Integer.valueOf(b));
        return ans;
    }
    public int car(Pair<Integer, Integer> pair){
        int val = pair.first().intValue();
        return val;

    }
    public int cdr(Pair<Integer, Integer> pair){
        int val = pair.second().intValue();
        return val;

    }

}
