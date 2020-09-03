public class HW50_Recursion01_Exercises_12_15 {
    public static void main(String[] args) {
        //Exercises Recursion_01 Exercise 12
        System.out.println(triangle(0));// → 0
        System.out.println(triangle(1));// → 1
        System.out.println(triangle(2));// → 3
        System.out.println();

        //Exercises Recursion_01 Exercise 13
        System.out.println(count8(8));// → 1
        System.out.println(count8(818));// → 2
        System.out.println(count8(8818));//→ 4
        System.out.println(count8(88818));//→ 6
        System.out.println(count8(888188));//→ 8
        System.out.println();

        //Exercises Recursion_01 Exercise 14
        System.out.println(countHi("xxhixx", "hi"));// → 1
        System.out.println(countHi("xhixhix", "hi"));// → 2
        System.out.println(countHi("hi", "hi"));// → 1
        System.out.println();

        //Exercises Recursion_01 Exercise 15
        System.out.println(noX("xaxb"));// → "ab"
        System.out.println(noX("abc"));// → "abc"
        System.out.println(noX("xx"));// → ""
    }

    //Exercises Recursion_01 Exercise 15
    public static String noX(String s) {
        if (!s.contains("x")) {
            return s;
        }
        if (s.charAt(0) == 'x') {
            return noX(s.substring(1));
        }
        return s.charAt(0) + noX(s.substring(1));
    }

    //Exercises Recursion_01 Exercise 14
    public static int countHi(String input, String s) {
        if (input.length() < s.length()) {
            return 0;
        }
        if (input.startsWith(s)) {
            return 1 + countHi(input.substring(1), s);
        }
        return countHi(input.substring(1), s);
    }

    //Exercises Recursion_01 Exercise 13
    public static int count8(int n) {
        if (n < 8) {
            return 0;
        }
        if (n % 10 == 8 && (n / 10) % 10 == 8) {
            return 2 + count8(n / 10);
        } else if (n % 10 == 8) {
            return 1 + count8(n / 10);
        }
        return count8(n / 10);
    }

    //Exercises Recursion_01 Exercise 12
    public static int triangle(int n) {
        if (n == 0) {
            return 0;
        }
        return n + triangle(n - 1);
    }
}
