public class HelloIfElse {
    // Условный оператор if, if-else
    public static void main(String[] args) {
        int customerAge = 19;
        alcoholPermissionTwo(30);
        alcoholPermissionTwo(17);
        alcoholPermissionTwo(20);
        alcoholPermissionTwo(5);
    }

    public static void alcoholPermissionTwo(int age) {
        // если  к нам придёт ребёнок младше 16 , то не продавать
        // если ребёнку уже испольнилось 16, но ещё меньше 18, то провадать слабый алкоголь
        // age >= 16 & age < 18
        // во всех остальных продавать
        if (age < 16) {
            System.out.println("Алкоголь не продавать");
        } else if (age < 18) {
            System.out.println("Продажа слабоалкогольных напитков разрешена");
        } else {
            System.out.println("Продажа алкоголя разрешена");
        }

    }

    public static void helloIf() {
        // Если мне разрешат родители, то на лето я уеду в пионерский лагерь
        boolean permission = false;
        if (permission) {
            System.out.println("Я поеду в летний лагерь");
        } else {
            System.out.println("Я на всё лето останусь дома");
        }
    }
}
