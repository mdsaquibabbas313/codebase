package org.example;

import java.util.Scanner;

public class BackTracking2 {

    public static void printArray(int[] arr){
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void generateNumber(int n, int currIdx, int[] currArr) {

        // Base case: if the array/number of length n is filled, print it
        if(currIdx == n) {
            printArray(currArr);
            return;
        }

        // Loop through the allowed choices: {1, 2, 3, 4, 5}
        for(int i = 1; i <= 5; i++) {
            currArr[currIdx] = i;                     // Choose
            generateNumber(n, currIdx + 1, currArr);  // Explore
            // Backtrack implicitly happens on the next loop iteration when currArr[currIdx] is overwritten
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of digits to be formed (n): ");
        n = sc.nextInt();

        int[] arr = new int[n];
        generateNumber(n, 0, arr);
    }
}