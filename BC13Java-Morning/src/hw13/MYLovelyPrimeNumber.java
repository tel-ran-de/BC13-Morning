package hw13;

public class MYLovelyPrimeNumber {
    public static void main(String[] args) {
/*        int test1 = 15;
        System.out.println("Мы проверяем число " + test1 + " и оно у нас " + primeNumberOne(test1));
        listeMePlizPrimeNumber(10);*/
        primeNumberTwo(100);

    }

    public static void listeMePlizPrimeNumber(int range) {
        for (int i = 2; i < range; i++) {
            if (primeNumberOne(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean primeNumberOne(int myToCheckNumber) {
        // Если число делится на другое число меньше его без остатка, то тогда не праймнамба
        for (int i = 2; i < myToCheckNumber; i++) {
            if (myToCheckNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeNumberTwo(int range) {
        for (int i = 2; i < range; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) count++;
            }
            if (count < 2) {
                System.out.println(i);
            }
        }

    }
}
