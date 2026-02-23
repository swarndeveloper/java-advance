package AdvanceJava.Exceptions;

public class ExceptionHandlingThrow {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        int num[] = new int[4];

        try {
            j = 18 / i;
            System.out.println("The devision result is " + j);
            //System.out.println("The value of 5th position is ->" + num[5]);
            if (j < 10) {
                throw new ArithmeticException();
            }
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
