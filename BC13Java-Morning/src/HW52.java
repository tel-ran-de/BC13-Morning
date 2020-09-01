public class HW52 {
    public static void main(String[] args) {
        sumNumbers("abc123xyz");// → 123
        sumNumbers("aa11b33");// → 44
        sumNumbers("7 11"); //→ 18
    }

    private static void sumNumbers(String input) {
        String tempEnd = "";
        String tempStart = "";
        String left;
        String right;
        for (int j = input.length() - 1; j >= 0; j--) {
            if (Character.isDigit(input.charAt(j))) {
                tempEnd = input.substring(0, j + 1);
                break;
            }
        }
        for (int i = 0; i < tempEnd.length(); i++) {
            if (Character.isDigit(tempEnd.charAt(i))) {
                tempStart = tempEnd.substring(i);
                break;
            }
        }
        boolean isParsable = isParsable(tempStart);
        for (int i = 0; i < tempStart.length(); i++) {
            if (isParsable) {
                System.out.println(Integer.parseInt(tempStart));
                break;
            }
            if (!Character.isDigit(tempStart.charAt(i))) {
                left = tempStart.substring(0, i);
                right = tempStart.substring(i + 1);
                System.out.println(Integer.parseInt(left) + Integer.parseInt(right));
            }
        }
    }
    public static boolean isParsable(String str) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
