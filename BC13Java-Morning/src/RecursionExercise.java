public class RecursionExercise {
    public static void main(String[] args) {
        System.out.println(endX("xxre"));// → "rexx"
        System.out.println(endX("xxhixx"));// → "hixxxx"
        System.out.println(endX("xhixhix"));// → "hihixxx"
        System.out.println(strCopies("catcowcat", "cat", 2));// → true
        System.out.println(strCopies("catcowcat", "cow", 2));// → false
        System.out.println(strCopies("catcowcat", "cow", 1));// → true
    }

    private static boolean strCopies(String input, String etalon, int count) {
        if (count == 0) {
            return true;
        }
        if (input.length() < etalon.length()) {
            return false;
        }
        if (input.substring(0, etalon.length()).equals(etalon)) {
            return strCopies(input.substring(1), etalon, count - 1);
        }
        return strCopies(input.substring(1), etalon, count);
    }

    private static String endX(String str) {
        if (str.length() == 0) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            return endX(str.substring(1)) + 'x';
        }
        return str.charAt(0) + endX(str.substring(1));
    }

}
