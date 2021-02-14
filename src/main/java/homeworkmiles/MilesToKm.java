package homeworkmiles;

import java.util.Scanner;

import static homeworkmiles.Matching.*;

public class MilesToKm {
    public static void main(String[] args) {

        if (args.length > 0) {
            for (String s : args) {
                boolean match = s.matches("^\\d+(\\.\\d+)?$");
                if (match == true) {
                    double mi = Double.parseDouble(s);
                    double km = mi * 1.609344;
                    System.out.printf("%.2f \n", km);
                } else if (!match) {
                    System.out.println(s + " <- zly parametr uruchomieniowy, program przyjmuje tylko liczby rzeczywiste wieksze od zera.");
                }
            }
        } else {

            System.out.println("Podaj wartość w milach: ");
            do {
                if (!matched(miles)) {
                    System.out.println("Podaj prawidłową wartość: ");
                    miles = readValue();
                }
            } while (!matched(miles));
            System.out.printf("%.2f mil to \u2248 %.2f km", mil(), calc(Matching.mil()));
        }
    }

    public static String readValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}

