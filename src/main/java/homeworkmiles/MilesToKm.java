package homeworkmiles;

import java.util.Scanner;

import static homeworkmiles.Matching.mil;
import static homeworkmiles.Matching.calc;
import static homeworkmiles.Matching.matched;
import static homeworkmiles.Matching.miles;

public class MilesToKm {
    public static void main(String[] args) {
        do {
            System.out.println("Podaj wartość w milach: ");

            if (!matched(miles)) {
                System.err.println("Podaj prawidłową wartość.");
            }

        } while (!matched(miles));


        System.out.printf("%.2f mil to \u2248 %.2f km", mil(), calc(Matching.mil()));
    }
    public static String readValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}


