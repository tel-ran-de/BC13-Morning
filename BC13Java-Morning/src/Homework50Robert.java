public class Homework50Robert {

    public static void main(String[] args) {

        System.out.println(triangle(0)); // 0
        System.out.println(triangle(1)); // 1
        System.out.println(triangle(2)); // 3
        split();
        System.out.println(count8(8)); // 1
        System.out.println(count8(818)); // 2
        System.out.println(count8(8818)); // 4
        split();
        System.out.println(countHi("xxhixx")); // 1
        System.out.println(countHi("xhixhix")); // 2
        System.out.println(countHi("hi")); // 1
        split();
        System.out.println(noX("xaxb")); // "ab"
        System.out.println(noX("abc")); // "abc"
        System.out.println(noX("test")); // ""// word "test" to indicate an empty String
    }

    /* We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3
     blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle
     with the given number of rows.*/
    public static int triangle(int row) {
        if (row == 0) {
            return 0;
        }
        return row + triangle(row - 1);
    }

    /*Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, except
    that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields
    the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).*/
    public static int count8(int number) {
        int mod = number % 10;
        int div = number / 10;
        if (number < 1) {
            return 0;
        }
        if (mod == 8 && (div) % 10 == 8) {
            return 2 + count8(div);
        } else if (mod == 8) {
            return 1 + count8(div);
        }
        return count8(div);
    }

    //Given a string, compute recursively (no loops) the number of times lowercase “hi” appears in the string.
    public static int countHi(String str) {
        String hi = "hi";
        if (str.length() < 2) {
            return 0;
        }
        if (str.substring(0, 2).equals(hi)) {
            return 1 + countHi(str.substring(1));
        }
        return countHi(str.substring(1));
    }

    //Given a string, compute recursively a new string where all the ‘x’ chars have been removed.
    public static String noX(String str) {
        if (str.length() < 1) {
            return "";
        }
        if (str.charAt(0) == 'x') {
            return noX(str.substring(1));
        }
        return str.charAt(0) + noX(str.substring(1));
    }

    public static void split() {
        System.out.println("--------------------------------------------");
    }
}
