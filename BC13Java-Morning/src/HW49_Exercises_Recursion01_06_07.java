public class HW49_Exercises_Recursion01_06_07 {
    public static void main(String[] args) {
        //Exercises Recursion_01 Exercise 06
        System.out.println(array11(new int[]{1, 2, 11}, 0));// → 1
        System.out.println(array11(new int[]{11, 11}, 0));// → 2
        System.out.println(array11(new int[]{1, 2, 3, 4}, 0));// → 0
        System.out.println();

        //Exercises Recursion_01 Exercise 07
        System.out.println(pairStar("hello"));// → "hel*lo"
        System.out.println(pairStar("xxyy"));// → "x*xy*y"
        System.out.println(pairStar("aaaa"));// → "a*a*a*a"
    }

    //Exercises Recursion_01 Exercise 07
    public static String pairStar(String s){
        if (s.length() < 2){
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            return s.charAt(0) + "*" + pairStar(s.substring(1));
        }
        return s.charAt(0) + pairStar(s.substring(1));
    }

    //Exercises Recursion_01 Exercise 06
    public static int array11(int[] array, int index) {
        if (index > array.length - 1){
            return 0;
        }
        if (array[index] != 11) {
            return array11(array, index + 1);
        }
        return 1 + array11(array, index + 1);
    }
}
