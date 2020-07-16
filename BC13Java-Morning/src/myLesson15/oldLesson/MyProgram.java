package myLesson15.oldLesson;

public class MyProgram {
    public static void main(String[] args) {
        MyProgram.divide();
        divide();

        myTestMethod();
        test();
        test1();
        test2();
        shortttt();
    }

    private static void shortttt() {
    }


    protected static void test2() {
    }

    static void test1() {
    }

    private static void test() {
        System.out.println("это тест");
    }

    private static void myTestMethod() {
        test();
        myTestMethod();
    }

    public static int addition(int a, int b) {
        return 0;
    }

    public static void divide() {
        //очень хороший код
        int result = addition(5, 7);
    }
}
