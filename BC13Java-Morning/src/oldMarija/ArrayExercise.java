package oldMarija;

public class ArrayExercise {
    public static void main(String[] args) {
        //1. Make variable Span
        //2. New variable in Span
        //3. Neested Loops: comparison of variables [i] and [j]
        int[] a1 = new int[]{1, 2, 1, 1, 3};
        int[] a2 = new int[]{1, 4, 2, 1, 4, 1, 4};
        int[] a3 = new int[]{1, 4, 2, 1, 4, 4, 4};
        System.out.println(maxSpan(a1));//4
        System.out.println(maxSpan(a2));//6
        System.out.println(maxSpan(a3));//6
        System.out.println(compareArraysElements(a1));
      //  System.out.println(compareArraysElements(a2));
      //  System.out.println(compareArraysElements(a3));
    }

    private static int compareArraysElements(int[] array) {
        int span = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    if (span < j - i) {
                        span = j - i + 1;
                    }
                }
            }
        }
        return span;
    }

    private static int maxSpan(int[] input) {
        int value = 0;
        int span = 0;
        for (int i = 0; i < input.length; i++) {

        }
        return 0;
    }
}
