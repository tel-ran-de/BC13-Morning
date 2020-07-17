public class ExercisesString01 {
    public static void main(String[] args) {
        //System.out.println(helloName("Bob"));
        System.out.println(makeOutWord("<<>>", "Jay"));
        System.out.println(firstHalf("WooHoo"));
    }

    public static String helloName(String name) {
        String hallo = "Hello ";
        String symbol = "!";
        char quotationMark = '"';
        String result = quotationMark + hallo.concat(name + symbol) + quotationMark;
        return result;
    }

    public static String makeOutWord(String symbol, String word) {
        //String start = "";
        //symbol = symbol.substring(0,symbol.length()/2);
        //System.out.println(symbol);
        return symbol.substring(0, symbol.length() / 2) + word + symbol.substring(symbol.length() / 2);
    }

    public static String firstHalf(String word) {
        return word.substring(0, word.length() / 2);
    }

}