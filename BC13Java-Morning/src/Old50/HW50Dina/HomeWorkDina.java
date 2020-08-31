package Old50.HW50Dina;

public class HomeWorkDina {
    public static void main(String[] args) {
        System.out.println(triangle(0));// → 0
        System.out.println(triangle(1));// → 1
        System.out.println(triangle(2));// → 3
        System.out.println("---------");
        System.out.println(count8(8));// → 1
        System.out.println(count8(818));// → 2
        System.out.println(count8(8818));// → 4
        System.out.println("---------");
        System.out.println(countHi("xxhixx"));// → 1
        System.out.println(countHi("xhixhix"));// → 2
        System.out.println(countHi("hi"));// → 1
        System.out.println("---------");
        System.out.println(noX("xaxb"));// → "ab"
        System.out.println(noX("abc"));// → "abc"
        System.out.println(noX("xx"));// → ""
    }

    /*Получив строку, вычислите рекурсивно новую строку, в которой были удалены все символы 'x'. */
    private static String noX(String str) {
       /* if (str.equals("")){
            return str;
        }*/
        if (str.length() < 1) {
            return "";
        }
        if (str.charAt(0) == 'x') {
            return noX(str.substring(1));
        }
        return str.charAt(0) + noX(str.substring(1));
    }

    /*Получив строку,
    вычислите рекурсивно (без циклов) количество раз, когда в строке появляется строка "hi" в нижнем регистре. */
    private static int countHi(String str) {
        String hi = "hi";
        if (str.length() < 2) {
            return 0;
        }
        if (str.substring(0, 2).equals(hi)) {
            return 1 + countHi(str.substring(2));
        }
        return countHi(str.substring(1));
    }


    /*При неотрицательном int n вычислите рекурсивно (без циклов) количество случаев 8 в качестве цифры,
    за исключением того, что 8 с еще 8 сразу слева считается двойным, так что 8818 дает 4. Обратите внимание,
    что mod (%) на 10 дает самую правую цифру (126 % 10 равно 6),
    в то время как разделение (/) на 10 убирает самую правую цифру (126 / 10 равно 12). */
    private static int count8(int n) {
        int rest = n / 10;
        if (n <= 8) {
            return 1;
        }
        if (n % 100 == 88) {
            return 2 + count8(rest);
        }
        if (n % 10 == 8) {
            return 1 + count8(rest);
        }
        return count8(rest);
    }

    /*У нас есть треугольник из блоков. Самый верхний ряд имеет 1 блок,
    следующий ряд вниз имеет 2 блока, следующий ряд имеет 3 блока, и так далее.
    Вычислите рекурсивно (без циклов или умножения) общее количество блоков в таком треугольнике
    с заданным количеством строк. */
    private static int triangle(int block) {
        if (block == 0) {
            return 0;
        }
        if (block > 1) {
            return 1 + 1 + triangle(block - 1);
        }
        return 1 + triangle(block - 1);
    }
}
