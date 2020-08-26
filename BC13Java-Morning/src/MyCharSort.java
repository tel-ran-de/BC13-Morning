import java.util.Arrays;

public class MyCharSort {
    public static void main(String[] args) {
        // создаём массив
        // заполняем массив
        // распечатываем массив
        // сортируем массив
        // распечатываем
        char[] myArray = createCharArray(10);
        System.out.println(Arrays.toString(myArray));
        sortArray(myArray);
        System.out.println(Arrays.toString(myArray));

    }

    public static char[] createCharArray(int length) {
        char[] array = new char[length];
        for (int i = 0; i < length; i++) {
            array[i] = getMeChar(70, 110);
        }
        return array;
    }

    private static char getMeChar(int min, int max) {
        char myChar = (char) (Math.random() * ((max - min) + 1) + min);
        return myChar;
    }

    public static void sortArray(char[] myArray) {
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
            sortArray(myArray);
        }
    }
}
