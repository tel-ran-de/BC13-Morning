package hw13;

public class LeapYear {
    public static void main(String[] args) {
        //System.out.println(findSimpleLeapYear(1999));
/*        System.out.println(findHardestLeapYear(2000)); // ожидаю тру
        System.out.println(findHardestLeapYear(1999)); // ожидаю false
        System.out.println(findHardestLeapYear(1900)); // ожидаю false
        System.out.println(findHardestLeapYear(2020)); // ожидаю труе*/

        System.out.println(myLovelyLeapYearWithBoolean(2000));
        System.out.println(myLovelyLeapYearWithBoolean(1999));
        System.out.println(myLovelyLeapYearWithBoolean(1900));
        System.out.println(myLovelyLeapYearWithBoolean(2020));
    }

    public static boolean findSimpleLeapYear(int year) {
        return year % 4 == 0;
    }

    public static boolean findHardestLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else return false;
    }

    public static boolean myLovelyLeapYearWithBoolean(int year) {
        // return (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0);
        return (year % 400 == 0) || (year % 4 == 0) ^ (year % 100 == 0);
    }
}
