public class MyLovelyRecursion {
    public static void main(String[] args) {
      /*  System.out.println(bunnyEars2(0));// → 0
        System.out.println(bunnyEars2(1));// → 2
        System.out.println(bunnyEars2(2));// → 5
        System.out.println(bunnyEars2(100));// → 5
        System.out.println(count7(717));// → 2
        System.out.println(count7(7));// → 1
        System.out.println(count7(123));// → 0*/

        System.out.println(countX("xxhixx"));// →4
        System.out.println(countX("xhixhix"));// →3
        System.out.println(countX("hi"));// →0
    }

    private static int countX(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.charAt(0) == 'x') {
            return 1 + countX(s.substring(1));
        }
        return countX(s.substring(1));
    }

    private static int countXSimple(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'x') {
                count++;
            }
        }

        return count;
    }

    private static int count7(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 7) {
            return 1 + count7(n / 10);
        }
        return count7(n / 10);
    }

    private static int count7Simple(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {

            if (n % 10 == 7) {
                count++;
                n = n / 10;
            } else {
                n = n / 10;
            }
        }

        return count;
    }

    private static int bunnyEars2(int rabbit) {
        if (rabbit == 0) {
            return 0;
        }
        if (rabbit % 2 == 1) {                          //проверка нечетности
            return 2 + bunnyEars2(rabbit - 1);
        }
        return 3 + bunnyEars2(rabbit - 1);      //остались только четные
    }

    private static int bunnyEars2Simple(int rabbit) {
        int result = 0;
        /*if (rabbit % 2 == 0) {
            result = 3;
        } else {
            result = 2;
        }*/
        result = rabbit * 2 + rabbit / 2;
        return result;
    }


}
