package AdvanceJava.StreamAPI;

import java.util.*;
import java.util.stream.*;

public class Exercise {
    public static void main(String[] args) {

        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");

        // TODO: Print the original list
        //products.forEach(System.out::println);
        System.out.println("Original List: "+products);

        // TODO: Filter names longer than 5 characters, convert to uppercase, sort, and
        // collect into a list
        List<String> updatedProducts = products.stream().filter(element -> element.length() > 5)
                .map(String::toUpperCase).sorted().toList();

        // TODO: Print the filtered list
        //updatedProducts.forEach(System.out::println);
        System.out.println("Filtered Products: "+updatedProducts);
    }
}
