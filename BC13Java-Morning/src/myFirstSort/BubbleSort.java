package myFirstSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = createArray(10);
        String output = Arrays.toString(array);
        System.out.println(output);
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
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
            bubbleSort(array);
        }
    }
    
    private static int[] createArray(int n) {
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            output[i] = (int) (Math.random() * 100);
        }
        return output;
    }
}
