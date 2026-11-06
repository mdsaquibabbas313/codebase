package org.example;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {

    public static String reverseVowels(String s) {
        // Write your logic here
        HashSet<Character> hs = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u','A' , 'E' , 'I' , 'O' , 'U'));
        char[] arr = s.toCharArray();
        int i = 0 , j = arr.length - 1;
        while(i <= j) {
            if(hs.contains(arr[i]) && hs.contains(arr[j])) {
                char t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }else if(hs.contains(arr[i])) {
                j--;
            }else{
                i++;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String input = "IceCreAm";
        String result = reverseVowels(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}