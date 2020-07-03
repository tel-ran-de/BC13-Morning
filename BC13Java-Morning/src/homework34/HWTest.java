package homework34;

public class HWTest {
    public static void main(String[] args) {
        split();
        double testRadius = 15.0;
        double clientSquare = HW03.findSquareCircle(testRadius);
        System.out.println("Площадь круга для любимого клиента " + clientSquare);
        split();
        double clientCircumference = HW03.findCircumference(testRadius);
        System.out.println("Длина окружности для любимого клиента " + clientCircumference);
        split();
        double amount = 1000;
        System.out.println("Валютный конвертер евро в доллар "
                + HW03.currencyConverterEuroToDollar(amount));
        split();

        System.out.println("B и У " + HW03.belarusToUkraine());
        split();
        System.out.println("M i B " + HW03.findSquareRelation(2511.0, 891.8));
        split();
        System.out.println(HW03.bankPercent(7, 3.5, 1000.0));
        split();

    }

    public static void split() {
        System.out.println("--------------------");
    }
}
