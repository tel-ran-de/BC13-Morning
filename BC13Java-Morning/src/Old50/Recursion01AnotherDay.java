package Old50;

public class Recursion01AnotherDay {
    public static void main(String[] args) {
        /*System.out.println(countAbc("abc"));// → 1
        System.out.println(countAbc("abcxxabc"));// → 2
        System.out.println(countAbc("abaxxaba"));// → 2
        System.out.println(countHi2("ahixhi"));// → 1
        System.out.println(countHi2("ahibhi"));// → 2
        System.out.println(countHi2("xhixhi"));// → 0
        System.out.println(countHi2("hi"));// → 1
        System.out.println(strCount("catcowcat", "cat"));// → 2
        System.out.println(strCount("catcowcat", "cow"));// → 1
        System.out.println(strCount("catcowcat", "dog"));// → 0*/
        System.out.println(bunnyEars(0));// → 0
        System.out.println(bunnyEars(1));// → 2
        System.out.println(bunnyEars(2));// → 4
    }

    private static int bunnyEars(int rabbit) {
        if (rabbit == 0) {
            return 0;
        }
        return 2 + bunnyEars(rabbit - 1);
    }

    private static int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.substring(0, sub.length()).equals(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }
        return strCount(str.substring(1), sub);
    }

    private static int countHi2(String str) {
        String hi = "hi";
        if (str.length() < 2) {
            return 0;
        }
        if (str.length() >= 3 && str.substring(0, 3).equals("xhi")) {
            return 0 + countHi2(str.substring(3));
        }
        if (str.substring(0, 2).equals(hi)) {
            return 1 + countHi2(str.substring(2));
        }
        return countHi2(str.substring(1));
    }

    private static int countAbc(String str) {
        String abc = "abc";
        String aba = "aba";
        if (str.length() < 3) {
            return 0;
        }
        if (str.substring(0, 3).equals(abc) || str.substring(0, 3).equals(aba)) {
            return 1 + countAbc(str.substring(1));
        }

        return countAbc(str.substring(1));
    }
}
