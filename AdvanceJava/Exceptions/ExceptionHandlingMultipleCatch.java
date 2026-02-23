package AdvanceJava.Exceptions;

public class ExceptionHandlingMultipleCatch {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;

        int num[] = new int[4];

        try {
            j = 18 / i;
            System.out.println("The devision result is " + j);
            System.out.println("The value of 5th position is ->" + num[5]);
        } catch (ArithmeticException ae) {
            System.err.println("Error occoured in division rule.");
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.err.println("Exception on get out of bound array value.");
        } catch (Exception e) {
            System.err.println("Something went wrong!!!");
        }
        System.out.println("Bye");
    }
}
