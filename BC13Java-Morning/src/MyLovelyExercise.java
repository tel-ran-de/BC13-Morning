public class MyLovelyExercise {
    public static void main(String[] args) {
        /*System.out.println(withoutEnd2("Hello"));// → "ell"
        System.out.println(withoutEnd2("abc"));// → "b"
        System.out.println(withoutEnd2("ab"));// → ""
        System.out.println(withoutEnd2("a"));// → ""
        System.out.println(withoutEnd2(""));// → ""
        System.out.println(nTwice("Hello", 2));// → "Helo"
        System.out.println(nTwice("Chocolate", 3));// → "Choate"
        System.out.println(nTwice("Chocolate", 1));// → "Ce"
        System.out.println(nTwice("Василий", 2));// → "Ваий"
        System.out.println(nTwice("Tel-Ran", 7));// →
        System.out.println(xyBalance("aaxbby"));// → true
        System.out.println(xyBalance("aaxbb"));// → false
        System.out.println(xyBalance("yaaxbb"));// → false*/
        System.out.println(repeatFront("Chocolate", 4));// → "ChocChoChC"
        System.out.println(repeatFront("Chocolate", 3));// → "ChoChC"
        System.out.println(repeatFront("Ice Cream", 2));// → "IcI"
    }

    private static String repeatFront(String str, int n) {
        String output = "";
        for (int i = n; i > 0; i--) {
            output += str.substring(0, i);
        }
        return output;
    }

    private static boolean xyBalance(String str) {
        int x = str.indexOf('x');
        return str.substring(x).contains("y");
    }

    private static boolean xyBalance1(String str) {
        char x = 'x';
        char y = 'y';
        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) == x) {
                for (int j = i; j < str.length(); j++) {
                    if (str.charAt(j) == y) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static String nTwice(String str, int n) {
        String output = "";
        output = str.substring(0, n) + str.substring(str.length() - n);
        return output;
    }

    private static String withoutEnd2(String str) {
        if (str.length() < 2) {
            return "test";
        }
        return str.substring(1, str.length() - 1);
    }
}