import de.telran.BMI;
import de.telran.LeapYear;
import de.telran.Password;

public class HWLibrariesDina {
    public static void main(String[] args) {
        System.out.println(BMI.fundBmi(157.0, 55.0));
        System.out.println(LeapYear.leapYear(1999));
        System.out.println(Password.genPass(15));
    }
}
