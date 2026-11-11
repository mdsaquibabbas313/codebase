package org.example;

public class SOD {
//    public static int sod(int n) {
//        if(n <= 0){
//            return 0;
//        }
//        int last_digit = n%10;
//        return last_digit + sod(n/10);
//    }
    public static void main(String[] args) {

        int n = 5552;
        int sod = 0;
        while(n != 0) {
            int digit = n % 10;
            sod += digit;
            n = n / 10;
        }

        System.out.println(sod);

    }
}
