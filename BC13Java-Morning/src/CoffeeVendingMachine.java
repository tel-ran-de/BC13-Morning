public class CoffeeVendingMachine {
    public static void main(String[] args) {
        String input = args[0];
        switch (input) {
            case "hot water":
                Coffee.hotWater();
                break;
            case "latte":
                Coffee.latte();
                break;
            case "cappuccino":
                Coffee.cappuccino();
                break;
            case "americano":
                Coffee.americano();
                break;
            default:
                System.out.println("please choose again");
                break;
        }
    }
}
