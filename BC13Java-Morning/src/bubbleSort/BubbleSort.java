package bubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = createArray(10);
    }

    private static int[] createArray(int n) {
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            output[i] = (int) (Math.random() * 100);
        }
        return output;
    }
}
