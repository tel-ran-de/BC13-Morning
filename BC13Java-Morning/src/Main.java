public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        a += b;
        int d = 3;
        int f = 4;
        d *= f;  // d = d *f;
        d /= f;
        a /= f;
        System.out.println(a);
        d %= a; // d = d % a;
        System.out.println(d);
    }
}
