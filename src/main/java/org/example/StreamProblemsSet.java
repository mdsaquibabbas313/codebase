package org.example;

import java.util.List;

public class StreamProblemsSet {

    public static void main(String[] args) {

        List<Integer> arr = List.of(2,3,4,5,6,7,8);

        List<Integer> list = arr.stream()
                .filter(val -> val % 2 != 0)
                .map(val -> val * val)
                .toList();

        for(Integer i : list)
            System.out.println("Square of Numbers " + i);

    }

}
