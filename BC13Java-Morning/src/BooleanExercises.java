public class BooleanExercises {
    public static void main(String[] args) {
        /*System.out.println(nearTen(12));// → true
        System.out.println(nearTen(17));// → false
        System.out.println(nearTen(19));// → true
        System.out.println(teaParty(6, 8));// → 1
        System.out.println(teaParty(3, 8));// → 0
        System.out.println(teaParty(20, 6));// → 2
        System.out.println(twoAsOne(1, 2, 3));// →true
        System.out.println(twoAsOne(3, 1, 2));// →true
        System.out.println(twoAsOne(3, 2, 2));// →false
        System.out.println(lastDigit(23, 19, 13));// → true
        System.out.println(lastDigit(23, 19, 12));// → false
        System.out.println(lastDigit(23, 19, 3));// → true
        System.out.println(maxMod5(2, 3));// → 3
        System.out.println(maxMod5(6, 2));// → 6
        System.out.println(maxMod5(3, 2));// → 3*/
        System.out.println(blueTicket(9, 1, 0));// → 10
        System.out.println(blueTicket(9, 2, 0));// → 0
        System.out.println(blueTicket(6, 1, 4));// → 10
        System.out.println(blueTicket(20, 6, 4));// → 10

    }

    /*  У вас есть синий лотерейный билет, с вставками a, b и c.
    Это делает три пары, которые мы называем ab, bc и ac.
    Рассмотрим сумму цифр в каждой паре. Если любая пара сложится ровно в 10, то результат будет 10.
    Иначе, если сумма ab ровно на 10 больше, чем сумма bc или ac, то результат равен 5. Иначе результат равен 0.*/
    private static int blueTicket(int a, int b, int c) {
        if (a + b == 10 || b + c == 10 || c + a == 10) {
            return 10;
        } else if (Math.abs(a - c) == 10 || Math.abs(b - a) == 10 || Math.abs(a - b) == 10) {
            return 5;
        }

        return 0;
    }

    private static int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a % 5 == b % 5) {
            if (a > b) {
                return b;
            } else {
                return a;
            }
        } else if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /* */

    private static boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10;
    }

    /* Верните true если сумма любых двух чисел из трех равна оставшимся*/
    private static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || b + c == a || c + a == b;
    }


    /* Мы устраиваем вечеринку с большим количеством чая и конфет.
        Возвращаем int результат вечеринки, закодированный как 0=bad, 1=good, или 2=great.
        Вечеринка хороша (1), если и чай, и конфеты как минимум 5.
        Однако, если чай или конфеты как минимум в два раза больше, чем другая, то вечеринка великолепна (2).
        Однако, во всех случаях, если чай или конфета меньше 5, вечеринка всегда плохая (0).*/
    private static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } /*else if (tea >= 5 & candy >= 5) {
            return 1;
        }*/ else if ((tea * 2 <= candy) || (candy * 2 <= tea)) {
            return 2;
        }

        return 1;
    }

    /* При получении неотрицательного числа "num", возвращаем true,
    если число находится в пределах 2 от кратного числа 10.
    Примечание: (a % b) - это остаток от деления a на b, поэтому (7 % 5) - это 2. См. также: Введение в Мод*/
    private static boolean nearTen(int num) {
        return num % 10 <= 2 || num % 10 >= 8;
    }


}
