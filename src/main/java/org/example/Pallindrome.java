package org.example;

public class Pallindrome {

//    public static boolean isPallindrome(String s , int i , int j) {
//
//        if(j <= i) return true;
//
//        if(s.charAt(i) == s.charAt(j)) {
//            return isPallindrome(s , i+1 , j - 1);
//        } else {
//            return false;
//        }
//    }

    public static void main(String[] args) {
        String s = "abbca";
        int i = 0;
        int j = s.length() - 1;
        boolean flag = false;
        while(i <= j) {
            if(s.charAt(i) != s.charAt(j)) {
                flag = true;
                System.out.println("String is not pallindrome");
                break;
            }else{
                i++;
                j--;
            }
        }
        if(!flag)
            System.out.println("String is Pallindrome");
    }
}
