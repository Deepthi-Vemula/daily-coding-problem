package com.daily_coding_problem.coding_problems.October;

import com.daily_coding_problem.coding_problems.October.models.Node;

/*
 * Good morning! Here's your coding interview problem for today.
 * This problem was asked by Google.
 * A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.
 * Given the root to a binary tree, count the number of unival subtrees.
 * For example, the following tree has 5 unival subtrees:

   0
  / \
 1   0
    / \
   1   0
  / \
 1   1

 */
public class October3 {
    private int count = 0;
    public boolean solve(Node root){
        if(root == null) 
            return true;
        if(root.left == null && root.right == null){
            count++;
            return true;
        }
        boolean left = solve(root.left);
        boolean right = solve(root.right);
        if((root.left != null && root.left.value != root.value) || !left)
            return false;
        if((root.right != null && root.right.value != root.value) || !right)
            return false;
        count++;
        return true; 
    }

    public int countUniValSubTrees(Node root){
        if(root == null) 
            return 0;
        solve(root);
        return count;
    }
}
