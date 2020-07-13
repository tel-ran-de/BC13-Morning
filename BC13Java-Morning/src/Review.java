/*
 *
 **
 ***
 ****
 *****
 ******
 *******
 ********
 *********
 **********
 */
public class Review {
    public static void main(String[] args) {
        int n = 15;
        triangle(n);
    }

    public static void triangle(int countLine) {
        String star = "/";
        String line = "";

/*        line = star + star + star;
        line = line + line;
        System.out.println(line);*/

        for (int i = 0; i < countLine; i++) {
            line = line + star;
            System.out.println(line);
        }
    }
}
