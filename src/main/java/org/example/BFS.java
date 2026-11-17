package org.example;


import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void levelOrder(Queue<TreeNode> queue , TreeNode root){
        queue.offer(root);

        while(!queue.isEmpty()) {

            int size = queue.size();
            for(int i = 0 ; i<size ; i++) {
                TreeNode currNode = queue.poll();

                System.out.print(currNode.val + " ");

                if(currNode.left!=null) queue.offer(currNode.left);
                if(currNode.right!=null) queue.offer(currNode.right);
            }
            System.out.println();
        }
    }
    public static void printInOrder(TreeNode root){
        if(root == null) return;

        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }
    public static void main(String[] args) {

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(6);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(8);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(12);
        levelOrder(queue,root);
        printInOrder(root);
    }
}
