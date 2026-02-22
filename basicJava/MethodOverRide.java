package basicJava;
public class MethodOverRide {
    public static void main(String[] args) {
        System.out.println("Method Overriding Example");

        NewCalAdv calc = new NewCalAdv();
        int result = calc.add(5, 10); // Calls the overridden method
        System.out.println("Result of addition: " + result);
    }
}

class NewCal {
    int add(int a, int b) {
        return a + b;
    }
}

class NewCalAdv extends NewCal {
    // Overriding the add method to add three numbers
    int add(int a, int b) {
        return a + b + 1;
    }
}
