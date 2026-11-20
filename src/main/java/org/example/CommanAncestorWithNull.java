package org.example;

public class CommanAncestorWithNull {
    // considering both p and q present in a tree
    private static TreeNode commanAncestor(TreeNode root , int p , int q){
        if(root == null) {
            return null;
        }

        if(root.val == p || root.val == q) {
            return root;
        }

        TreeNode lstCommanAncestor = commanAncestor(root.left , p , q);
        TreeNode rstCommanAncestor = commanAncestor(root.right , p , q);
        if(lstCommanAncestor == null) return rstCommanAncestor;
        else if(rstCommanAncestor == null) return lstCommanAncestor;
        else return root;
    }

    public static void main(String[] args) {
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
        TreeNode commanAncestorNode = commanAncestor(root , 11, 14);
        System.out.println("Comman Ancestor for p and q is : " + commanAncestorNode.val);



    }
}
