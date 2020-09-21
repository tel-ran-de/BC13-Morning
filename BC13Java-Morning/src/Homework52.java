public class Homework52 {
    public static void main(String[] args) {
        System.out.println(sumNumbers("abc123xyz"));// → 123
        System.out.println(sumNumbers("aa11b33"));// → 44
        System.out.println(sumNumbers("7 11")); //→ 18
    }

    public static int sumNumbers(String str) {
        int sum = 0;
        String number = "0";
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (Character.isDigit(symbol)) {
                number += ("" + symbol);
            } else {
                sum += Integer.parseInt(number);
                number = "0";
            }
        }
        sum += Integer.parseInt(number);
        return sum;
    }
}
