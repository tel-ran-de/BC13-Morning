public class HelloFor {
    public static void main(String[] args) {
        // helloFor();
        myLittleFor();
    }

    public static void helloFor() {
        for (double i = 30; i >= -10; i /= 3) {
            System.out.println("И = " + i);
        }
    }

    public static void myLittleFor() {
        int a = 0;
        int b = 0;
        int i;
        for (i = 0; i < 25; i++) {
            a++;
        }
        System.out.println(a);
        for ( ;i < 45; i++) {
            b = 7;
            a = a + b;
            a++;
        }
        System.out.println(i);
        System.out.println(b);
        System.out.println(a);
    }

            /*    for (начало; условие; шаг) {
            // ... тело цикла ... в котором можно выполнять одну, две, три или даже очень много операций.
                }
            for (initialization condition; testing condition; increment/decrement){
                    statement(s)}*/

}
