public class Work0902 {
    public static void main(String[] args) {
        //System.out.println(nearHundred(93)); //ожидаем true
        //System.out.println(nearHundred(90)); //ожидаем true
        //System.out.println(nearHundred(89)); //ожидаем false
        //System.out.println(getPercent(1000.0, 7.0));
        System.out.println(findElectricityPrice(50));
    }

    public static boolean nearHundred(int digit) {
        int range = 10;
        return Math.abs(digit - 100) <= range || Math.abs(digit - 200) <= range;
    }

    public static double getPercent(double amount, double interest) {
        return amount / 100 * interest;
    }

    public static double findElectricityPrice(double kwh) {
        double basicKwhPrice = 0.2;
        double basicPrice = 30.0;
        double basicKwh = 100.0;
        double resultPrice;
        if (kwh > 100) {
            kwh = kwh - basicKwh;
            resultPrice = kwh * basicKwhPrice + basicPrice;
        } else {
            resultPrice = basicPrice;
        }

        return resultPrice;
    }
}
