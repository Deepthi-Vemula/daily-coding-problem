package com.daily_coding_problem.coding_problems.September.september_28;
/*
 * This problem was asked by Google.
 * Given the root to a binary tree, implement 
 * serialize(root), which serializes the tree into a string, and
 * deserialize(s), which deserializes the string back into the tree.
 * 
 * For example, given the following Node class
 * 
  class Node:
    def __init__(self, val, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

* The following test should pass:
    node = Node('root', Node('left', Node('left.left')), Node('right'))
    assert deserialize(serialize(node)).left.left.val == 'left.left'
 */

public class September28 {  
    public String serializeString(Node root){
        String val = Node.serialize(root);
        return val;
    }

    public Node deserialize(String serializedString){
        return Node.deSerialize(serializedString);
    }
}
