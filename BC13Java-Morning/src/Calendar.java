public class Calendar {
    public static void main(String[] args) {
        createMonth();
    }

    private static void createMonth() {
        int[][] monthCalendar;
        monthCalendar = new int[4][7];
        // 1,2,3,4,5,6,7
        // 1,2,3,4,5,6,7
        // 1,2,3,4,5,6,7
        // 1,2,3,4,5,6,28
        for (int i = 0; i < monthCalendar.length; i++) {
            for (int j = 0; j < monthCalendar[i].length; j++) {
                monthCalendar[i][j] = i * 7 + j + 1;
                System.out.print(monthCalendar[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Computer, распечатай мне элемент по индексу [3][6] - "
                + monthCalendar[3][6]);
    }
}
