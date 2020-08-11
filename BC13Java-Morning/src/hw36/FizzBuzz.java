package hw36;

import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzbuzz(1, 6)));
        System.out.println();
        System.out.println(Arrays.toString(fizzbuzz(1, 32)));
        System.out.println();
        System.out.println(Arrays.toString(fizzbuzz(3, 7)));
        System.out.println();
    }

    private static String[] fizzbuzz(int min, int max) {
        String[] a = new String[max - min + 1];
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                a[i - min] = "Fizzbuzz";
            } else if (i % 3 == 0) {
                a[i - min] = "Fizz";
            } else if (i % 5 == 0) {
                a[i - min] = "Buzz";
            } else {
                a[i - min] = String.valueOf(i);
            }
        }
        return a;
    }

/*    private static void fizzbuzzOld() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }*/
}
