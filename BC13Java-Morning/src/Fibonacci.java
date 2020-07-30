public class Fibonacci {
    static int count = 0;
    public static void main(String[] args) {
        simpleFibonacci(10);
        System.out.println(findFibonacciRecursion(4));
    }

    private static int findFibonacciRecursion(int number) {
        count++;
        System.out.println(count + " Нумбер " + number);
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return findFibonacciRecursion(number - 1) + findFibonacciRecursion(number - 2);
        }
    }

    private static void simpleFibonacci(int number) {
        int n0 = 0;
        int n1 = 1;
        int nN;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 1; i < number; i++) {
            nN = n0 + n1;
            System.out.print(nN + " ");
            n0 = n1;
            n1 = nN;
        }
        System.out.println();
    }


}
