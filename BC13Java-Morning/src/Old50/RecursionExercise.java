package Old50;

public class RecursionExercise {
    public static void main(String[] args) {
       /* System.out.println(endX("xxre"));// → "rexx"
        System.out.println(endX("xxhixx"));// → "hixxxx"
        System.out.println(endX("xhixhix"));// → "hihixxx"
        System.out.println(count11("11abc11"));// → 2
        System.out.println(count11("abc11x11x11"));// → 3
        System.out.println(count11("111"));// → 1
        System.out.println(parenBit("xyz(abc)123"));// → "(abc)"
        System.out.println(parenBit("x(hello)")); //→ "(hello)"
        System.out.println(parenBit("(xy)1")); //→ "(xy)"*/
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

    private static String parenBit(String input) {
        if (input.length() == 0) {
            return "";
        }
        if (input.charAt(0) != '(') {
            return parenBit(input.substring(1));
        } else if (input.charAt(input.length() - 1) != ')') {
            return parenBit(input.substring(0, input.length() - 1));
        }
        return input;
    }

    private static int count11(String input) {
        //int count = 0;
        if (input.length() < 2) {
            return 0;
        }
        if (input.substring(0, 2).equals("11")) {
            // count++;
            return 1 + count11(input.substring(2));
        }
        return count11(input.substring(1));
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
