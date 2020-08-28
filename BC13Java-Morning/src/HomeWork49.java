public class HomeWork49 {
    public static void main(String[] args) {
        /*Учитывая массив ints, вычислите рекурсивно количество раз,
        которое значение 11 появляется в массиве.
        Будем использовать условность рассмотрения только той части массива,
        которая начинается с данного индекса. Таким образом, при рекурсивном вызове может быть
        передан индекс+1 для перемещения вниз по массиву. Начальный вызов будет проходить в индексе как 0. */
        int[] a1 = {1, 2, 11};
        int[] a2 = {11, 11};
        int[] a3 = {1, 2, 3, 4};
        System.out.println(array11(a1, 0));// → 1
        System.out.println(array11(a2, 0));// → 2
        System.out.println(array11(a3, 0));// → 0
        System.out.println("----------");
        /* Получив строку, вычислите рекурсивно новую строку,
        в которой одинаковые символы, находящиеся рядом в исходной строке, отделены друг от друга символом "*".*/
        System.out.println(pairStar("hello"));// → "hel*lo"
        System.out.println(pairStar("xxyy"));// → "x*xy*y"
        System.out.println(pairStar("aaaa"));// → "a*a*a*a"
    }

    private static String pairStar(String input) {
        String star = "*";
        if (input.length() < 2) {
            return input;
        }
        if (input.charAt(0) == input.charAt(input.length() - 1)) {
            return input.charAt(0) + star + pairStar(input.substring(1));
        }
        if (input.charAt(0) == input.charAt(1)) {
            return input.charAt(0) + star + input.charAt(1) + pairStar(input.substring(2));
        }

        return input.substring(0, 2) + pairStar(input.substring(2));
    }

    private static int array11(int[] input, int n) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input.length == 0) {
                count = 0;
            }
            if (input[i] == 11) {
                count++;
            }
        }
        return count;
    }
}
