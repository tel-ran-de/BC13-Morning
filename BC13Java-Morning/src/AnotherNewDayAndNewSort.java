import java.util.Arrays;

public class AnotherNewDayAndNewSort {
    public static void main(String[] args) {
        // int k =  v
        // int k =  value
        // int n =  k
        // key -> value
        int[] array = {22, 100, 55, 33, 88, 7};
        System.out.println(Arrays.toString(insertionSort(array)));
    }
    private static int[] insertionSort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int newElement = input[i];  // временная переменная, которая хранит значение
            // цикл начался не с нуля, а с единицы. Location предыдущее место от элемента массива.
            int location = i - 1;
            // Пока значение от ЛОКАШИОН больше значения элемента в проверке
            while (location >= 0 && input[location] > newElement) {
                // присвоить значение на котором БЫЛ элемент проверки значения предыдущего
                input[location + 1] = input[location];
                location = location - 1;  // декрементация локашион
            }
            input[location+1] = newElement; // значению LOCATION +1 ПЕРЕДАЁМ значение из памяти
        }
        return input;
    }
}
