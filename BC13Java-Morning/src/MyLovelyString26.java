public class MyLovelyString26 {
    public static void main(String[] args) {
        /*System.out.println(countYZ("fez day"));// →2
        System.out.println(countYZ("day?fez"));// →2
        System.out.println(countYZ("day,fyyyz"));// →2
        System.out.println(countYZ("tel ran"));// →0
        System.out.println(countYZ("xyx!xzy"));// →1
        System.out.println(countYZ("London is the capital of Great Britain"));// →0
        System.out.println(gHappy("xxggxx"));// →true
        System.out.println(gHappy("xxgxx"));// →false
        System.out.println(gHappy("xxggyygxx"));// →false
        System.out.println(sameStarChar("xy*yzz"));// →true
        System.out.println(sameStarChar("xy*zzz"));// →false
        System.out.println(sameStarChar("*xa*az"));// →true*/
        System.out.println(starOut("ab*cd"));// →"ad"
        System.out.println(starOut("ab**cd"));// →"ad"
        System.out.println(starOut("sm*eilly"));// →"silly"

    }

    /* Возвращает версию заданной строки, в которой для каждой звезды () в строке звезда и символы сразу
    уходят влево и вправо.
    Таким образом, "abcd" дает "ad", а "ab**cd" также дает "ad".*/
    private static String starOut(String input) {
        String output = "";

        for (int i = 1; i < input.length() - 1; i++) {
            if (input.charAt(i) == '*') {
                // output = output + input.charAt(i - 1) + input.charAt(i) + input.charAt(i + 1);
                output = input.substring(0, (i - 1)) + input.substring(i + 2);
            }
        }
        // input == input.substring() - output;
        return output;
    }

    private static boolean sameStarChar(String s) {
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == '*' && s.charAt(i - 1) == s.charAt(i + 1)) {
                return true;
            }
        }

        return false;
    }

    /* Скажем, что строчная 'g' в строке "счастлива", если есть еще одна 'g' сразу слева или справа от нее.
    Возвращаем true, если все g в данной строке счастливы.*/
    private static boolean gHappy(String str) {
        int count = 0;
        int allG = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                allG++;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g' && (str.charAt(i - 1) != 'g' || str.charAt(i + 1) != 'g')) {
                count++;
                return true;
            }
        }
        if (count != allG)
            return true;
        return false;
    }

  /* Давая строку, считайте количество слов,
  заканчивающихся на 'y' или 'z' -- так что 'y' в слове "heavy" и 'z' в слове "fez" считаются,
  а не 'y' в слове "yellow" (не чувствительно к регистру). Мы скажем, что y или z находится в конце слова,
  если за ним не стоит буква в алфавитном порядке.
  (Примечание: Character.isLetter(char) проверяет, является ли символ буквы алфавита буквой).*/

    private static int countYZ(String s) {
        int wordsNumber = 0;

        for (int i = 1; i < s.length(); i++) {
            char tempChar = s.charAt(i);
            //if (s.charAt(i) == ' ' && (s.charAt(i - 1) == 'y' || s.charAt(i - 1) == 'z')) {
            if (!Character.isLetter(tempChar) && (s.charAt(i - 1) == 'y' || s.charAt(i - 1) == 'z')) {
                wordsNumber++;
            }
        }
        if (s.endsWith("y") || s.endsWith("z")) {
            wordsNumber++;
        }
        return wordsNumber;
    }
}
