public class OneMoreArrayExercise {
    public static void main(String[] args) {
        //1.Create Array
        //2.Print
        //3.Sum Array
        create();
        System.out.println(arraysSum(create()));

    }


    private static int[][] create() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        return array;
    }

    private static int arraysSum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }
        return sum;
    }
}
