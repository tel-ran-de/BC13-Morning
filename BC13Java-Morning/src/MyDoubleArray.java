import java.util.Arrays;

public class MyDoubleArray {
    public static void main(String[] args) {
        // создаём массив
        // заполняем массив
        // распечатываем массив
        // сортируем массив
        // распечатываем
        double[] array = createDoubleArray(10);
        System.out.println(Arrays.toString(array));
        sortArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static double[] createDoubleArray(int length) {
        double[] array = new double[length];
        for (int i = 0; i < length; i++) {
            array[i] = getMeDouble();
        }
        return array;
    }

    private static double getMeDouble() {
        return myRound(Math.random(), 4);
    }

    public static double myRound(double digit, int decimalPlaces) {
        double output = 0;
        int temp1 = (int) Math.pow(10, decimalPlaces);
        //System.out.println(temp1);
        output = digit * temp1;
        //System.out.println(output);
        int temp2 = (int) output;
        //System.out.println(temp2);
        output = (double) temp2 / temp1;
        //System.out.println(output);

        return output;
    }

    public static void sortArray(double[] array) {
        double count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                double temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                count++;
            }

        }
        if (count > 0) {
            sortArray(array);
        }


    }
}
