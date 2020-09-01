package homework;

import java.util.Arrays;

public class Homework3108 {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 0, 0, 1};
        int[] a2 = new int[]{0, 1, 1, 0, 1};
        int[] a3 = new int[]{1, 0};
        System.out.println(Arrays.toString(zeroFront(a1)));
        System.out.println(Arrays.toString(zeroFront(a2)));
        System.out.println(Arrays.toString(zeroFront(a3)));
        int[] b1 = new int[]{1, 0, 1, 0, 0, 1, 1};
        int[] b2 = new int[]{3, 3, 2};
        int[] b3 = new int[]{2, 2, 2};
        System.out.println(Arrays.toString(evenOdd(b1))); // → [0, 0, 0, 1, 1, 1, 1]
        System.out.println(Arrays.toString(evenOdd(b2))); // → [2, 3, 3]
        System.out.println(Arrays.toString(evenOdd(b3))); // → [2, 2, 2]

    }

    public static int[] evenOdd(int[] b) {
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0) {
                int temp = b[i];
                b[i] = b[count];
                b[count] = temp;
                count++;
            }
        }
        return b;
    }

    public static int[] zeroFront(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = a[count];
                a[count] = 0;
                count++;
            }
        }
        return a;
    }
}

