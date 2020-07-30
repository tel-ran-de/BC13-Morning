public class HW26 {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd")); //→ "ad"
        System.out.println(starOut("ab**cd")); //→ "ad"
        System.out.println(starOut("sm*eilly")); //→ "silly"
    }

    private static String starOut(String str) {
        String output = "";
        char star = '*';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == star && str.charAt(i - 1) != star) {  // логическая ловушка
                output = str.substring(0, i - 1) + str.substring(i + 2);
            } else if (str.charAt(i) == star && str.charAt(i - 1) == star) {
                output = str.substring(0, i - 2) + str.substring(i + 2);
            }
        }
        return output;
    }
}
