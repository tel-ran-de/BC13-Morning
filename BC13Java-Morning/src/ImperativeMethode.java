public class ImperativeMethode {
    public static void main(String[] args) {
        application();
    }

    private static void application() {
        int[] arr = {2, 5, 6, 4, 9, 1, 150, 89};
        int min = findMin(arr);
        int max = findMax(arr);
        int sum = findSum(arr);
        String output = "Система отработала со статусом ОК";
        System.out.println(output + "\n"
                + "найдена сумма всех чисел " + sum + "\n"
                + "найдено минимальное число " + min + "\n"
                + "найдено максимальное число " + max + "\n"
        );
    }

    private static int findMax(int[] arr) {
        int result = arr[0];
        for (int j : arr) {
            result = Math.max(result, j);
        }
        return result;
    }

    private static int findMin(int[] arr) {
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < result) {
                result = arr[i];
            }
        }
        return result;
    }

    private static int findSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
