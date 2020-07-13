public class HomeWork11 {

    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 6)); // true
        System.out.println(parrotTrouble(true, 7)); //  false
        System.out.println(parrotTrouble(false, 6)); // false
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        //return (hour < 7 || hour > 20) && talking;
        if ((hour < 7 || hour > 20) && talking) {
            return true;
        }
        return false;
    }
}