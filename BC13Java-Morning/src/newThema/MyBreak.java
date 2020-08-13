package newThema;

public class MyBreak {
    public static void main(String[] args) {
        boolean stopLockdown = true;
        quarantineMethode(stopLockdown);
        //quarantineMethode(!stopLockdown);
    }

    private static void quarantineMethode(boolean stopLockdown) {
        // создание карантинной зоны
        int a = 10;

        {
            int temp = 7;
            a = a + temp;

        }

        System.out.println(a);

        quarantineZone:
        {
            if (stopLockdown) {
                System.out.println("Ура карантин закончен");
                break quarantineZone;// выход из зоны карантина
            }
            System.out.println("Мы в карантине");
        }
    }
}
