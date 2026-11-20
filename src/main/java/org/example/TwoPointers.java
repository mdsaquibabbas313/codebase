package org.example;

public class TwoPointers {
    public static void main(String[] args) {
        int[] arr = {2,5,6,57,67,99};
        int i = 0;
        int j = arr.length - 1;
        int[] ans = {-1 , -1};

        int target = 11;
        int sum = 0;
        boolean flag = false;
        while(i <= j) {
            sum = arr[i] + arr[j];
            if(sum == target) {
                flag = true;
                ans[0] = i;
                ans[1] = j;
                break;
            } else if(sum > target) {
                j--;
            }else {
                i++;
            }
        }
        System.out.println(flag);
        System.out.println("The ith ele is " + ans[0] + " The jth ele is " + ans[1]);
    }
}
