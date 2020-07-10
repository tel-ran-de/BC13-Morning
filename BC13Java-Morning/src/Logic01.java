public class Logic01 {
    public static void main(String[] args) {
       /* System.out.println(smartDepositBox(true, false));// true
        System.out.println(smartDepositBox(false, true));//true
        System.out.println(smartDepositBox(false, false));//false
        System.out.println("______________________");
        System.out.println(smartDepositBoxTwo(true, false));//false
        System.out.println(smartDepositBoxTwo(false, true));//false
        System.out.println(smartDepositBoxTwo(false, false));//false
        System.out.println(smartDepositBoxTwo(true, true));//true
        System.out.println(bigBadaBoom(true, true));//true
        System.out.println(bigBadaBoom(false, false));//false
        System.out.println(bigBadaBoom(true, false));//false*/
        //System.out.println(verySmartDepositBox(true, true, false));
        System.out.println(doorbell(true, true)); //->false
        System.out.println(doorbell(false, false));// ->false
        System.out.println(doorbell(true, false));// ->true
    }

    public static boolean smartDepositBox(boolean mamaTouch, boolean papaTouch) {
        //return mamaTouch || papaTouch;
        if (mamaTouch || papaTouch) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean smartDepositBoxTwo(boolean mamaTouch, boolean papaTouch) {
        return mamaTouch && papaTouch;
    }

    public static boolean bigBadaBoom(boolean captain01, boolean captain02) {
        return captain01 && captain02;
    }

    public static boolean verySmartDepositBox(boolean mamaPermission, boolean papaPermission, boolean omaPermission) {
        //return mamaPermission && papaPermission || omaPermission;
        return omaPermission || smartDepositBoxTwo(mamaPermission, papaPermission);
    }

    public static boolean doorbell(boolean bell01, boolean bell02) {
        return bell01 ^ bell02;
    }

}
