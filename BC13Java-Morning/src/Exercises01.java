public class Exercises01 {
    public static void main(String[] args) {
/*        boolean mamaPermission = true;
        boolean papaPermission = true;
        boolean omaPermission = !papaPermission;

        boolean myIce = mamaPermission || !papaPermission;
        System.out.println(myIce);*/
        //System.out.println(sleepIn(false, false)); // мы ожидаем true

        System.out.println(diff21(19));//  → 2
        System.out.println(diff21(10));// → 11
        System.out.println(diff21(21));// → 0
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        } else {
            return Math.abs(n - 21);
        }
    }
}
