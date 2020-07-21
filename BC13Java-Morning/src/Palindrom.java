public class Palindrom {
    public static void main(String[] args) {
       // System.out.println(checkPalindrom("Was It A Rat I Saw"));
        System.out.println(checkPalindrom("А роза упала на лапу Азора"));
        System.out.println(checkPalindrom("А роза упала на лапу Азора"));
       // System.out.println(checkPalindrom("поп"));        //-> true  
      //  System.out.println(checkPalindrom("школа"));
        // System.out.println(deleteSpace("a rosa upala na lapu"));
    }

    public static boolean checkPalindrom(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output = input.charAt(i) + output;
        }
        input = deleteSpace(input).toLowerCase();
        output = deleteSpace(output).toLowerCase();
        //System.out.println(input);
        return input.equals(output);
    }

    public static String deleteSpace(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (!(input.substring(i, i + 1).equals(" "))){
                //if (input.charAt(i) != ' ') {
                output = output + input.charAt(i);
            }
        }
        //System.out.println(output);
        return output;
    }
}
