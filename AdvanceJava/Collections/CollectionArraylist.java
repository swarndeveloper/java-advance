package AdvanceJava.Collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionArraylist {

    public static void main(String[] args) {

        List<Integer> students = new ArrayList<Integer>();
        students.add(19);
        students.add(1, 20);

        System.out.println(students);

        for (Integer integer : students) {
            System.out.println(integer);
        }


    }
}
