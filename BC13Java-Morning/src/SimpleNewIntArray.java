public class SimpleNewIntArray {
    public static void main(String[] args) {
        int[][] myArray = new int[5][]; // двумерный массив с 5 строками
        myArray[0] = new int[1];
        myArray[1] = new int[2];
        myArray[2] = new int[3];
        myArray[3] = new int[4];
        myArray[4] = new int[5];

        for (int[] littleArray : myArray) {
            for (int element : littleArray) {
                System.out.print(element + " ");
            }
            System.out.println();

        }
    }
}
