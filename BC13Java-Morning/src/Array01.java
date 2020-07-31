public class Array01 {
    public static void main(String[] args) {
        int[] var1 = new int[]{1, 2, 6};
        System.out.println(firstLast6(var1)); // true
        int[] var2 = new int[]{6, 1, 2, 3};
        System.out.println(firstLast6(var2)); // true
        int[] var3 = new int[]{13, 6, 1, 2, 3};
        System.out.println(firstLast6(var3)); // false
    }

    private static boolean firstLast6(int[] myArray) {
        return myArray[0] == 6 || myArray[myArray.length - 1] == 6;
/*        if (myArray[0] == 6 || myArray[myArray.length - 1] == 6) {
            return true;
        }*/
    }
}
