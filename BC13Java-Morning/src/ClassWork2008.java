import java.util.Arrays;

public class ClassWork2008 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {21, 22, 23, 24, 25};
        int[] c = united(a1, a2);
        //создание итогового массива
        //заполнить этот массив
        //перенести элементы из первого массива в итоговый
        //перенести элементы из второго массива в итоговый
        //распечатать
        System.out.println(Arrays.toString(c));
        int[] d = arraySum(a1, a2);
        System.out.println(Arrays.toString(d));
        int[] f= arrayMinus(a1, a2);
        System.out.println(Arrays.toString(f));
    }

    private static int[] arrayMinus(int[] a1, int[] a2) {
        int[] output = new int[a1.length];
        for (int i = 0; i < output.length; i++) {
            output[i] = a1[i] - a2[i];
        }
        return output;
    }

    private static int[] arraySum(int[] a1, int[] a2) {
        int[] output = new int[a1.length];
        for (int i = 0; i < output.length; i++) {
            output[i] = a1[i] + a2[i];
        }
        return output;
    }

    public static int[] united(int[] a1, int[] a2) {
        int[] output = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            output[i] = a1[i];
        }
        for (int i = a1.length; i < output.length; i++) {
            output[i] = a2[i - a1.length];
        }
        return output;
    }
}
