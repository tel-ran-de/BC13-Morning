package classWork;

import java.util.Arrays;

//Ханойская задача - сделала очень простую рекурсию... что поделать, как могу!
public class HomeWork48 {
    public static void main(String[] args) {
        //1-Big disk; 2 -middle disk; 3- small disk;
        hanoi();
        System.out.println();
        stepOne();
        System.out.println();
        stepTwo();
        System.out.println();
        stepThree();
        System.out.println();
        stepFour();
        System.out.println();
        stepFive();
        System.out.println();
        stepSix();
        System.out.println();
        stepSeven();
        System.out.println();
        stepEight();
        System.out.println();
        stepNine();
        System.out.println();
        stepTen();
        System.out.println();
        stepEleven();
    }

    private static void stepEleven() {
        int[] a = {1, 2, 3};
        int[] b = new int[3];
        int[] c = new int[3];
        a[0] = 0;
        a[1] = 0;
        a[2] = 0;
        c[1] = 2;
        c[0] = 1;
        c[2] = 3;
        b[0] = 0;
        System.out.print("Step 11: " + Arrays.toString(a) + " ");
        System.out.print(Arrays.toString(b) + " ");
        System.out.print(Arrays.toString(c) + " ");
    }

    private static void stepTen() {
        int[] a = {1, 2, 3};
        int[] b = new int[3];
        int[] c = new int[3];
        a[0] = 0;
        a[1] = 0;
        a[2] = 0;
        c[1] = 2;
        c[0] = 1;
        b[0] = 3;
        System.out.print("Step 10: " + Arrays.toString(a) + " ");
        System.out.print(Arrays.toString(b) + " ");
        System.out.print(Arrays.toString(c) + " ");
    }

    private static void stepNine() {
        int[] a = {1, 2, 3};
        int[] b = new int[3];
        int[] c = new int[3];
        a[0] = 2;
        a[1] = 0;
        a[2] = 0;
        c[1] = 0;
        c[0] = 1;
        b[0] = 3;
        System.out.print("Step 9:  " + Arrays.toString(a) + " ");
        System.out.print(Arrays.toString(b) + " ");
        System.out.print(Arrays.toString(c) + " ");
    }

    private static void stepEight() {
        int[] a = {1, 2, 3};
        int[] b = new int[3];
        int[] c = new int[3];
        a[0] = 2;
        a[1] = 3;
        a[2] = 0;
        c[1] = 0;
        c[0] = 1;
        System.out.print("Step 8:  " + Arrays.toString(a) + " ");
        System.out.print(Arrays.toString(b) + " ");
        System.out.print(Arrays.toString(c) + " ");
    }

    private static void stepSeven() {
        int[] a = {1, 2, 3};
        int[] b = new int[3];
        int[] c = new int[3];
        a[0] = 2;
        a[1] = 3;
        a[2] = 0;
        c[1] = 0;
        c[0] = 0;
        b[0] = 1;
        System.out.print("Step 7:  " + Arrays.toString(a) + " ");
        System.out.print(Arrays.toString(b) + " ");
        System.out.print(Arrays.toString(c) + " ");
    }

    private static void stepSix() {
        int[] a = {1, 2, 3};
        int[] b = new int[3];
        int[] c = new int[3];
        a[0] = 2;
        a[1] = 0;
        a[2] = 0;
        c[1] = 0;
        b[0] = 1;
        b[1] = 3;
        System.out.print("Step 6:  " + Arrays.toString(a) + " ");
        System.out.print(Arrays.toString(b) + " ");
        System.out.print(Arrays.toString(c) + " ");
    }

    private static void stepFive() {
        int[] a = {1, 2, 3};
        int[] b = new int[3];
        int[] c = new int[3];
        a[0] = 0;
        a[1] = 0;
        a[2] = 0;
        c[1] = 0;
        c[0] = 2;
        b[0] = 1;
        b[1] = 3;
        System.out.print("Step 5:  " + Arrays.toString(a) + " ");
        System.out.print(Arrays.toString(b) + " ");
        System.out.print(Arrays.toString(c) + " ");
    }

    private static void stepFour() {
        int[] a = {1, 2, 3};
        int[] b = new int[3];
        int[] c = new int[3];
        a[0] = 0;
        a[1] = 0;
        a[2] = 0;
        c[1] = 3;
        c[0] = 2;
        b[0] = 1;
        System.out.print("Step 4:  " + Arrays.toString(a) + " ");
        System.out.print(Arrays.toString(b) + " ");
        System.out.print(Arrays.toString(c) + " ");
    }

    private static void stepThree() {
        int[] a = {1, 2, 3};
        int[] b = new int[3];
        int[] c = new int[3];
        a[0] = 1;
        a[1] = 0;
        a[2] = 0;
        c[1] = 3;
        c[0] = 2;
        System.out.print("Step 3:  " + Arrays.toString(a) + " ");
        System.out.print(Arrays.toString(b) + " ");
        System.out.print(Arrays.toString(c) + " ");
    }

    private static void stepTwo() {
        int[] a = {1, 2, 3};
        int[] b = new int[3];
        int[] c = new int[3];
        a[0] = 1;
        a[1] = 0;
        a[2] = 0;
        b[0] = 3;
        c[0] = 2;
        System.out.print("Step 2:  " + Arrays.toString(a) + " ");
        System.out.print(Arrays.toString(b) + " ");
        System.out.print(Arrays.toString(c) + " ");
    }

    private static void stepOne() {
        int[] a = {1, 2, 3};
        int[] b = new int[3];
        int[] c = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 0;
        b[0] = 3;
        System.out.print("Step 1:  " + Arrays.toString(a) + " ");
        System.out.print(Arrays.toString(b) + " ");
        System.out.print(Arrays.toString(c) + " ");
    }

    public static void hanoi() {
        int[] a = {1, 2, 3};
        int[] b = new int[3];
        int[] c = new int[3];
        c[0] = 0;
        b[0] = 0;
        System.out.print("Step 0:  " + Arrays.toString(a) + " ");
        System.out.print(Arrays.toString(b) + " ");
        System.out.print(Arrays.toString(c) + " ");

    }
}

