package org.example;

public class MoveZeroes {
    public static  void moveZeroes(int[] arr) {
        int i = 0 ;
        int n = arr.length;
        for(int j = 0 ; i<n && j<n ; j++) {
            if(arr[j] != 0) {
                //swap
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,0,0,2,5};
        moveZeroes(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
