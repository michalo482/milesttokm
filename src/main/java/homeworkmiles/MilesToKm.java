package homeworkmiles;

import java.util.Scanner;

import static homeworkmiles.Matching.*;

public class MilesToKm {
    public static void main(String[] args) {
        System.out.println("Podaj wartość w milach: ");
        do {
            if (!matched(miles)) {
                System.out.println("Podaj prawidłową wartość: ");
                miles = readValue();
            }
        } while (!matched(miles));
        System.out.printf("%.2f mil to \u2248 %.2f km", mil(), calc(Matching.mil()));
    }

    public static String readValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}


