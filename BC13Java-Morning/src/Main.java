public class Main {
    public static void main(String[] args) {
        //System.out.println(zipZap("zipXzap"));//zpXzp
        //System.out.println(zipZap("zopzop"));//zpzp
        //System.out.println(zipZap("zzzopzop"));//zzzpzp
        System.out.println(wordEnds("abcXY123XYijk", "XY"));// →"c13i"
        System.out.println(wordEnds("XY123XY", "XY"));// →"13"
        System.out.println(wordEnds("XY1XY", "XY"));// →"11"
        System.out.println(wordEnds("ANXY1XANY", "AN"));// →"11"

    }

    private static String wordEnds(String a, String b) {

        return "";
    }

    private static String wordEndsOld(String str, String strChar) {
        String result = "";
        int start = str.length();
        int end = strChar.length();
        for (int i = 0; i < start - end + 1; i++) {
            String temp = str.substring(i, i + end);
            if (i > 0 && temp.equals(strChar)) {
                result += str.substring(i - 1, i);
            }
            if (i < start - end && temp.equals(strChar)) {
                result += str.substring(i + end, i + end + 1);
            }
        }
        return result;
    }

    private static String zipZap(String str) {
        String z = "";
        String p = "";
        String temp = "";
        for (int i = 0; i < str.length() - 2; i++) {
            temp = str.substring(i, i + 3);
            if (temp.charAt(0) == 'z' && temp.charAt(2) == 'p') {
                z = str.substring(0, i + 1);
                p = str.substring(i + 2);
                str = z + p;
            }
        }
        return str;
    }

    private static String zipZapOld(String str) {
        return str.replaceAll("z.p", "zp");
    }
}
