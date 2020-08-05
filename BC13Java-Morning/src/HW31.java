public class HW31 {

    public static void main(String[] args) {
        /*int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{7, 3};
        int[] a3 = new int[]{7, 3, 2};
        int[] a4 = new int[]{1, 3};
       /* System.out.println(commonEnd(a1, a2));// →true
        System.out.println(commonEnd(a1, a3));// →false
        System.out.println(commonEnd(a1, a4));// →true*/


       /* //  Дан массив длиной 3, верните новый массив с элементами в обратном порядке,
        //  например {1, 2, 3} становится {3, 2, 1}.
        int[] b1 = new int[]{1, 2, 3}; //[3,2,1]
        int[] b2 = new int[]{5, 11, 9};//[9,11,5]
        int[] b3 = new int[]{7, 0, 0};//[0,0,7]
        int[] b4 = new int[]{7, 0, 0, 10, 15};//[15,10,0,0,7]
        myArrayPrint(reverse3(b1));
        myArrayPrint(reverse3(b2));
        myArrayPrint(reverse3(b3));
        myArrayPrint(reverse3(b4));*/

        // Given 2 int arrays, a and b, each length 3,
        // return a new array length 2 containing their middle elements.
        //  Даны 2 массива int, a и b, каждый длиной 3, верните новый массив с длиной 2,
        //  содержащего среднее арифметическое элементов первоначальных массивов.
       /* int[] mc1 = new int[]{1, 2, 3};
        int[] mc2 = new int[]{4, 5, 6};
        int[] kc1 = new int[]{7, 7, 7};
        int[] kc2 = new int[]{3, 8, 0};
        int[] nc1 = new int[]{5, 2, 9};
        int[] nc2 = new int[]{1, 4, 5};
        myArrayPrint(middleWay(mc1, mc2));//→ [2, 5]
        myArrayPrint(middleWay(kc1, kc2));// → [7, 8]
        myArrayPrint(middleWay(nc1, nc2));//→ [2, 4]*/

        // Given an int array length 2, return true if it does not contain a 2 or 3.
        int[] a1 = new int[]{4, 5};
        int[] a2 = new int[]{4, 2};
        int[] a3 = new int[]{3, 5};
        System.out.println(no23(a1)); //→ true
        System.out.println(no23(a2)); //→ false
        System.out.println(no23(a3));// → false
    }

    public static boolean no23(int[] a) {
        if (a[0] == 2 || a[1] == 3 || (a[0] == 3 || a[1] == 2)) {
            return false;
        }
        return true;
    }

    public static int[] middleWay(int[] a, int[] b) {
        int[] output = new int[2];
        output[0] = a[1];
        output[1] = b[1];
        return output;
    }

    private static int[] reverse3(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[output.length - 1 - i] = input[i];
        }
        return output;
    }


    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public static void myArrayPrint(int[] arrayToPrint) {
        System.out.println("Длина массива - " + arrayToPrint.length);
        for (int j : arrayToPrint) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}


