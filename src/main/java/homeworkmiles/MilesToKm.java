package homeworkmiles;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String... args) {
        String miles;

        do {
            System.out.println("Podaj wartość w milach: ");
            miles = readValue();

            if (!matched(miles)) {
                System.err.println("Podaj prawidłową wartość.");
            }

        } while (!matched(miles));


        double mil = Double.parseDouble(miles);
        System.out.printf("%.2f mil to \u2248 %.2f km", mil, calc(mil));
    }

    public static boolean matched(String miles) {
        return miles.matches("^\\d+(\\.\\d+)?$");
    }
    public static double calc(double mil) {
        double km = mil * 1.609344;
        return km;
    }
    public static String readValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}


