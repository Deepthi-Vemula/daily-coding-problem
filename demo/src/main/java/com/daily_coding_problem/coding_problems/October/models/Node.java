package com.daily_coding_problem.coding_problems.October.models;

public class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
        this.left  = null;
        this.right = null;
    }

    public boolean isUniValSubTree(Node root){
        if(root == null) 
            return true;
        if(root.left == null && root.right == null)
            return true;
        if(root.left != null && root.left.value != root.value)
            return false;
        if(root.right != null && root.right.value != root.value)
            return false;
        return isUniValSubTree(root.left) && isUniValSubTree(root.right);
    }
    public int countUniValSubTrees(Node root){
        if(root == null) 
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        int leftCount = countUniValSubTrees(root.left);
        int rightCount = countUniValSubTrees(root.right);
        if(((root.left != null && root.left.value == root.value && leftCount > 0) || root.left == null)
            && ((root.right != null && root.right.value == root.value && rightCount > 0) || root.right == null))
            return leftCount + rightCount + 1;

        return leftCount + rightCount;        
    }

}
