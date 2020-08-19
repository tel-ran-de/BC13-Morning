package myFirstSort;

import java.util.Arrays;

public class CocktailSort {
    public static void main(String[] args) {
        int[] array = createArray(10);
        int[] newArray = myNewCopyArray(array);
        System.out.println("Оригинал массива " + Arrays.toString(array));
        System.out.println("Копия массива " + Arrays.toString(newArray));
        System.out.println("Коктейльная сортировка " + Arrays.toString(cocktailSort(newArray)));
    }

    private static int[] cocktailSort(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            boolean swapped = false;
            for (int j = start; j < end; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            end--;
            for (int k = end; k > start; k--) {
                if (array[k] < array[k - 1]) {
                    int temp = array[k - 1];
                    array[k - 1] = array[k];
                    array[k] = temp;
                    swapped = true;
                }
            }
            start++;
            if (!swapped) {
                break;
            }
        }
        return array;
    }

    private static int[] myNewCopyArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    private static int[] createArray(int length) {
        int[] myArray = new int[length];
        for (int i = 0; i < length; i++) {
            myArray[i] = (int) (Math.random() * 100);
        }
        return myArray;
    }
}