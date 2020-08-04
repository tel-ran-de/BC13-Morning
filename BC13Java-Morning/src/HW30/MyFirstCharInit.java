package HW30;

public class MyFirstCharInit {
    public static void main(String[] args) {
        char[] myArray = new char[]{'a', 'b', '.', '@', 'g', '7'};

        myPrintForCharArray(myArray);
        myPrintForCharArray(fillArrayRandomChar(myArray));
    }

    private static char[] fillArrayRandomChar(char[] ccc) {
        for (int i = 0; i < ccc.length; i++) {
            ccc[i] = (char) (Math.random() * 200);
        }
        return ccc;
    }


    public static void myPrintForCharArray(char[] ccc) {
        System.out.println("Символьный массив(char[]), длиной " + ccc.length);
        for (char c : ccc) {
            System.out.print(c + ", ");
        }
    }
}

