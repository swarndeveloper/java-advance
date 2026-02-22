package basicJava;
public class SuperThisConcept {
    public static void main(String[] args) {
        System.out.println("This is a placeholder for SuperThisConcept.");
        Child child1 = new Child();
    }
}

class Parent extends Object {
    
    public Parent() {
        System.out.println("Parent class constructor called.");
    }

    public Parent(String message) {
        System.out.println("Parent class parameterized constructor called with message: " + message);
    }

}

class Child extends Parent {
    
    public Child() {
        super("Hello from Child"); // Calling parent constructor with a message
        System.out.println("Child class constructor");
    }

    public Child(String message) {
        super(message); // Calling parent constructor with a message
        System.out.println("Child class parameterized constructor called with message: " + message);
    }
}
