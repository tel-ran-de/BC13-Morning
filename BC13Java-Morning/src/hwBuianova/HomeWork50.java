package hwBuianova;

public class HomeWork50 {
    public static void main(String[] args) {
        System.out.println(triangle(0));
        System.out.println(triangle(1));
        System.out.println(triangle(2));
        System.out.println("----------------");
        System.out.println(count8(8));
        System.out.println(count8(818));
        System.out.println(count8(8818));
        System.out.println("----------------");
        System.out.println(countHi("xxhixx"));
        System.out.println(countHi("xhixhix"));
        System.out.println(countHi("hi"));
        System.out.println("----------------");
        System.out.println(noX("xaxb"));
        System.out.println(noX("abc"));
        System.out.println(noX("xx"));
    }

    public static String noX(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.charAt(0) == 'x') {
            return noX(str.substring(1));
        }
        return str.charAt(0) + noX(str.substring(1));
    }

    public static int countHi(String str) {
        if (str.length() < 2) return 0;
        if (str.substring(0, 2).equals("hi"))
            return 1 + countHi(str.substring(2));
        return countHi(str.substring(1));
    }

    public static int count8(int n) {
        if (n == 0) {
            return 0;
        }
        if (n >= 88 && n % 100 == 88) {
            return 2 + count8(n / 10);
        }
        if (n % 10 == 8) {
            return 1 + count8(n / 10);
        }
        return count8(n / 10);
    }

    public static int triangle(int rows) {
        if (rows == 0) return 0;
        return rows + triangle(rows - 1);
    }

}
