import org.w3c.dom.ls.LSOutput;

/**
 * BC13Java-Morning
 * 07 11 : 52
 */
public class Baikonur {
    public static void main(String[] args) {
        double shuttleSpeedOne = 5.2;
        double shuttleSpeedTwo = 15.1;

        shuttleStart(shuttleSpeedOne);
        System.out.println("----------------------");
        shuttleStart(shuttleSpeedTwo);
    }

    public static void shuttleStart(double speed) {
        final double SUPERCONSTANT_G = 10.0;
        ///final double PI = 3.14;
        // модификатор final обозначает константность переменной, которую невозможно изменить.
        // например, ускорение свободного падения на поверхности Земли или
        // PI, которое всегда константо. Кроме этой особенности final на результаты вычисления
        // не влияет

        if(speed < SUPERCONSTANT_G){
            System.out.println("Первоначальное ускорение недостаточно");
            System.out.println("Ракета не может стартовать");
            System.out.println("Подготовить аварийные службы");
        } else {
            System.out.println("Ракета улетает в космос");
            System.out.println("Выпустить пресс-релиз об успешном запуске");
            System.out.println("Подготовить великих программистов к государственным наградам");
        }

    }
}
