package org.example;

import java.util.ArrayList;

public class Subset {
    static ArrayList<ArrayList<Integer>> ans;

    public static void printArray(ArrayList<Integer> arr){
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void generateSubset(int[] arr, int currIdx, ArrayList<Integer> temp) {

        if(currIdx == arr.length) {
            // Fix: Create a new ArrayList copy of temp so changes during backtracking don't affect stored results
            ans.add(new ArrayList<>(temp));
            return;
        }

        // 1. Pick the current element
        temp.add(arr[currIdx]);
        generateSubset(arr, currIdx + 1, temp);

        // Backtrack (pop)
        temp.remove(temp.size() - 1);

        // 2. Do not pick (exclude) the current element
        generateSubset(arr, currIdx + 1, temp);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        // 1. Initialize the global ans list
        ans = new ArrayList<>();

        ArrayList<Integer> temp = new ArrayList<>();
        generateSubset(arr, 0, temp);

        // Print all subsets stored in ans
        System.out.println("All subsets: " + ans);
    }
}