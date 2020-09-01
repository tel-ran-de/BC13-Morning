

public class HW52Alex {

    public static void main(String[] args) {
        System.out.println(sumNumbers("abc123xyz")); //  → 123
        System.out.println(sumNumbers("aa11b33")); // → 44
        System.out.println(sumNumbers("7 11")); // → 18
    }

        // Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
        // A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char)
        // tests if a char is one of the chars ‘0’, ‘1’, .. ‘9’. Integer.parseInt(string) converts a string to an int.)

        public static int sumNumbers (String input){
            // создаём переменную sum
            // пропускаем через цикл наш input
            // проверяем являются ли символы цифрами
            // суммируем все цифры

            int sum = 0;
            String temp = "";
            for (int i = 0; i < input.length(); i++) {
                if (Character.isDigit(input.charAt(i))) {
                    if (i < input.length() - 1 && Character.isDigit(input.charAt(i + 1))) {
                        temp += input.charAt(i);
                    } else {
                        temp += input.charAt(i);
                        sum += Integer.parseInt(temp);
                        temp = "";
                    }
                }
            }
            return sum;
        }
    }

