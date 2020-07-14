public class Geometry {

    public static void main(String[] args) {
        // first("*", 10);
        //second("*", 10);
        third("*", 10);
    }

    public static void first(String divider, int countLines) {
        String line = "";
        for (int i = 0; i < countLines; i++) {
            line = line + divider;
            System.out.println(line);
        }
    }

    public static void second(String divider, int countLines) {
        String line = "";
        for (int i = 0; i < countLines; i++) {
            line = line + divider;
        }
        for (int i = 0; i < countLines; i++) {
            line = line.substring(0, line.length() - 1);
            //line = line.substring(line.length() - 1);
            System.out.println(line);
        }
    }

    public static void third(String divider, int countLines) {
        String lineSpace = "";
        String lineStar = "";

        for (int i = 0; i < countLines; i++) {
            lineSpace = lineSpace + " ";
        }

        for (int i = 0; i < countLines; i++) {
            lineSpace = lineSpace.substring(0, lineSpace.length() - 1);
            //line = line.substring(line.length() - 1);
            lineStar = lineStar + divider;
            System.out.println(lineSpace + lineStar);
        }
    }
}
