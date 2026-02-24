package AdvanceJava.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionSet {

    public static void main(String[] args) {

      Set<Integer> students = new HashSet<>();
      students.add(10);
      students.add(20);
      students.add(20);

      for (Integer integer : students) {
        System.out.println(integer);
      }

    }
}
