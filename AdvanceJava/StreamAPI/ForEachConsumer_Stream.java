package AdvanceJava.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForEachConsumer_Stream {

    public static void main(String[] args) {

        List<Integer> mylist = Arrays.asList(4, 6, 3, 2, 6, 1, 7);

        int finalSum = mylist.stream()
                .filter(element -> element % 2 == 0)
                .reduce(0, (a, b) -> a + b);

        System.out.println(finalSum);

    }

}
