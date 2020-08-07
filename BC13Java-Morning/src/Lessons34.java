import java.util.Arrays;

public class Lessons34 {
    public static void main(String[] args) {
       /* int[] a1 = new int[]{4, 5, 6};
        int[] a2 = new int[]{1, 2};
        int[] a3 = new int[]{3};
        System.out.println(Arrays.toString(makeLast(a1)));
        System.out.println(Arrays.toString(makeLast(a2)));
        System.out.println(Arrays.toString(makeLast(a3)));*/
        /*int[] b1 = new int[]{1, 2, 3};
        int[] b2 = new int[]{1, 3};
        int[] c1 = new int[]{7, 2, 3};
        int[] c2 = new int[]{1};
        int[] d1 = new int[]{1, 2};
        int[] d2 = new int[]{};
        System.out.println(start1(b1, b2));  // → 2
        System.out.println(start1(c1, c2));  //→  1
        System.out.println(start1(d1, d2));  //→ 1*/
        int[] a1 = new int[]{1, 2};
        int[] a2 = new int[]{3, 4};
        int[] b1 = new int[]{4, 4};
        int[] b2 = new int[]{2, 2};
        int[] c1 = new int[]{9, 2};
        int[] c2 = new int[]{3, 4};
        System.out.println(Arrays.toString(plusTwo(a1, a2))); //→ [1, 2, 3, 4]
        System.out.println(Arrays.toString(plusTwo(b1, b2))); //→ [1, 2, 3, 4]
        System.out.println(Arrays.toString(plusTwo(c1, c2))); //→ [1, 2, 3, 4]

    }

    public static int[] plusTwo(int[] a, int[] b) {
        int[] output = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            output[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            output[i + a.length] = b[i];
        }
        return output;
    }

    /*16. Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.*/
    public static int[] plusTwoSimple(int[] a, int[] b) {
        int[] output = new int[4];
        output[0] = a[0];
        output[1] = a[1];
        output[2] = b[0];
        output[3] = b[1];
        return output;
    }

    /* 15. Start with 2 int arrays, a and b, of any length.
    Return how many of the arrays have 1 as their first element.*/
    public static int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            count = count + 1;
        }
        if (b.length > 0 && b[0] == 1) {
            count++;
        }

        return count;
    }

    /*14. Given an int array, return a new array with double the length where its last element is the same as the original array, and all
    the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.*/
    public static int[] makeLast(int[] array) {
        int[] output = new int[array.length * 2];
        output[output.length - 1] = array[array.length - 1];

        return output;
    }

}
