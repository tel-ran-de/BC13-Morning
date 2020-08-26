import java.util.Arrays;

public class HanoiTower {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.print("initial array a ");
        System.out.println(Arrays.toString(a));
        int[] b = new int[3];
        System.out.print("initial array b ");
        System.out.println(Arrays.toString(b));
        int[] c = new int[3];
        System.out.print("initial array c ");
        System.out.println(Arrays.toString(c));
        System.out.print("received array b ");
        System.out.println(Arrays.toString(createHanoiTower(a, b, c, 3)));
        System.out.print("final array a ");
        System.out.println(Arrays.toString(a));
        System.out.print("final array c ");
        System.out.println(Arrays.toString(c));
        System.out.println("----------------------");
        towerOfHanoi('A', 'B', 'C', 4);
    }

    private static int[] createHanoiTower(int[] a, int[] b, int[] c, int disks) {
        b[0] = a[2]; a[2] = 0;
        c[0] = a[1]; a[1] = 0;
        c[1] = b[0]; b[0] = 0;
        b[0] = a[0]; a[0] = 0;
        a[0] = c[1]; c[1] = 0;
        b[1] = c[0]; c[0] = 0;
        b[2] = a[0]; a[0] = 0;
        return b;
    }

    public static void towerOfHanoi(char from_rod, char to_rod, char empty_rod, int n) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
            return;
        }
        towerOfHanoi(from_rod, empty_rod, to_rod, n - 1);
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        towerOfHanoi(empty_rod, to_rod, from_rod, n - 1);
    }
}
