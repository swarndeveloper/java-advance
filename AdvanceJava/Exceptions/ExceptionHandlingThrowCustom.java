package AdvanceJava.Exceptions;

class CustomException extends Exception {
    CustomException(String str) {
        super(str);
    }
}

public class ExceptionHandlingThrowCustom {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        try {
            j = 118 / i;
            System.out.println("The devision result is " + j);
            // System.out.println("The value of 5th position is ->" + num[5]);
            if (j < 10) {
                throw new ArithmeticException();
            } else if (j < 20) {
                throw new CustomException("Below 20 value is also not allowed!");
            }
        } catch (CustomException ce) {
            System.err.println("Inside custom exception!" + ce);
        } catch (ArithmeticException ae) {
            System.err.println("Less than 10 value detected!");
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.err.println("Exception on get out of bound array value.");
        } catch (Exception e) {
            System.err.println("Something went wrong!!!");
        }
        System.out.println("Bye");
    }
}
