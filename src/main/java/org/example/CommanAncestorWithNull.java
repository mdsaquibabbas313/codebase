package org.example;

public class CommanAncestorWithNull {
    // considering both p and q present in a tree
    private static TreeNode findLCA(TreeNode root , int p , int q){
        if(root == null) {
            return null;
        }

        if(root.val == p || root.val == q) {
            return root;
        }

        TreeNode lstCommanAncestor = findLCA(root.left , p , q);
        TreeNode rstCommanAncestor = findLCA(root.right , p , q);
        if(lstCommanAncestor == null) return rstCommanAncestor;
        else if(rstCommanAncestor == null) return lstCommanAncestor;
        else return root;
    }

    private static boolean exists(TreeNode root , int target){
        if(root == null) return false;

        if(root.val == target) return true;

        return exists(root.left , target) || exists(root.right , target);

    }

    private static TreeNode commanLCA(TreeNode root, int p , int q) {
        if(!exists(root, p) || !exists(root, q)) {
            return null;
        }

        return findLCA(root,p,q);
    }

    public static void main(String[] args) {

        // TODO : need to write element exist logic
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(8);
        root.left.left = new TreeNode(12);
        root.left.right = new TreeNode(14);
        root.right = new TreeNode(9);
        root.right.right = new TreeNode(11);

        // case 1 : p = 8 , q = 11 CA = 5
        // case 2 : p = 8 , q = 14 CA = 8
        // case 3 : p = 10 , q = 11 CA = null
        // case 4 : p = 100 , q = 101 CA = null
        TreeNode commanAncestorNode = commanLCA(root , 10, 11);
        if(commanAncestorNode == null) {
            System.out.println("null");
        }else
            System.out.println(commanAncestorNode);



    }
}
