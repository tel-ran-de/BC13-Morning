package hwBuianova;

import java.util.Arrays;

public class HomeWork51 {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 0, 0, 1};
        int[] a2 = new int[]{0, 1, 1, 0, 1};
        int[] a3 = new int[]{1, 0};
        System.out.println(Arrays.toString(zeroFront(a1)));
        System.out.println(Arrays.toString(zeroFront(a2)));
        System.out.println(Arrays.toString(zeroFront(a3)));

        System.out.println("----------------------");
        int[] b1 = new int[]{1, 0, 1, 0, 0, 1, 1};
        int[] b2 = new int[]{3, 3, 2};
        int[] b3 = new int[]{2, 2, 2};
        System.out.println(Arrays.toString(evenOdd(b1)));
        System.out.println(Arrays.toString(evenOdd(b2)));
        System.out.println(Arrays.toString(evenOdd(b3)));
    }

    public int[] evenOdd1(int[] nums) {
        int[] res = new int[nums.length];
        int evenPos = 0;
        int oddPos = res.length - 1;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] % 2 == 0)
                res[evenPos++] = nums[i];
            else
                res[oddPos--] = nums[i];
        return res;
    }

    public static int[] evenOdd(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = array[count];
                array[count] = 0;
                count++;
            }
        }
        return array;
    }

    public static int[] zeroFront(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = array[count];
                array[count] = 0;
                count++;
            }
        }
        return array;
    }
}
