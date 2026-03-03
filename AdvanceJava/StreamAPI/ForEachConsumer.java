package AdvanceJava.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachConsumer {

    public static void main(String[] args) {

        List<Integer> mylist = Arrays.asList(4, 6, 3, 2, 6, 1, 7);
        Stream<Integer> myStream = mylist.stream();
        Stream<Integer> myStreamEven =  myStream.filter(element -> element%2 == 0);
        int finalSum = myStreamEven.reduce(0 , (a,b) -> a+b);
         myStreamEven.forEach(t -> {
             System.out.println(t);
         });

    }

}
