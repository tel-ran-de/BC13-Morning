public class TryAndCry {
    public static void main(String[] args) {
/*        int[] array = new int[5];
        int element = array[5];*/
        testArr();
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
        }finally {
            System.out.println("Выполнение завершающего блока, " +
                    "например рестарт программы или шеф всё плохо посмотри чё тута.");
        }

        // И ВСЁ РАВНО РАБОТАЙ ДАЛЬШЕ
        System.out.println("Область видимости программы, вне конструкта TRY AND CATCH");
    }
}
