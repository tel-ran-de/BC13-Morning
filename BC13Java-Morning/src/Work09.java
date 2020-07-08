public class Work09 {
    public static void main(String[] args) {
        int a = 7;
        int b = 15;
        System.out.println(findIntegers(a, b));
        System.out.println(addition(a, b));
        System.out.println(getStringMonth(48));

    }

    public static boolean findIntegers(int a, int b) {

        return a >= 10 && a < 21 || b >= 10 && b < 21;
    }

    public static int addition(int a, int b) {
        return a + b;

    }

    public static String getStringMonth(int month) {
        String monthString = "";
        switch (month) {
            case 1:
                monthString = "Январь";
                break;
            case 2:
                monthString = "Февраль";
                break;
            case 3:
                monthString = "Март";
                break;
            case 4:
                monthString = "Апрель";
                break;
            case 5:
                monthString = "Май";
                break;
            case 6:
                monthString = "Июнь";
                break;
            case 7:
                monthString = "Июль";
                break;
            case 8:
                monthString = "Август";
                break;
            case 9:
                monthString = "Сентябрь";
                break;
            case 10:
                monthString = "Октябрь";
                break;
            case 11:
                monthString = "Ноябрь";
                break;
            case 12:
                monthString = "Декабрь";
                break;

            default:
                monthString = "Invalid month ";
                break;

        }

        return monthString;
    }
}
