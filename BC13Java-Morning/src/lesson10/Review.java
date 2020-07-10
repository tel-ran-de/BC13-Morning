package lesson10;

public class Review {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        a = a + a + a + b;
        System.out.println(a);
        String name = "Вася";
        String lastname = "Васечкин";

        name = name + name + name + lastname;
        System.out.println(name);
        name = name.substring(0, 5) + name.substring(7, 10) + name.substring(3,50);
        System.out.println(name);
    }
}
