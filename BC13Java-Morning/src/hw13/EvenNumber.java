package hw13;

public class EvenNumber {
    public static void main(String[] args) {
        listeMeEvenNumber(45);
    }

    public static void listeMeEvenNumber(int range) {
        for (int i = 0; i < range; i++) {
            if (findEvenNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static void listMeOddNumber(int range) {
        for (int i = 0; i < range; i++) {
            if (!findEvenNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean findEvenNumber(int number) {
        return number % 2 == 0;
    }
}
