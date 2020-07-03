package homework34;

public class HW04 {
    public static void main(String[] args) {
        System.out.println(myLovelyString());
    }

    public static String myLovelyString() {
        String input1 = "Вход разрешён";
        String input2 = "воспрещён";
        String input3 = "Осторожно, ";
        int clientMagicNumber = 8;
        int myInputlength = input1.length();
        String myNewInput1 = input1.substring(0, 1).toLowerCase() + input1.substring(1, myInputlength - clientMagicNumber);

        return input3 + myNewInput1 + input2;
    }
}
