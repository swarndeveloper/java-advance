package AdvanceJava.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionComparetor {
    public static void main(String[] args) {

        List<String> studentNames = new ArrayList<String>();
        studentNames.add("Sohan Ghosh");
        studentNames.add("Anasua Chatterjee");
        studentNames.add("Swarnendu Ghosh");

        Collections.sort(studentNames, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Return a negative, zero, or positive integer
                // based on the difference in lengths
                if (s1.length() < s2.length()) {
                    return -1;
                } else if (s1.length() > s2.length()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(studentNames);
    }

}
