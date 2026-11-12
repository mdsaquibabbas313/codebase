package org.example;

import java.util.ArrayList;

public class CountSubsetSumEqualK {
    static int count = 0;
//    public static void countSubsetSumEqualK(int[] arr ,int currIdx, int k , ArrayList<Integer> temp) {
//        if(currIdx == arr.length) {
//            int sum = 0 ;
//            for(Integer i : temp) {
//                sum += i;
//            }
//            if(sum == k) count++;
//            return ;
//        }
//
//        // make subset
//        temp.add(arr[currIdx]);
//        //explore
//        countSubsetSumEqualK(arr , currIdx + 1 , k , temp);
//        //pop
//        temp.remove(temp.size() - 1);
//
//        countSubsetSumEqualK(arr , currIdx + 1 , k , temp);
//
//    }

    public static void countSubsetSumEqualK(int[] arr , int idx , int k , int sum) {

        if(idx >= arr.length){
            if(sum == k) {
                count++;
            }
            return ;
        }
        // non-take
        countSubsetSumEqualK(arr , idx+1 , k , sum);

        // take
        sum += arr[idx];
        countSubsetSumEqualK(arr , idx+1 , k , sum);

    }

    public static void main(String[] args) {
        count = 0;
        int[] arr = {5,2,7};
        int k = 7;
        ArrayList<Integer> temp = new ArrayList<>();

        countSubsetSumEqualK(arr ,0, k , 0);

        System.out.println("Count of subset with sum k : " + count);

    }
}
