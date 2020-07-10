public class Hi {
    public static void main(String[] args) {
        System.out.println(startHi("hi there"));//true
        System.out.println(startHi("hi"));//true
        System.out.println(startHi("hello hi"));//false
    }

    public static boolean startHi(String justVariable) {
        String etalon = "hi";
        String start = justVariable.substring(0, 2);
        /*int a = 3;
        int b = 2;
        if(a != b){
            System.out.println("Pobeda");
        }*/
        return etalon.equals(start);
    }
}
