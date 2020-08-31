import java.util.Arrays;

public class HomeWork51Dina {
    public static void main(String[] args) {
        int[] a1 = {1, 0, 0, 1};
        int[] a2 = {0, 1, 1, 0, 1};
        int[] a3 = {1, 0};
        System.out.println(Arrays.toString(zeroFront(a1)));// → [0, 0, 1, 1]
        System.out.println(Arrays.toString(zeroFront(a2)));// → [0, 0, 1, 1, 1]
        System.out.println(Arrays.toString(zeroFront(a3)));// → [0, 1]
        System.out.println("-----");
        int[] b1 = {1, 0, 1, 0, 0, 1, 1};
        int[] b2 = {3, 3, 2};
        int[] b3 = {2, 2, 2};
        System.out.println(Arrays.toString(evenOdd(b1)));// → [0, 0, 0, 1, 1, 1, 1]
        System.out.println(Arrays.toString(evenOdd(b2)));// → [2, 3, 3]
        System.out.println(Arrays.toString(evenOdd(b3)));// → [2, 2, 2]
    }

    private static int[] evenOdd(int[] b) {
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0) {
                int temp = b[i];
                b[i] = b[count];
                b[count] = temp;
                count++;
            }
        }
        return b;
    }

    private static int[] zeroFront(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = a[count];
                a[count] = 0;
                count++;
            }
        }
        return a;
    }
}
