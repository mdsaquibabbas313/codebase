package org.example;

import java.util.Comparator;
import java.util.List;

public class Stream {
    public static void main(String[] args) {

        List<Integer> arr = List.of(99,99,78);

        int secondLargest = arr.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(-1);

        System.out.println("Second Largest from Stream : " + secondLargest);


    }
}
