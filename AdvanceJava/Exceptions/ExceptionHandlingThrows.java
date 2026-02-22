package AdvanceJava.Exceptions;

class ExceptionValidation {
    void show() throws ClassNotFoundException {
        Class.forName(  "ExceptionHandlingThrows"); 
        System.out.println("Class is loaded successfully.");
    }

}

public class ExceptionHandlingThrows {
    public static void main(String[] args) {
        ExceptionValidation ev = new ExceptionValidation();
        try {
            ev.show();
        } catch (ClassNotFoundException e) {
            System.out.println("We didn't recieved the class with the name.");
            e.printStackTrace();
        }
    }
}
