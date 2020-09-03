import java.util.Arrays;

    public class HW51_Arrays02_Exercises_33_34 {
        public static void main(String[] args) {
            System.out.println(Arrays.toString(zeroFront(new int[]{1, 0, 0, 1})));// → [0, 0, 1, 1]
            System.out.println(Arrays.toString(zeroFront(new int[]{0, 1, 1, 0, 1})));// → [0, 0, 1, 1, 1]
            System.out.println(Arrays.toString(zeroFront(new int[]{1, 0})));// → [0, 1]
            System.out.println();

            System.out.println(Arrays.toString(evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1})));// → [0, 0, 0, 1, 1, 1, 1]
            System.out.println(Arrays.toString(evenOdd(new int[]{3, 3, 2})));// → [2, 3, 3]
            System.out.println(Arrays.toString(evenOdd(new int[]{2, 2, 2})));// → [2, 2, 2]
        }

        //Exercises Arrays_02 Exercise 34 - bubblesort
        public static int[] evenOdd(int[] input) {
            boolean unsorted = true;
            while (unsorted) {
                unsorted = false;
                for (int i = 0; i < input.length - 1; i++) {
                    if (input[i] % 2 != 0 && input[i + 1] % 2 == 0) {
                        int temp = input[i + 1];
                        input[i + 1] = input[i];
                        input[i] = temp;
                        unsorted = true;
                    }
                }
            }
            return input;
        }

        //Exercises Arrays_02 Exercise 33 - bubblesort
        public static int[] zeroFront(int[] input) {
            boolean unsorted = true;
            while (unsorted) {
                unsorted = false;
                for (int i = 0; i < input.length - 1; i++) {
                    if (input[i] != 0 && input[i + 1] == 0) {
                        input[i + 1] = input[i];
                        input[i] = 0;
                        unsorted = true;
                    }
                }
            }
            return input;
        }
}
