package hwInna49;

public class HomeWork49 {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 11};
        int[] a2 = new int[]{11, 11};
        int[] a3 = new int[]{1, 2, 3, 4};
        //System.out.println(array11(a1)); //1
        // System.out.println(array11(a2)); //2
        // System.out.println(array11(a3));  //0
        System.out.println(pairStar("hello")); //→ "hel*lo"
        System.out.println(pairStar("xxyy")); // → "x*xy*y"
        System.out.println(pairStar("aaaa"));  // → "a*a*a*a"
    }

    public static String pairStar(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(1) == str.charAt(2)) {
                return str.charAt(1) + "*" + str.charAt(2);
            } else {
                if (str.charAt(0) == str.charAt(1)) {
                    return str.charAt(0) + "*" + str.charAt(1);
                } else {
                    if (str.charAt(0) == str.charAt(str.length() - 1)) {
                        return str.charAt(0) + "*" + str.charAt(str.length() - 1);
                    }
                }
            }
        }
        return str;
    }

    public static int array11(int[] a) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 11) {
                count++;
            }
        }
        return count;
    }
}

