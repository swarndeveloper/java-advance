package AdvanceJava;

abstract class SampleClass {
    void show() {
        System.out.println("Inside the show method of SampleClass.");
    }
    abstract void display();
    abstract void print();
}
public class AnnonemousInnerClass {
    public static void main(String[] args) {
        SampleClass sample = new SampleClass() {
            void show() {
                System.out.println("Inside the overridden show method of Anonymous Inner Class.");
            }
            void display() {
                System.out.println("Implementation of abstract method display.");
            }
            void print() {
                System.out.println("Implementation of abstract method print.");
            }
        };
        sample.show();
        
    }
}
