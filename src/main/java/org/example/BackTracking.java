package org.example;

import java.util.Scanner;

/*
 * Problem Statement:
 * Given an integer n, generate and print all possible arrays of length n
 * using only the digits 1 and 2, using backtracking.
 */
public class BackTracking {

    public static void printArray(int[] arr){
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void generateNumber(int n, int currIdx, int[] currArr) {

        if(currIdx == n) {
            printArray(currArr);
            return;
        }

        // generate from 1
        currArr[currIdx] = 1;
        generateNumber(n, currIdx + 1, currArr);

        // generate from 2
        currArr[currIdx] = 2;
        generateNumber(n, currIdx + 1, currArr);
    }

    public static void main(String[] args) {
//        int N = 3;
//        int[] arr = new int[N]; // Initialized the array with size N

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of digits to be formed : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        generateNumber(n, 0, arr);
/*
        1 1 1
        1 1 2
        1 2 1
        1 2 2
        2 1 1
        2 1 2
        2 2 1
        2 2 2

        Process finished with exit code 0
 */
    }
}