package HW30;

public class MySchoolMath {
    public static void main(String[] args) {
        // 15  и 60 , нод = 15
        // 7 и 3,  нод = 1

        //нод
/*        System.out.println(greatestCommonDivisor(15, 60)); // 15
        System.out.println(greatestCommonDivisor(7, 3)); // 1
        System.out.println(greatestCommonDivisor(5, 15)); // 5
        System.out.println(greatestCommonDivisor(9, 12)); // 3
        System.out.println(greatestCommonDivisor(8, 9)); //1*/

        // нок
        System.out.println(leastCommonMultiple(60, 15)); // 60
        System.out.println(leastCommonMultiple(8, 9)); // 72
        System.out.println(leastCommonMultiple(7, 3)); // 21
    }

    public static int leastCommonMultiple(int a, int b) {
        return a / greatestCommonDivisor(a, b) * b;
    }

    public static int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return greatestCommonDivisor(b, a % b);
    }
}
