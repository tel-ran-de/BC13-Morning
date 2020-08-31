import java.util.Arrays;

public class HW51Array02Alex {
    public static void main(String[] args) {
        System.out.println("Мы ожидаем [0, 0, 1, 1]             => " + Arrays.toString(zeroFront(new int[]{1, 0, 0, 1})));
        System.out.println("Мы ожидаем [0, 0, 1, 1, 1]          => " + Arrays.toString(zeroFront(new int[]{0, 1, 1, 0, 1})));
        System.out.println("Мы ожидаем [0, 1]                   => " + Arrays.toString(zeroFront(new int[]{1, 0})));
        System.out.println("..............................................");
        System.out.println("Мы ожидаем [0, 0, 0, 1, 1, 1, 1]    => " + Arrays.toString(evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1})));
        System.out.println("Мы ожидаем [2, 3, 3]                => " + Arrays.toString(evenOdd(new int[]{3, 3, 2})));
        System.out.println("Мы ожидаем [2, 2, 2]                => " + Arrays.toString(evenOdd(new int[]{2, 2, 2})));

    }


    // Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros
    // are grouped at the start of the array. The order of the non-zero numbers does not matter.
    // So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.

    public static int[] zeroFront(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = array[count];
                array[count] = 0;
                count++;
            }
        }
        return array;
    }

    // Return an array that contains the exact same numbers as the given array, but rearranged so that all the
    // even numbers come before all the odd numbers. Other than that, the numbers can be in any order.
    // You may modify and return the given array, or make a new array.

    public static int[] evenOdd(int[] array) {
        int countSwap = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                countSwap++;
            }
        }
        if (countSwap > 0) {
            evenOdd(array);
        }
        return array;
    }
}
