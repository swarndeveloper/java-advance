package AdvanceJava.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamExplanation {

    public static void main(String[] args) {

        List<Integer> mylist = Arrays.asList(4, 6, 3, 2, 6, 1, 7);

        Predicate<Integer> pr = new Predicate<Integer>() {
            public boolean test(Integer t) {
                return t % 2 == 0;
            }
        };

        int finalSum = mylist.stream()
                .filter(pr)
                .reduce(0, (a, b) -> a + b);

        System.out.println(finalSum);

    }

}
