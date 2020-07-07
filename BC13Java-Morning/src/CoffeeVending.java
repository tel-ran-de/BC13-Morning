public class CoffeeVending {
    public static void main(String[] args) {
        int customerChooseOne = 11;
        int customerChooseTwo = 12;
        int customerChooseThree = 1111;

        coffeeSwitch(customerChooseOne);
        split();
        coffeeSwitch(customerChooseTwo);
        split();
        coffeeSwitch(customerChooseThree);
        split();
    }

    public static void coffeeSwitch(int customerValue) {

        switch (customerValue) {
            case 11:
                CoffeeRecipes.americano();
                break;
            case 12:
                CoffeeRecipes.cappuccino();
                break;
            case 13:
                CoffeeRecipes.latte();
                break;
            case 14:
                CoffeeRecipes.hotWatter();
                break;
            default:
                System.out.println("Извините временно недоступно");
                break;
        }
    }

    public static void split() {
        System.out.println("-------------");
    }
}
