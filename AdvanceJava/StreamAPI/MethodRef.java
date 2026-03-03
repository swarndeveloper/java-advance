package AdvanceJava.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class MethodRef {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Swarn", "Sohan", "Anasua");

        nameList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

}
