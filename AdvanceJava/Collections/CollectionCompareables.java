package AdvanceJava.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements Comparable<Students> {

    int marks;
    String name;

    public Students(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students [marks=" + marks + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Students o) {
        if (this.marks < o.marks) {
            return -1;
        } else if (this.marks > o.marks) {
            return 1;
        } else {
            return 0;
        }
    }

}

public class CollectionCompareables {
    public static void main(String[] args) {

        List<Students> students = new ArrayList<Students>();
        students.add(new Students(20, "Swarn"));
        students.add(new Students(18, "Sohan"));
        students.add(new Students(5, "Anasua"));

        Collections.sort(students);

        System.out.println(students.toString());
    }

}
