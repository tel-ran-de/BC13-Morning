import lesson11.FindBMI;
import lesson13.LeapYear_PrimeNumbers;
import lesson15.Password;

public class HW53maria {
    
    public static void main(String[] args) {
        System.out.println("Leap year " + LeapYear_PrimeNumbers.findLeapYear(2000));
        System.out.println("Leap year " + LeapYear_PrimeNumbers.findLeapYear(2003));
        System.out.println("---------------------");
        System.out.println("Password " + Password.genPass(6));
        System.out.println("Password " + Password.genPass(8));
        System.out.println("---------------------");
        System.out.print("BMI ");
        System.out.println(FindBMI.findBMI(85.5D, 1.85D));
    }
}


