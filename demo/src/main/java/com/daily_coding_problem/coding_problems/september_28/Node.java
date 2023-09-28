package com.daily_coding_problem.coding_problems.september_28;

import java.util.LinkedList;
import java.util.Queue;

public class Node {
    public String val;
    public Node left;
    public Node right;

    public Node(){}

    public Node(String val, Node left, Node right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public Node(String val){
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public Node(String val, Node left){
        this.val = val;
        this.left = left;
        this.right = null;
    }

    public static String serialize(Node root){
        //Store level order Traversal
        //Store nulls as #
        String result = "";
        Queue<Node> queue = new LinkedList<>();
        if(root != null){
            result += root.val;
            queue.add(root.left);
            queue.add(root.right);
        }
        while(!queue.isEmpty()){
            Node node = queue.remove();
            if(node != null){
                result += "," + node.val;
                queue.add(node.left);
                queue.add(node.right);
            } else {
                result += ",#";
            }
        }
        return result;
    }

    public static Node deSerialize(String serializedString){
        String[] nodes = serializedString.split(",");
        Node root = new Node(nodes[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while(!queue.isEmpty()){
            Node node = queue.remove();
            if(node != null){
                if(!nodes[i].equals("#")){
                    node.left = new Node(nodes[i]);
                    queue.add(node.left);
                }
                i++;
                if(!nodes[i].equals("#")){
                    node.right = new Node(nodes[i]);
                    queue.add(node.right);
                }
                i++;
            }
        }
        return root;
    }

}
