
public class MyLovelyFor {
    public static void main(String[] args) {
        worker();
    }

    public static void worker() {
        String worker1 = "Даша";
        String worker2 = "Маша";
        String worker3 = "Саша";
        String worker4 = "Глаша";
        String worker5 = "Миша";
        String worker6 = "Паша";

        int worker1ID = 1;
        int worker2ID = 2;
        int worker3ID = 3;
        int worker4ID = 4;
        int worker5ID = 5;
        int worker6ID = 6;

        salary(worker6ID);
    }

    public static void salary(int countIDs) {
        int a = 5;
        a++;
        String dasha = "Даша";
        for (int i = 0; i < countIDs; i++) {
            System.out.println("Работник с ID nomer = " + " должен получить " + (1000 + i * countIDs));
        }

        for (int j = 0; j < 100; j = j + 1) {

        }
        for (int i = 1000; i < 0; i = i - 10) {

        }
    }
}
