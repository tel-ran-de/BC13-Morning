public class Triangle {
    public static void main(String[] args) {
        triangleOne(6);
        System.out.println();
        triangleTwo(6);
    }

    private static void triangleTwo(int n) {
        String symbol = " ";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n * 2 - 1; j++) {
                if (j <= n - i || j >= n + i) System.out.print(symbol);
                else System.out.print(Math.abs(n - j) + 1);
            }
            System.out.println();
        }
    }

    private static void triangleOne(int n) {
        String symbol = " ";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n * 2 - 1; j++) {
                if (j <= n - i || j >= n + i) System.out.print(symbol);
                else System.out.print(i);
            }
            System.out.println();
        }
    }
}
