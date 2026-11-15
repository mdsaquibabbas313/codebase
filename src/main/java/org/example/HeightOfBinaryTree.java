package org.example;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class HeightOfBinaryTree {
    public static int heightOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0; // Node-based height (empty tree = 0)
        }

        int lstHeight = heightOfBinaryTree(root.left);
        int rstHeight = heightOfBinaryTree(root.right);

        return 1 + Math.max(lstHeight, rstHeight);
    }

    public static void main(String[] args) {
        // Constructing a sample binary tree:
        //       1
        //      / \
        //     2   3
        //    /
        //   4
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        int height = heightOfBinaryTree(root);
        System.out.println("Height of the binary tree: " + height); // Expected output: 3
    }
}