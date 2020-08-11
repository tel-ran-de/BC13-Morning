import java.util.Arrays;

public class MyLovelyArrays {
    public static void main(String[] args) {
        myLovelyTwoDimensionalStringArray();
    }

    private static void myLovelyTwoDimensionalStringArray() {
        String[][] myArray = new String[5][3];
        myArray[0][0] = "1";
        myArray[0][1] = "Матвеев";
        myArray[0][2] = "№02413543564";

        myArray[1][0] = "2";
        myArray[1][1] = "Васечкин";
        myArray[1][2] = "№92344023947820";

        myArray[2][0] = "3";
        myArray[2][1] = "Петечкин";
        myArray[2][2] = "№436543264537";

        myArray[3][0] = "4";
        myArray[3][1] = "Сидоров";
        myArray[3][2] = "№24235430";

        myArray[4][0] = "5";
        myArray[4][1] = "Герасимов";
        myArray[4][2] = "№242354р432";
        myPrintForStringTwoD(myArray);
    }

    private static void myPrintForStringTwoD(String[][] s) {
        System.out.println("Двумерный массив с "
                + s.length + ", " + s[0].length);
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.print(s[i][j] + "; ");
            }
            System.out.println();
        }
    }
}
