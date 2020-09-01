import java.util.Arrays;

public class HW46_ArrayCharSort {
    public static void main(String[] args) {
        char[] myArray = createArray(10);
        System.out.println("Исходный массив: " + Arrays.toString(myArray));
        char[] myArrayCopy1 = copyArray(myArray);
        //System.out.println("Копия массива:   " + Arrays.toString(myArrayCopy1));
        char[] mySortedArray = bubbleSort(myArrayCopy1);
        System.out.println("Bubblesort:      " + Arrays.toString(mySortedArray));
        char[] myArrayCopy2 = copyArray(myArray);
        char[] mySchackedArray = cocktailSort(myArrayCopy2);
        System.out.println("Cocktailsort:    " + Arrays.toString(mySchackedArray));
        char[] myArrayCopy3 = copyArray(myArray);
        char[] mycombedArray = combSort(myArrayCopy3);
        System.out.println("Combsort:        " + Arrays.toString(mycombedArray));
        //System.out.println("Исходный массив: " + Arrays.toString(myArray));
    }

    public static char[] combSort(char[] array) {
        int count = 0;
        final double INDEX = 1.3;
        int step = array.length;
        while (step > 1) {
            step = (int) (step / INDEX);
            for (int i = 0; i < array.length - step; i++) {
                if (array[i] > array[i + step]) {
                    char temp = array[i + step];
                    array[i + step] = array[i];
                    array[i] = temp;
                    count++;
                }
            }
        }
        return array;
    }

    public static char[] cocktailSort(char[] array) {
        //int count = 0;
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            boolean swapped = false;
            for (int i = start; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    char temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            end--;
            for (int i = end; i > start; i--) {
                if (array[i - 1] > array[i]) {
                    char temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            start++;
            //count++;
            if (!swapped) {
                break;
            }
        }
        return array;
    }

    public static char[] bubbleSort(char[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                char temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            bubbleSort(array);
        }
        return array;
    }

    public static char[] copyArray(char[] input) {
        char[] output = new char[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        return output;
    }

    public static char[] createArray(int n) {
        char[] output = new char[n];
        int m = "А".charAt(0);
        for (int i = 0; i < n; i++) {
            int index = (int) (m + n * Math.random());
            output[i] = (char) (index);
        }
        return output;
    }
}
