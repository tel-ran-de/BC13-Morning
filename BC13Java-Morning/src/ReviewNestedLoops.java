public class ReviewNestedLoops {
    public static void main(String[] args) {
        multiplicationsTable(10);
    }

    private static void multiplicationsTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(formatForMPTable(i, j));
            }
            System.out.println();
        }
    }

    private static String formatForMPTable(int i, int j) {
        String result = "" + i * j;
        if (i * j < 10) {
            result = "   " + i * j;
        } else if (i * j < 100) {
            result = "  " + String.valueOf(i * j);
        } else if (i * j < 1000) {
            result = " " + String.valueOf(i * j);
            return result;
        }
        return result;
    }

    public static void nestedLops() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Внешний круг");
            for (int j = 0; j < 6; j++) {
                System.out.println("Пирожки " + j);
            }
        }
    }
}
