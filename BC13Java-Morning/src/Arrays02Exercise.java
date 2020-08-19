import java.util.Arrays;

public class Arrays02Exercise {
    public static void main(String[] args) {
        int[] b1 = new int[]{10, 3, 5, 6}; //7
        int[] b2 = new int[]{7, 2, 10, 9}; //8
        int[] b3 = new int[]{2, 10, 7, 2}; //8
        //  System.out.println(bigDiff(b1)); //→ 7
        //  System.out.println(bigDiff(b2)); //→ 8
        // System.out.println(bigDiff(b3)); //→ 8
        //System.out.println("-----------------");
        int[] c1 = new int[]{1, 2, 2}; //5
        int[] c2 = new int[]{1, 2, 2, 6, 99, 99, 7}; //5
        int[] c3 = new int[]{1, 1, 6, 7, 2}; //4
        System.out.println(sum67(c1));
        System.out.println(sum67(c2));
        System.out.println(sum67(c3));
    }

    private static int sum67(int[] arr) {
        int sum;
        int indexOfSix = findIndex(arr, 6);
        int indexOfSeven = findIndex(arr, 7);
        if (indexOfSeven == -1) {
            sum = findSum(arr, 0, arr.length);
        } else {
            sum = findSum(arr, 0, indexOfSix);
            sum += findSum(arr, indexOfSeven + 1, arr.length);
        }
        return sum;
    }

    public static int findSum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static int findIndex(int[] arr, int digit) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == digit) {
                index = i;
            }
        }
        return index;
    }

    private static int sum67Version1(int[] array) {
        int sum = 0;
        boolean sixMode = false;
        for (int i = 0; i < array.length; i++) {
            if (sixMode) {
                if (array[i] == 7) {
                    sixMode = false;
                }
            } else if (array[i] == 6) {
                sixMode = true;
            } else sum += array[i];
        }
        return sum;
    }

    private static int bigDiff(int[] input) {
        int min = findMin(input);
        int max = findMax(input);
        return max - min;
    }

    private static int findMax(int[] input) {
        int max = input[0];
        for (int j : input) {
            max = Math.max(max, j);
        }
        return max;
    }

    private static int findMin(int[] input) {
        int min = input[0];
        for (int j : input) {
            min = Math.min(min, j);
        }
        return min;
    }
}
