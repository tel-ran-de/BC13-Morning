public class Review {
    public static void main(String[] args) {
        sum(3.14, "Мои первые varargs", 2, 3, 5, 89);
        citiesTable("Berlin", "München", "Düsseldorf", "Могилёв");
        System.out.println(charToString('А', 'н', 'д', 'р', 'е','й'));
    }

    // varargs
    private static void sum(double d, String name, int... allDigits) {
        int sum = 0;
        for (int i = 0; i < allDigits.length; i++) {
            sum += allDigits[i];
        }
        System.out.println(name + " " + sum);
    }

    public static void citiesTable(String... cities) {
        for (String elemntik : cities) {
            System.out.println(elemntik);
        }
    }

    public static String charToString(char... symbols) {
        String output = "";
        for (int i = 0; i < symbols.length; i++) {
            output += symbols[i];
        }

        return output;
    }
}
