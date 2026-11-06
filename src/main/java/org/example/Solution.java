package org.example;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        LocalDate date = LocalDate.parse("2026-11-06");

        System.out.println("Date of Initialization : " + date);

        LocalDate date2 = LocalDate.of(2026, 11, 6);

        System.out.println("Date of Initialization : " + date2);
    }
}