package AdvanceJava;

abstract class AbstractExample {
    abstract void display();
}

class InnerAbstractImplementation extends AbstractExample {
    @Override
    void display() {
        System.out.println("Implementation of abstract method.");
    }

    
}

public class AbstractImplementation {
    public static void main(String[] args) {
        System.out.println("Abstract class implementation example.");
        AbstractExample abstractExample = new InnerAbstractImplementation();
        abstractExample.display();
    }
}
