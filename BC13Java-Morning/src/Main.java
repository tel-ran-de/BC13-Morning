public class Main {
    public static void main(String[] args) {
        int rowIndex = 1;
        for (int x = 1; x <= 36; x++) {
            for (int y = x; y <= 36; y++) {
                for (int z = y; z <= 36; z++) {
                    if (x * y * z == 36) {
                        System.out.println(rowIndex + ") " + "x = " + x + ", y = " + y + ", z = " + z);
                        rowIndex++;
                    }
                }
            }
        }
    }
}
