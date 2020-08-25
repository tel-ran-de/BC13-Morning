import java.util.Arrays;
// Создать случайный массив char (желательно из одного алфавита, например китайского, греческого, грузинского и тд) длиной N.
// Вывести его на экран.
// Отсортировать его КОПИЮ пузырьковой сортировкой.
// Вывести его на экран.
// отсортировать КОПИЮ первоначальныого массива коктейльной сортировкой.
// Вывести его на экран.
// отсортировать КОПИЮ первоначальныого массива сортировкой расчёской.

public class HW46 {
    public static void main(String[] args) {
        char[] array = createCharArray(32, 1040, 1071); // кириллический алфавит
        System.out.println("Главаный массив " + Arrays.toString(array));
        char[] copyArray = copyArray(array);
        System.out.println("Пузырьковая сортировка " + Arrays.toString(bubbleSortArray(copyArray)));
        System.out.println("Коктельная сортировка " + Arrays.toString(cocktailSort(copyArray)));
        System.out.println("Сортировка расчёской " + Arrays.toString(combSort(copyArray)));
    }

    public static char[] createCharArray(int n, int min, int max) {
        char[] array = new char[n];
        for (int i = 0; i < n; i++) {
            array[i] = (char) (Math.random() * ((max - min) + 1) + min);
        }
        return array;
    }

    public static char[] copyArray(char[] array) {
        char[] copyArray = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];
        }
        return array;
    }

    public static char[] bubbleSortArray(char[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            char temp = ' ';
            if (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            bubbleSortArray(array);
        }
        return array;
    }

    public static char[] cocktailSort(char[] copy) {
        int anfang = 0;
        int ende = copy.length - 1;
        while (anfang <= ende) {
            boolean sort = false;
            for (int i = anfang; i < ende; i++) {
                if (copy[i] > copy[i + 1]) {
                    char temp = copy[i];
                    copy[i] = copy[i + 1];
                    copy[i + 1] = temp;
                    sort = true;
                }
            }
            ende--;
            for (int i = ende; i > anfang; i--) {
                if (copy[i] < copy[i - 1]) {
                    char temp = copy[i];
                    copy[i] = copy[i - 1];
                    copy[i - 1] = temp;
                    sort = true;
                }
            }
            anfang++;
            if (!sort) break;
        }
        return copy;
    }

    public static char[] combSort(char[] array) {
        double factor = 1.24733095;
        int step = array.length;
        if (step > 1) {
            step = (int) (step / factor);
            for (int i = 0; step + i < array.length; i++) {
                if (array[i] > array[i + step]) {
                    char temp = array[i];
                    array[i] = array[i + step];
                    array[i + step] = temp;
                }
            }
        }
        return array;
    }
}
