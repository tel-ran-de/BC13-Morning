package l5;

/**
 * BC13Java-Morning
 * 03 12 : 11
 */
public class GoodMorningBoolean {
    public static void main(String[] args) {
        System.out.println("Разрешение на прогулку " + walking(26));
/*        int standaqrt = 0;
        String sts = "";
        double ds = 0.0;*/
    }

    public static boolean walking(double temperature) {
        boolean result = false;
        if (temperature > 25) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
