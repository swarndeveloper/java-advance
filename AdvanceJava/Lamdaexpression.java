package AdvanceJava;

@FunctionalInterface
interface Calculator {
    int add(int a, int b);  
}

@FunctionalInterface
interface Display {
    void show();
}

@FunctionalInterface
interface MoreDisplay {
    void print(String message , int number);
}

public class Lamdaexpression {
    public static void main(String[] args) {
        // Lambda expression to implement the add method with annonymous inner class
        Calculator calculator = new Calculator() {
            public int add(int a, int b) {
                return a + b;
            }
        };
        int result = calculator.add(5, 10);
        System.out.println("The sum is: " + result);

        // Lambda expression to implement the add method using lambda syntax
        Display display = () -> System.out.println("Message: " );
        display.show();

        // Lambda expression to implement the add method using lambda syntax with parameters
        MoreDisplay moreDisplay = (message, number) -> 
            System.out.println("Message: " + message + ", Number: " + number);
        moreDisplay.print("Lambda with two parameters", 42);
    }
    
}
