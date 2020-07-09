public class WarmUp {
    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1));//expecting "ktten"
        System.out.println(missingChar("kitten", 0));//expecting "itten"
        System.out.println(missingChar("kitten", 4));//expecting "kittn"
        System.out.println(missingChar("Andrey", 2));//expecting "Anrey"
        System.out.println("-------------------------------");
        System.out.println(backAround("cat"));
        System.out.println(backAround("hello"));
        System.out.println(backAround("a"));

    }

    public static String missingChar(String s, int n) {
        String output = "";
        output = s.substring(0, n) + s.substring(n + 1, s.length()-1);
        return output;
    }

    public static String backAround(String str){
        String output = "";
        int lastSymbol = str.length() - 1;
        output = str.substring(lastSymbol);
        return output + str + output;
    }
}

