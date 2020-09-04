public class HW52_String03_Exercise_04 {
    public static void main(String[] args) {
        System.out.println(sumNumbers("abc123xyz"));// → 123
        System.out.println(sumNumbers("aa11b33"));// → 44
        System.out.println(sumNumbers("7 11"));// → 18
    }

    public static int sumNumbers(String s) {
        int sum = 0;
        int totalSum = 0;
        String digit = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                digit += s.charAt(i);
                sum = Integer.parseInt(digit);
            } else {
                totalSum += sum;
                digit = "";
                sum = 0;
            }
        }
        totalSum = totalSum + sum;
        return totalSum;
    }
}
