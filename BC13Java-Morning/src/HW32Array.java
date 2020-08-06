public class HW32Array {
    public static void main(String[] args) {

        //Given an array of ints of odd length, return a new array length 3 containing the elements from
        // the middle of the array. The array length will be at least 3.
        int[] k1 = new int[]{1, 2, 3, 4, 5};
        int[] k2 = new int[]{8, 6, 7, 5, 3, 0, 9};
        int[] k3 = new int[]{1, 2, 3};
        myArrayPrint(midThree(k1));// → [2, 3, 4]
        myArrayPrint(midThree(k2));// → [7, 5, 3]
        myArrayPrint(midThree(k3));// → [1, 2, 3]



        // We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
        // Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
        int[] h1 = new int[]{1, 3, 4, 5};
        int[] h2 = new int[]{2, 1, 3, 4, 5};
        int[] h3 = new int[]{1, 1, 1};
        System.out.println(unlucky1(h1));// → true
        System.out.println(unlucky1(h2)); //→ true
        System.out.println(unlucky1(h3)); //→ false*/

        // Given an array of ints length 3, return the sum of all the elements.
        int[] g1 = new int[]{1, 2, 3};
        int[] g2 = new int[]{5, 11, 2};
        int[] g3 = new int[]{7, 0, 0};
        System.out.println(sum3(g1));// → 6
        System.out.println(sum3(g2));// → 18
        System.out.println(sum3(g3));// → 7*/

        //   Given an array of ints, return true if the array is length 1 or more,
        //   and the first element and the last element are equal.
        int[] f1 = new int[]{1, 2, 3};
        int[] f2 = new int[]{1, 2, 3, 1};
        int[] f3 = new int[]{1, 2, 1};
        int[] f4 = new int[0];
        System.out.println(sameFirstLast(f1)); // → false
        System.out.println(sameFirstLast(f2)); //→ true
        System.out.println(sameFirstLast(f3));// → true
        System.out.println(sameFirstLast(f4));// → false


        // Given an array of ints length 3, figure out which is larger, the first or last element in the array,
        // and set all the other elements to be that value. Return the changed array.
        int[] gf1 = new int[]{1, 2, 3};
        int[] gf2 = new int[]{11, 5, 9};
        int[] gf3 = new int[]{2, 11, 3};
        myArrayPrint(maxEnd3(gf1)); //→ [3, 3, 3]
        myArrayPrint(maxEnd3(gf2)); //→ [11, 11, 11]
        myArrayPrint(maxEnd3(gf3)); //→ [3, 3, 3]

    }

    private static int[] maxEnd3(int[] array) {
        if (array[0] > array[array.length - 1]) {
            array[1] = array[0];
            array[2] = array[0];
        } else if (array[0] < array[array.length - 1]) {
            array[0] = array[array.length - 1];
            array[1] = array[array.length - 1];
        }

        return array;
    }

    public static boolean sameFirstLast(int[] input) {
        return input.length >= 1 && input[0] == input[input.length - 1];
    }

    public static int sum3(int[] array) {
        return array[0] + array[1] + array[2];
    }

    public static boolean unlucky1(int[] input) {
        return (input[0] == 1 && input[1] == 3)
                || (input[input.length - 2] == 1 && input[input.length - 1] == 3)
                || (input[1] == 1 && input[2] == 3);
    }

    public static int[] midThree(int[] array) {
        int[] myArray = new int[3];
        int middle = array.length / 2;
        myArray[0] = array[middle - 1];
        myArray[1] = array[middle];
        myArray[2] = array[middle + 1];

        return myArray;
    }

    public static void myArrayPrint(int[] arrayToPrint) {
        System.out.println("Длина массива - " + arrayToPrint.length);
        for (int j : arrayToPrint) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
