package AdvanceJava.Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputScanner {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number : ");
        InputStreamReader ip = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ip);

        try {
            int number = Integer.parseInt(bf.readLine());
            System.out.println("The entered number is : " + number);

        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            bf.close();
        }

    }
}
