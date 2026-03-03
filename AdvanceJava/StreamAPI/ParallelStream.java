package AdvanceJava.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ParallelStream {

    public static void main(String[] args) {
        int size = 10_000_000;
        ArrayList<Integer> nums = new ArrayList<>();
        Random ran = new Random();

        for (int i = 0; i < size; i++) {
            nums.add(ran.nextInt(100));
        }

        long stmStart = System.currentTimeMillis();
        int sum1 = nums.stream().map(num -> num * 2).reduce(0, (c, e) -> c + e);
        long stmEnd = System.currentTimeMillis();
        System.out.println(sum1);
        System.out.println("Stream time taken "+ ( stmEnd - stmStart) + " ms");
        
        long stmPlStart = System.currentTimeMillis();
        int sum2 = nums.parallelStream().map(num -> num * 2).reduce(0, (c, e) -> c + e);
        long stmPlEnd = System.currentTimeMillis();
        System.out.println(sum2);
        System.out.println("Stream pl time taken "+ ( stmPlEnd - stmPlStart) + " ms");
    }

}
