public class ExercisesString01 {
    public static void main(String[] args) {
        //System.out.println(helloName("Bob"));
        System.out.println(makeOutWord("<<>>", "Jay"));
        System.out.println(firstHalf("WooHoo"));
    }

    public static String helloName(String name) {
        String hallo = "Hello ";
        String symbol = "!";
        char quotationMark = '"';
        String result = quotationMark + hallo.concat(name + symbol) + quotationMark;
        return result;
    }

    public static String makeOutWord(String symbol, String word) {
        //String start = "";
        //symbol = symbol.substring(0,symbol.length()/2);
        //System.out.println(symbol);
        return symbol.substring(0, symbol.length() / 2) + word + symbol.substring(symbol.length() / 2);
    }

    public static String firstHalf(String word) {
        return word.substring(0, word.length() / 2);
    }

    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public static String theEnd(String s, boolean front) {
        if (front) {
            return s.substring(0, 1);
        } else {
            return s.substring(s.length() - 1);
        }
    }

    public static boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public static boolean endsLyDos(String str) {
        String reference = "ly";
        int length = str.length();
        if (length < 2) {
            return false;
        }
        return reference.equals(str.substring(str.length() - 2));
    }

    public static String middleThree(String s) {
        int middle = s.length() / 2;
        return s.substring(middle - 1, middle + 2);
    }

    public static String lastChars(String a, String b) {
        if (a.length() < 1) {
            a = "@";
        }
        if (b.length() == 0) {
            b = "@";
        }
        return a.substring(0, 1) + b.substring(b.length() - 1);
    }

    public static String seeColor(String s) {
        String red = "red";
        String blue = "blue";
        if (s.substring(0, 3).equals(red)) {
            return red;
        } else if (s.substring(0, 4).equals(blue)) {
            return blue;
        } else return "";
    }
}