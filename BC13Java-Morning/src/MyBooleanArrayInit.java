import java.util.Arrays;

public class MyBooleanArrayInit {
    public static void main(String[] args) {
        boolean[] b = new boolean[10];
        myPrintForBoolArray(b);
        myPrintForBoolArray(fillBooleanArray(b));
    }

    private static boolean[] fillBooleanArray(boolean[] b) {
        for (int i = 0; i < b.length; i++) {
            b[i] = (Math.random() >= 0.5);
        }
        return b;
    }

    private static void myPrintForBoolArray(boolean[] b) {
        System.out.println("Массив с логическими данными, булевыми данными, длиной - " + b.length);
        for (int i = 0; i < b.length - 1; i++) {
            System.out.print(b[i] + ", ");
        }
        System.out.println(b[b.length - 1] + ".");
    }
}
