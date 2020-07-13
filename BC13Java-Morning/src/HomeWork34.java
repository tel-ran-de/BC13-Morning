
public class HomeWork34 {
    public static void main(String[] args) {
        System.out.println(relationSquareToSquare(2500, 800));
        System.out.println(relationSquareToSquare(100, 300));
        System.out.println(relationSquareToSquare(35000, 40000));
    }

    public static double relationMoscowToBerlin() {
        double moscow = 2500;
        double berlin = 800;
        return moscow / berlin;
    }

    public static double relationSquareToSquare(double s1, double s2) {
        if (s1 >= s2) {
            return s1 / s2;
        } else {
            return s2 / s1;
        }
    }
}
