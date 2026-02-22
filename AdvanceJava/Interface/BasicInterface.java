package AdvanceJava.Interface;

interface InnerBasicInterface {
    void display();
    void print();
    final int VALUE = 100;
}

class InnerInterfaceImplementation implements InnerBasicInterface {
    @Override
    public void display() {
        System.out.println("Implementation of display method.");
    }

    @Override
    public void print() {
        System.out.println("Implementation of print method.");
    }
}
public class BasicInterface {
    public static void main(String[] args) {
        System.out.println("This is a placeholder for BasicInterface class.");
        InnerBasicInterface instance = new InnerInterfaceImplementation();
        instance.display();
        instance.print();
    }
}
