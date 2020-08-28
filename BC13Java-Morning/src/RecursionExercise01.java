package recursionexercise;

public class RecursionExercise01 {
    public static void main(String[] args) {
        System.out.println(pairStar("hello")); //→ "hel*lo"
        System.out.println(pairStar("xxyy")); //→ "x*xy*y"
        System.out.println(pairStar("aaaa")); //→ "a*a*a*a"
        System.out.println("--------------------------");
        int[] b1 = new int[]{1, 2, 11};
        int[] b2 = new int[]{11, 11};
        int[] b3 = new int[]{1, 2, 3, 4};
        System.out.println(array11(b1, 0)); //→ 1
        System.out.println(array11(b2, 0));// → 2
        System.out.println(array11(b3, 0)); //→ 0

    }

    public static int array11(int[] arr, int index) {
        int count = 0;
        if (arr[index] == 11) {
            count++;
        }
        if (index == arr.length - 1) {
            return count;
        }
        return array11(arr, index + 1) + count;
    }

    private static String pairStar(String input) {
        if (input.length() < 2) {
            return input;
        }
        if (input.charAt(input.length() - 1) == input.charAt(0)) {
            return input.charAt(0) + "*" + pairStar(input.substring(1));
        }
        if (input.charAt(1) == input.charAt(0)) {
            return input.charAt(0) + "*" + input.charAt(1) + pairStar(input.substring(2));
        }
        return input.substring(0, 2) + pairStar(input.substring(2));
    }
}
