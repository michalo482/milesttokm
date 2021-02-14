package homeworkmiles;

public class Matching {
    static String miles = MilesToKm.readValue();

    public static boolean matched(String miles) {
        return miles.matches("^\\d+(\\.\\d+)?$");
    }

    public static double mil() {
        return Double.parseDouble(miles);
    }

    public static double calc(double mil) {
        return mil * 1.609344;
    }

}
