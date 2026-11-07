package org.example;

public class MaxAverageSubarray {

    public static double findMaxAverage(int[] nums, int k) {
        // Your implementation goes here
        int i = 0 ;
        int j = 0;
        int n = nums.length;
//        double mx = -Double.MAX_VALUE;
        double mx = Double.MIN_VALUE;
        int sum = 0;
        while(j < k) {
            sum += nums[j];
            j++;
        }
        double avg = (double) sum / n;
        mx = Math.max(avg , mx);

        while(j < n) {
            sum = sum + nums[j];
            sum = sum - nums[i];
            i++;
            j++;

            avg = (double) sum / k;
            mx = Math.max(mx , avg);
        }

        return mx;
    }
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double result = findMaxAverage(nums, k);
        System.out.println("Max average: " + result);
    }
}
