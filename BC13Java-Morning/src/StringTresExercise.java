public class StringTresExercise {
    public static void main(String[] args) {
       /* System.out.println(countYZ("fez day")); // exp.2
        System.out.println(countYZ("day fez")); // exp.2
        System.out.println(countYZ("day fyyyz")); // exp.2
        System.out.println(countYZ("tel ran")); // exp. 0
        System.out.println(countYZ("xyx,xzy")); // exp. 1
        System.out.println(countYZ("London is the capital of Great Britain")); // exp. 0*/
        System.out.println(gHappy("xxggxx")); // exp. true
        System.out.println(gHappy("xxgxx")); // exp. false
        System.out.println(gHappy("xxggyygxx")); // exp. false
    }

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
            }
        }
        if (count == 0) return true;
        return false;
    }

    private static int countYZ(String s) {
        int wordsNumber = 0;
        for (int i = 1; i < s.length(); i++) {
            //if (s.charAt(i) == ' ' && (s.charAt(i - 1) == 'y' || s.charAt(i - 1) == 'z')) {
            char tempChar = s.charAt(i);
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
