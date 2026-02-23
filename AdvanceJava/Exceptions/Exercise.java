package AdvanceJava.Exceptions;

// TODO: Define custom exception InvalidAgeException extending Exception

  class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
       super(message);
    }
}

public class Exercise {
    
  
    
    public static void checkAge(int age) throws InvalidAgeException {
        // TODO: Throw custom exception if age < 18, else print "Access granted"
        if(age < 18) {
            throw new InvalidAgeException("Below 18 is not allowed!");
        } else {
            System.out.println("Access granted");
        }
        
    }
    
    public static void main(String[] args) {
        // TODO: Call checkAge(16) and checkAge(21) inside separate try-catch blocks
        
        try {
            Exercise.checkAge(16);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        try {
            Exercise.checkAge(21);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
    }

}

