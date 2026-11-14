package org.example;

import java.util.List;

public class StreamProblemsSet {

    public static void main(String[] args) {

        List<Integer> arr = List.of(2,3,4,5,6,7,8);

        Integer maxNum = arr.stream()
                .filter(e -> e % 2 == 0)
                        .max((a , b) ->
                                {
                                  if(a > b) {
                                      return 1;
                                  } else if(a < b) {
                                      return -1;
                                  } else {
                                      return 0;
                                  }
                                }
                                ).orElse(-1);

        System.out.println(maxNum);

//        List<Integer> list = arr.stream()
//                .filter(val -> val % 2 != 0)
//                .map(val -> val * val)
//                .toList();


    }

}
