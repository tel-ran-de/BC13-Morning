package lesson10;

public class HW07 {
    public static void main(String[] args) {
        split();
        System.out.println(speedLimits(46));
        System.out.println(speedLimits(56));
        System.out.println(speedLimits(80));
        System.out.println(speedLimits(120));
        split();
        System.out.println(waysOfVikingOne(1));
        System.out.println(waysOfVikingOne(2));
        System.out.println(waysOfVikingOne(3));
        System.out.println(waysOfVikingOne(4));
        split();
        System.out.println(waysOfVikingTwo("Налево"));
        System.out.println(waysOfVikingTwo("Направо"));
        System.out.println(waysOfVikingTwo("Наверх"));
        System.out.println(waysOfVikingTwo("Вниз"));


    }

    public static String speedLimits(int speed) {
        String result = "";
        if (speed <= 50) {
            result = "Нарушений нет";
        } else if (speed <= 65) {
            result = "Устное порицание";
        } else if (speed <= 100) {
            result = "40 Евро штраф";
        } else if (speed <= 130) {
            result = "Штраф 500 Евро";
        } else {
            result = "Штраф 1000 Евро";
        }
        return result;

    }

    public static void split() {
        System.out.println("-------------------------");
    }

    public static String waysOfVikingOne(int way) {
        String result = "";
        if (way == 1) {
            result = "Коня потеряешь";
        } else if (way == 2) {
            result = "Жизнь потеряешь";
        } else if (way == 3) {
            result = "Счастье обретёшь";
        }
        return result;
    }

    public static String waysOfVikingTwo(String way) {
        String result = "";
        switch (way) {
            case "Налево":
                result = "Коня потеряешь";
                break;
            case "Направо":
                result = "Жизнь потеряешь";
                break;
            case "Прямо":
                result = "Счастье обретёшь";
                break;
            default:
                result = "Повторите свой выбор";
                break;
        }


        return result;
    }


}
