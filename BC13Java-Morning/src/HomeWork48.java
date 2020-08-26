import java.util.Arrays;
//Ханойская задача - сделала очень простую рекурсию... что поделать, как могу!
public class HomeWork48 {
    public static void main(String[] args) {
       hanoi();
    }

   public static void hanoi() {
     int[] a = {1,2,3};
     int[] b = new int[3];
     int[] c = new int[3];
     c = a;
     b = c;
       System.out.println(Arrays.toString(c));
    }
}

