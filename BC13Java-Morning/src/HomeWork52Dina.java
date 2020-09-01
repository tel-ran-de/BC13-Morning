public class HomeWork52Dina {
    public static void main(String[] args) {
        System.out.println(sumNumbers("abc123xyz"));// → 123
        System.out.println(sumNumbers("aa11b33"));// → 44
        System.out.println(sumNumbers("7 11")); //→ 18
    }

    private static int sumNumbers(String input) {
       /* int sum = 0;
        String temp = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                if (i < input.length() -1 && Character.isDigit(input.charAt(i + 1))){
                    temp += input.charAt(i);
                }else {
                    temp += input.charAt(i);
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }

        return sum;
    }*/
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                for (int j = i + 1; j < input.length() + 1; j++) {
                    if (j == input.length() || !Character.isDigit(input.charAt(j))) {
                        sum += Integer.parseInt(input.substring(i, j));
                        i = j;
                        break;
                    }
                }
            }
        }

        return sum;
    }

}
