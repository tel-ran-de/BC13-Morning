public class TryAndCry {
    public static void main(String[] args) {
/*        int[] array = new int[5];
        int element = array[5];*/
        //testArr();
        myParsing();
    }

    private static void myParsing() {
        String strOne = "1965";
        String strTwo = "№123";
        int numOne = Integer.parseInt(strOne);
        System.out.println(numOne);
        try {
            int numTwo = Integer.parseInt(strTwo);
            System.out.println(numTwo);
        } catch (NumberFormatException ex) {
            System.out.println("exception caught");
        } finally {
            System.out.println("nothing happened");
            System.out.println("use Character.isDigit() and for loop for solving issue");
        }


    }

    private static void testArr() {
        int[] array = new int[5];
        try {
            int element = array[5];
            // это условие скорее всего никогда не выполнится
            // патамушта у нас есть ошибка выше
            System.out.println("Я НИКОГДА НЕ УВИЖУ ТЕРМИНАЛ");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("МЫ ПОЙМАЛИ ОШИБКУ, вылетела ошибка номер 456");
        } finally {
            System.out.println("Выполнение завершающего блока, " +
                    "например рестарт программы или шеф всё плохо посмотри чё тута.");
        }

        // И ВСЁ РАВНО РАБОТАЙ ДАЛЬШЕ
        System.out.println("Область видимости программы, вне конструкта TRY AND CATCH");
    }
}
