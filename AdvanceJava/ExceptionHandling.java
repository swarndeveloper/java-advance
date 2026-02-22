package AdvanceJava;

class LessThanValueException extends Exception {
    public LessThanValueException(String message) {
       super(message);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 13;
        int result = 0;

        try {
            result = a / b;
            if(result == 0) {
                throw new LessThanValueException("Swarn created exception.");
            }
        } catch (LessThanValueException le) {
            System.out.println("The number is devided by a greater number value."+ le);
        } catch (ArithmeticException ae) {
            System.err.println(" Arithmatic exeption found. Cann't devide by Zero "+ ae);
        }  catch (Exception e) {
            System.out.println("Simple Exception "+e);
        }
        System.out.println("Executed! The result is ::: "+result);
    }
}
