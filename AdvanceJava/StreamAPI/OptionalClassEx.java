package AdvanceJava.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClassEx {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Sohan", "Swarn", "Anasua");

        String name = nameList.stream()
                .filter(element -> element.contains("w"))
                .findFirst()
                .orElse("No Data Found");

        Optional<String> optionalString = nameList.stream()
                .filter(element -> element.contains("w"))
                .findFirst();

        System.out.println(optionalString.orElse("No data found"));
    }
}
