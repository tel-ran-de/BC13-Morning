public class ItsMyLife {
    public static void main(String[] args) {
        int количествоДнейНедели = 5;
        myLife(количествоДнейНедели);
        int количествоДнейНеделиУСерёжи = 6;
        int количествоДнейНеделиУСынаМаминойПодруги = 4;
        // myLife(количествоДнейНеделиУСерёжи);
        //  myLife(количествоДнейНеделиУСынаМаминойПодруги);
    }

    public static void myLife(int amountWeekDays) {

        for (int i = 1; i <= amountWeekDays; i++) {
            System.out.println("-----------------");
            System.out.println("Новый день" + i);
            System.out.println("Встаю в шесть утра");
            System.out.println("Иду на завод к восьми");
            System.out.println("Возвращаюсь домой");
            System.out.println("Смотрю Netflix");
            System.out.println("Курение с соседом");
            System.out.println("Иду спать");
            System.out.println("День закончился");
            System.out.println("-----------------");
        }

    }
}
