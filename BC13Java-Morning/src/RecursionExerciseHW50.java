public class RecursionExerciseHW50 {
    public static void main(String[] args) {
        System.out.println(triangle(0));// 0
        System.out.println(triangle(1));// → 1
        System.out.println(triangle(2));// → 3
        System.out.println("---------------");
        System.out.println(count8(8)); //→ 1
        System.out.println(count8(818)); //→ 2
        System.out.println(count8(8818)); //→ 4
    }

    private static int count8(int number) {
        if (number == 0) {
            return 0;
        } else if (number > 0) return number;
        return count8(number%10);
    }


    private static int triangle(int row) {
        if (row == 0) {
            return 0;
        }
        return row + triangle(row - 1);
    }
}
