public class Main {
    public static void main(String[] args) {
/*        int a = 324_231_534;
        long l = 3_495_734_056_430_967L;
        //System.out.println(a);

        int myLovelyBinaryDigit = 0b100_1110;
        //System.out.println(myLovelyBinaryDigit);
        System.out.println(0b1);
        System.out.println(0b01);
        System.out.println(0b11);
        System.out.println(0b10);
        System.out.println(0b111);
        System.out.println(0b1111);
        System.out.println(0b11111);
        System.out.println(0b0);*/
        int myLovelyBinaryDigit = 0b0100_1110;
        int frontend = 100_1110;
        System.out.println(convertToDecimal(1010101));
    }

    public static int convertToDecimal(int binaryDigit) {
        int decimalDigit = 0;
        int n = 0;
        int temp = 0;
        int moduloSystem = 10;
        while (binaryDigit > 0) {
            temp = binaryDigit % moduloSystem;
            decimalDigit += temp * Math.pow(2, n);
            binaryDigit = binaryDigit / moduloSystem;
            n++;
        }
        return decimalDigit;
    }
}
