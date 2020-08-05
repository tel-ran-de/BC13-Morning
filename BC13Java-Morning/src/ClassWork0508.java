public class ClassWork0508 {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{2, 3, 5};
        int[] c = new int[]{1, 2, 1};
        // GoodMorningArraysDayTwo.myArrayPrint(fix23(a));// → [1, 2, 0]
        // GoodMorningArraysDayTwo.myArrayPrint(fix23(b));// → [2, 0, 5]
        // GoodMorningArraysDayTwo.myArrayPrint(fix23(c));// → [1, 2, 1]
        int[] a1 = new int[]{1, 2, 3, 4};
        int[] a2 = new int[]{7, 1, 2, 3, 4, 9};
        int[] a3 = new int[]{1, 2};
        //GoodMorningArraysDayTwo.myArrayPrint(makeMiddle(a1)); //→ [2, 3]
        //GoodMorningArraysDayTwo.myArrayPrint(makeMiddle(a2)); //→ [2, 3]
        //GoodMorningArraysDayTwo.myArrayPrint(makeMiddle(a3)); // → [1, 2]

    }


    public static int[] fix23(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2 && array[i + 1] == 3) {
                array[i + 1] = 0;
            }

        }
        return array;
    }

    public static int[] makeMiddle(int[] array) {
        int[] output = new int[2];
        output[1] = array[array.length / 2];
        output[0] = array[array.length / 2 - 1];
        return output;
    }
}//ssh-keygen -t rsa -b 4096 -C "inna.ropchan@gmail.com"
