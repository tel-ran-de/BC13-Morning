public class StringExercise {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));// → true
        System.out.println(xyzMiddle("AxyzBB"));// → true
        System.out.println(xyzMiddle("AxyzBBB"));// → false
        int findChar = myIndexOf('$', "AAxyzBB");
        System.out.println(findChar);
    }

    private static int myIndexOf(char inputChar, String input) {
        int index = -1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == inputChar) {
                index = i;
            }
        }
        return index;
    }

    private static boolean xyzMiddle(String input) {
        int startRange = input.indexOf('x');
        int endRange = input.length() - input.indexOf('z') - 1;
        return Math.abs(endRange - startRange) <= 1;
    }
}
