import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] array = createCharArray(24);
        System.out.println("Созданный массив символов греческого алфавита: " + Arrays.toString(array));
        char[] copy = copyArray(array);
        System.out.println("Сортировка пузырьком: " + Arrays.toString(bubbleSortArray(copyArray(array))));
        System.out.println("Коктейльная сортировка: " + Arrays.toString(cocktailSortArray(copyArray(array))));
        System.out.println("Сортировкой расчёской: " + Arrays.toString(combSortArray(copyArray(array))));
    }

    private static char[] combSortArray(char[] array) {
        double stepConstant = 1.24733095;
        int step = array.length;
        while (step > 1) {
            step = (int) (step / stepConstant);
            for (int i = 0; step + i < array.length; i++) {
                if (array[i] > array[i + step]) {
                    swap(array, i, i + step);
                }
            }
        }
        return array;
    }

    public static void swap(char[] array, int x, int y) {
        char temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    private static char[] cocktailSortArray(char[] copy) {
        int start = 0;
        int end = copy.length - 1;
        while (start <= end) {
            boolean sorted = false;
            for (int j = start; j < end; j++) {
                if (copy[j] > copy[j + 1]) {
                    char temp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = temp;
                    sorted = true;
                }
            }
            end--;
            for (int k = end; k > start; k--) {
                if (copy[k] < copy[k - 1]) {
                    char temp = copy[k - 1];
                    copy[k - 1] = copy[k];
                    copy[k] = temp;
                    sorted = true;
                }
            }
            start++;
            if (!sorted) {
                break;
            }
        }
        return copy;
    }

    private static char[] bubbleSortArray(char[] myArray) {
        int count = 0;
        for (int i = 0; i < myArray.length - 1; i++) {
            char temp = ' ';
            if (myArray[i] > myArray[i + 1]) {
                temp = myArray[i];
                myArray[i] = myArray[i + 1];
                myArray[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            bubbleSortArray(myArray);
        }
        return myArray;
    }

    private static char[] copyArray(char[] myArray) {
        char[] copy = new char[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            copy[i] = myArray[i];
        }
        return myArray;
    }

    public static char[] createCharArray(int length) {
        char[] array = new char[length];
        for (int i = 0; i < length; i++) {
            array[i] = createChar(913, 937);
        }
        return array;
    }

    private static char createChar(int min, int max) {
        char newChar = (char) (Math.random() * ((max - min) + 1) + min);
        return newChar;

    }
}
