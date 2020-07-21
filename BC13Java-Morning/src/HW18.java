
public class HW18 {
    public static void main(String[] args) {
        hwFor(5, 8);
        hwDoWhile(3, 10);
    }

    private static void hwDoWhile(int a, int b) {
        int i = 0;
        do {
            System.out.println(a);
            i++;
        } while (i < b);

    }

    private static void hwFor(int a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
}
