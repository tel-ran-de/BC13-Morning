package oldlessons;

public class MyLovelyTernarOperator {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test2() {
        int a = 10;
        int b = 20;
        int c;
        c = (a > b) ? a : b;
        // переменная = (выражение) ? значение if true : значение if false
        System.out.println("ц из тернарного оператора " + c);
    }

    private static void test1() {
        int a = 10;
        int b = 20;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println("ц из if-else оператора " + c);
    }
}
