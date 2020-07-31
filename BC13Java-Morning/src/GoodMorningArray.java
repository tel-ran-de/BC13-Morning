public class GoodMorningArray {
    // Массивы, Feld, Array
    public static void main(String[] args) {
        //myFirstArray();
        germanCities();
        String test = "Berlin" +
                "München" +
                "Dresden" +
                "Hamburg" +
                "Leipzig" +
                "Bremen" +
                "Frankfurt" +
                "Köln";
        System.out.println(test.length());
    }

    public static void myFirstArray() {
        int[] myArray;
        String[] users;
        double[] gpsPoints;
        boolean[] truthTable;
        char[] cyrillicAlphabet;
    }

    public static void mySecondArray() {
        int myArray[];
        String users[];
        double gpsPoints[];
        boolean truthTable[];
        char cyrillicAlphabet[];
    }

    public static void arrayFirstInitialisation() {
        String[] fourSeasons = new String[]{"Зима", "Vivaldi", "Чайковский", "Кинг", "Гостиница"};
        int[] numberFibonacci = new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        String[] capitalsOfUdssr = new String[]{"Москва", "Минск", "Киев", "Кишинёв", "Тбилиси"};
        char[] cyrillic = new char[]{'ж', 'л', 'ю', 'ч'};
        char[] cyrillic2 = new char[33];
        double[] time = new double[]{10.25, 15.45, 20.30};
    }

    public static void arraySecondInitialisation() {
        int[] field;
        field = new int[10]; // в массиве 10 ячеек
    }

    public static void germanCities() {
        String[] deutschStaedte = new String[]
                {
                        "Berlin",
                        "München",
                        "Dresden",
                        "Hamburg",
                        "Leipzig",
                        "Bremen",
                        "Frankfurt",
                        "Köln"
                };
        int laenge = deutschStaedte.length;
        int allLetter = 0;
        for (int i = 0; i < laenge; i++) {
            allLetter = allLetter + deutschStaedte[i].length();
        }
        System.out.println(allLetter);
    }
}
