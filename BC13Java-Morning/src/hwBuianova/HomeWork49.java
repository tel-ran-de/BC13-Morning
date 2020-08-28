package hwBuianova;

public class HomeWork49 {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 11};
        int[] a2 = new int[]{11, 11};
        int[] a3 = new int[]{1, 2, 3, 4};
        System.out.println(array11(a1, 0));
        System.out.println(array11(a2, 0));
        System.out.println(array11(a3, 0));
        System.out.println("---------------------");
        System.out.println(pairStar("hello")); //→"hel*lo"
        System.out.println(pairStar("xxyy")); //→"x*xy*y"
        System.out.println(pairStar("aaaa")); ///"a*a*a*a"
    }

    public static String pairStar(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }
        return str.charAt(0) + pairStar(str.substring(1));
    }

    public static int array11(int[] array, int index) {
        if (index == array.length) {
            return 0;
        }
        if (array[index] == 11) {
            return 1 + array11(array, index + 1);
        }
        return array11(array, index + 1);
    }
}
