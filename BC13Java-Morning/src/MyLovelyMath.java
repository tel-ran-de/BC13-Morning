public class MyLovelyMath {
    public static void main(String[] args) {
        changeInt();
    }

    public static void changeInt() {
        int a = 5;
        int b = 7;

        int temp = a;
        a = b;
        b = temp;

        //System.out.println(a);
        //System.out.println(b);
        // System.out.println(temp);

        a = a + b;
        b = a - b;
        a = a - b;

/*        System.out.println(a);
        System.out.println(b);*/

        a = a + b - (b = a);
        System.out.println(a);
        System.out.println(b);

        a = a ^ b;
        b = b ^ a;
       int  c = a ^ b;

        System.out.println(a);
        System.out.println(b);
    }
}
