package homework34;

public class HW03 {
    public static double findSquareCircle(double radius) {
        final double PI = Math.PI;
        return PI * radius * radius;
    }

    public static double findCircumference(double radius) {
        final double PI = Math.PI;
        return 2 * PI * radius;
    }

    public static double currencyConverterEuroToDollar(double euro) {
        double rate = 1.1;
        // dollar to euro summa /k ;
        return euro * 1.1;
    }

    public static double belarusToUkraine() {
        double belarus = 207595;
        double ukraine = 603628;
        return belarus / ukraine;
    }

    public static double findSquareRelation(double s1, double s2) {
        return s1 / s2;
    }

    public static double bankPercent(int year, double perCent, double amount) {
        double myCooficient = 0.0;
        return amount + amount * year * perCent / 100;
    }
}
