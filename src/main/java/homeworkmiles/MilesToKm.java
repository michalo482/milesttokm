package homeworkmiles;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
        String miles;
        boolean match;

        do {
            System.out.println("Podaj wartość w milach: ");
            miles = readValue();
            match = miles.matches("^\\d+(\\.\\d+)?$");


            if (match != true) {
                System.err.println("Podaj prawidłową wartość.");
            }

        } while (match != true);


        double mil = Double.parseDouble(miles);
        System.out.printf("%.2f mil to \u2248 %.2f km", mil, calc(mil));
    }
    public static boolean match()
    public static double calc(double mil) {
        double km = mil * 1.609344;
        return km;
    }
    public static String readValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}


