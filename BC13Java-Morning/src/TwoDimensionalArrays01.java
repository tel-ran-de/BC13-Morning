// https://github.com/Maryfro/BC13-m1/blob/master/src/lesson36/TwoDimensionalArrays01.java
public class TwoDimensionalArrays01 {
    public static void main(String[] args) {
        int[][] array = createArray(5, 6);
        printOneLine(array);
        System.out.println("------------------------");
        PifagorTable.printTwoDimensionalArray(array);
    }

    private static void printOneLine(int[][] input) {
        for (int i = 0; i < input[2].length; i++) {
            System.out.print(input[2][i] + " ");
        }
        System.out.println();
    }

    private static int[][] createArray(int a, int b) {
        int[][] myArray = new int[5][6];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = (int) (Math.random() * 100);
            }
        }
        return myArray;
    }
}
