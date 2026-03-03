package AdvanceJava.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Students {

    String name;
    int age;

    public Students(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students [name=" + name + ", age=" + age + "]";
    }

}

public class ConstructorRef {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Swarnendu", "Sohan", "Anasua");
        List<Students> studentList = names.stream().map(Students::new).toList();
        studentList.forEach(System.out::println);
    }
}
