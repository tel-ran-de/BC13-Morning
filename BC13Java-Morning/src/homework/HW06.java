package homework;

/**
 * Напишите программу действий кассира магазина, если у него пытаются купить алкоголь следующие 5 покупателей:
 * 10 лет, 17 лет, 18 лет, 20 лет и 30 лет.
 * <p>
 * Напишите программу, которая определяет сезон года.
 * На вход приходят месяцы
 * Месяца указаны int переменными.
 */
public class HW06 {
    public static void main(String[] args) {
/*        alcoholPermission(10);  // запрет
        alcoholPermission(18);  // разрешение
        alcoholPermission(0);  // запрет
        alcoholPermission(100); // разрешение
        alcoholPermission(30); // разрешение*/

        System.out.println(forSeason(10));
        System.out.println(forSeason(0));
        System.out.println(forSeason(100));
    }
    public static String forSeason(int monthNumber) {
        String season = "";
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                season = "сезон не определён";
                break;
        }
        return season;
    }

    public static void alcoholPermission(int age) {
        // customer = 10,17,18,20,30
        switch (age) {
            case 10:
                System.out.println("Продажа алкоголя запрещена");
                break;
            case 17:
                System.out.println("Только пиво, крепкий алкоголь нельзя");
                break;
            case 18:
            case 20:
            case 30:
                System.out.println("Можно продавать любой алкоголь");
                break;
            default:
                System.out.println("Простите у меня зависла касса, я пока продать ничего не могу");
                break;
        }
    }
}
