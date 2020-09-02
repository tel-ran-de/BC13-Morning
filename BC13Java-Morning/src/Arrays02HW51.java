package arraySort;

import java.util.Arrays;

public class Arrays02HW51 {
    public static void main(String[] args) {
        int[] b1 = new int[]{1, 0, 0, 1};
        int[] b2 = new int[]{0, 1, 1, 0, 1};
        int[] b3 = new int[]{1, 0};
        System.out.println(Arrays.toString(zeroFront(b1))); //→ [0, 0, 1, 1]
        System.out.println(Arrays.toString(zeroFront(b2))); //→ [0, 0, 1, 1, 1]
        System.out.println(Arrays.toString(zeroFront(b3))); //→ [0, 1]
        System.out.println("----------");
        int[] c1 = new int[]{1, 0, 1, 0, 0, 1, 1};
        int[] c2 = new int[]{3, 3, 2};
        int[] c3 = new int[]{2, 2, 2};
        System.out.println(Arrays.toString(evenOdd(c1))); //→ [0, 0, 0, 1, 1, 1, 1]
        System.out.println(Arrays.toString(evenOdd(c2))); //→ [2, 3, 3]
        System.out.println(Arrays.toString(evenOdd(c3))); //→ [2, 2, 2]
    }

    private static int[] evenOdd(int[] input) {
        return Sorting.cocktailSort(input);
    }

    private static int[] zeroFront(int[] input) {
        return Sorting.cocktailSort(input);
    }
}
