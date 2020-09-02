public class HomeWork53Dina {
    public static void main(String[] args) {
        triangle(6);
    }

    private static void triangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
