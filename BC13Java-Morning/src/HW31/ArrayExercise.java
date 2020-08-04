package HW31;

public class ArrayExercise {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{7, 3};
        int[] a3 = new int[]{7, 3, 2};
        int[] a4 = new int[]{1, 3};
       /* System.out.println(commonEnd(a1, a2));// →true
        System.out.println(commonEnd(a1, a3));// →false
        System.out.println(commonEnd(a1, a4));// →true*/
        int[] b1 = new int[]{1, 2, 3};
        int[] b2 = new int[]{5, 11, 9};
        int[] b3 = new int[]{7, 0, 0};
/*        GoodMorningArraysDayTwo.myArrayPrint(reverse3(b1));
        GoodMorningArraysDayTwo.myArrayPrint(reverse3(b2));
        GoodMorningArraysDayTwo.myArrayPrint(reverse3(b3));*/
        /*middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
        middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
        middleWay([5, 2, 9], [1, 4, 5]) → [2, 4] */
        int[] mc1 = new int[]{1, 2, 3};
        int[] mc2 = new int[]{4, 5, 6};
        int[] kc1 = new int[]{7, 7, 7};
        int[] kc2 = new int[]{3, 8, 0};
        int[] nc1 = new int[]{5, 2, 9};
        int[] nc2 = new int[]{1, 4, 5};

    }

    public static int[] middleWay(int[] a, int[] b) {
        

        return a;
    }

    private static int[] reverse3(int[] b) {
       /* for (int i = 0; i < b.length; i++) {

        }*/

        return b;
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }
}
