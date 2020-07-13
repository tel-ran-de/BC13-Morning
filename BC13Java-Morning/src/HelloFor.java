public class HelloFor {
    public static void main(String[] args) {
        //homeWork11();
        //homeWork11_2(10, 5);
        //homeWork11_3(5, 17);
        //homeWork11_4();
        homeWork11_5(10);

    }

    public static void homeWork11() {
        for (int i = 0; i < 20; i *= 2) {
            System.out.println(i);

        }

    }

    public static void homeWork11_2(int a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);

        }
    }

    public static void homeWork11_3(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i);

        }
    }

    public static void homeWork11_4() {
        for (int i = 3; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void homeWork11_5(int line) {
        String star = "*";
        String output = "";
        for (int i = 0; i < line; i++) {
            output = output + star;
            System.out.println(output);
            //System.out.println(output += star);
        }

    }
}
