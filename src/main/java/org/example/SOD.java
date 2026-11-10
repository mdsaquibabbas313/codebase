package org.example;

public class SOD {
    public static int sod(int n) {
        if(n <= 0){
            return 0;
        }
        int last_digit = n%10;
        return last_digit + sod(n/10);
    }
    public static void main(String[] args) {
        int sod = sod(5555);
        System.out.println(sod);
    }
}
