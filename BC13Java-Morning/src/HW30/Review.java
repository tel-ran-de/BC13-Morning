package HW30;

public class Review {
    public static void main(String[] args) {
        String[] cities = new String[]{"Berlin", "München", "Düsseldorf"};
        System.out.println(cities[0]);
        System.out.println(cities[2]);
        System.out.println(cities[1].charAt(1));

        int[] a1 = new int[10];
        System.out.println(a1[0]);
        a1[0] = 15;
        System.out.println(a1[0]);
        a1[5] = 100;

        int[] salary = new int[1000];
        salary[0] = 100000;
        salary[999] = 5;
        for (int i = 0; i < salary.length; i++) {
            if (i < 500) {
                salary[i] = salary[i] + 500;
            } else salary[i] = salary[i] + 100;
        }

        salary[777] = salary[777] + 1000;
    }
}
