public class BMI {
    public static void main(String[] args) {
        double height = 176.0;
        double weight = 100.0;
        System.out.println(findBmi(height, weight));
    }

    public static double findBmi(double height, double weight) {
        height = height / 100;
        return weight / (height * height);
    }
}

