public class StringClassWork {
    public static void main(String[] args) {
        System.out.println(oneTwo("abc"));// → "bca"
        System.out.println(oneTwo("tca")); // → "cat"
        System.out.println(oneTwo("tcagdo"));  // → "catdog"
        System.out.println(oneTwo("telran!?"));  // → "eltanr"
    }

    private static String oneTwo(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i = i + 3) {
            if (str.length() - i < 3) {
                //nothing
            } else {
                output = output + str.substring(i + 1, i + 3) + str.substring(i, i + 1);
            }
        }
        return output;
    }
}