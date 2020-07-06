import java.sql.SQLOutput;

public class HelloSwitchCase {
    public static void main(String[] args) {
        int customerValue = 1;
        coffeeVending(customerValue);
    }

    public static void coffeeVending(int customerValue) {

        switch (customerValue) {
            case 1:
                System.out.println("Кофе американо готовится");
                break;
            case 2:
                System.out.println("Кипяток сейчас будет");
                break;
            case 3:
                System.out.println("Кофе эспрессо готовится");
                break;
            case 4:
                System.out.println("Какао уже в пути");
                break;
            case 5:
                System.out.println("Вода кипятится");
                System.out.println("Кофе мелется");
                System.out.println("Сливки добавляются");
                System.out.println("Настроение подымается");
                break;
            default:
                System.out.println("Повторите пожалуйста свой выбор: "
                        + customerValue + " временно недоступен");
                break;
        }
        System.out.println("Программа приготовления кофе отработана без ошибок");
    }
}
