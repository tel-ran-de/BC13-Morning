public class CurrencyConverter {
    /*
    Реализовать метод, который принимает название валюты (например, “EUR”,”RUR”,”USD”,”GPB”) и выдает курс к
    доллару. Естественно, “USD” возвращает 1.0
     */
    public static void main(String[] args) {
/*        System.out.println(findCurrencyCourse("eur"));
        System.out.println(findTwoCurrencyCourse("GPB", "RUR")); // ожидаем 89*/
        System.out.println(findCurrencySum(100, "EUR", "RUR")); // Ожидаю более 200 рублей
    }

    public static double findCurrencySum(double amount, String inputName, String outputName) {
        return findTwoCurrencyCourse(inputName, outputName) * amount;
    }

    public static double findTwoCurrencyCourse(String firstCurrencyName, String secondCurrencyName) {
        return findCurrencyCourse(firstCurrencyName) / findCurrencyCourse(secondCurrencyName);
    }

    public static double findCurrencyCourse(String currencyName) {
        currencyName = currencyName.toUpperCase();
        double currencyCourse = 0.0;
        switch (currencyName) {
            case "EUR":
                currencyCourse = 1.12;
                break;
            case "RUR":
                currencyCourse = 0.014;
                break;
            case "USD":
                currencyCourse = 1.0;
                break;
            case "GPB":
                currencyCourse = 1.25;
                break;
            case "BYN":
                currencyCourse = 0.41;
                break;
            case "UAH":
                currencyCourse = 0.03;
                break;
            default:
                currencyCourse = 0.0;
                break;
        }
        return currencyCourse;
    }
}
