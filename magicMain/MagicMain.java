public class MagicMain {
    public static void main(String[] args) {
        String argument = args[0];
        simpleIf(argument);
    }

    public static void simpleIf(String arg) {
        if (arg.equals("hello")) {
            System.out.println("Hello World");
        } else {
            System.out.println("plz repeat your input");
        }
    }

    private static void simple(String[] args) {
        for (String str : args) {
            System.out.println("My arguments = " + str);
        }
    }
}