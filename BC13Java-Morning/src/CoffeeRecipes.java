public class CoffeeRecipes {

    public static void latte() {
        System.out.println("-----------");
        System.out.println("Ваш latte готов");
        milk(40);
        coffee(30);
        water(70);
        System.out.println("-----------");
    }

    public static void cappuccino() {
        System.out.println("-----------");
        System.out.println("Ваш cappuccino готов");
        milk(30);
        coffee(40);
        water(20);
        System.out.println("-----------");
    }

    public static void hotWatter() {
        System.out.println("-----------");
        System.out.println("Ваш кипяток готов");
        water(100);
        System.out.println("-----------");
    }

    public static void americano() {
        System.out.println("-----------");
        System.out.println("Ваш americano готов");
        coffee(40);
        water(50);
        System.out.println("-----------");
    }

    public static void milk(int ml) {
        System.out.printf("Added %d ml of milk \n", ml);
    }

    public static void water(int ml) {
        System.out.printf("Added %d ml of water \n", ml);
    }

    public static void coffee(int mg) {
        System.out.printf("Added %d mg of coffee \n", mg);
    }
}
