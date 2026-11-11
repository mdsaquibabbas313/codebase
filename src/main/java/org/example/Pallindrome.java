package org.example;

public class Pallindrome {

    public static boolean isPallindrome(String s , int i , int j) {

        if(j <= i) return true;

        if(s.charAt(i) == s.charAt(j)) {
            return isPallindrome(s , i+1 , j - 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "abba";
        int i = 0;
        int j = s.length() - 1;

        System.out.println(isPallindrome(s , i , j));
    }
}
