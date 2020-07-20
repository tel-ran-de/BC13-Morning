public class Main {
    public static void main(String[] args) {
        //mySimpleFor();
        // mySimpleWhile();
        // mySimpleDoWhile();
        myNotSimpleWhile();
    }

    private static void myNotSimpleWhile() {
        int i = 0;
        while (true) {
            System.out.println(i);
            i++;
            if (i > 20) {
                break;
            }
            // nested loops
            for (int j = 0; j < 20; j++) {
                System.out.println(j);
            }
        }
    }

    private static void mySimpleDoWhile() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 0);
    }

    private static void mySimpleWhile() {
        int i = 0;
        while (i < 20) {
            System.out.println(i);
            i++;
        }
    }

    private static void mySimpleFor() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }
}
