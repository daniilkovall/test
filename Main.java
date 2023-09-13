public class Main {
    public static double convert(int gallons) {
        double liters = gallons * 3.78541;
        return Math.round(liters * 1000.0) / 1000.0;
    }

    public static void main(String[] args) {
        System.out.println(convert(5000));
        System.out.println(convert(36));

    }
}