public class Main {
    public static void main(String[] args) {
        double feetToCm = 30.48;
        double milesToCm = 160934;

        double feet = 9.2;
        double miles = 1.3;

        double length1 = feet * feetToCm;
        double length2 = miles * milesToCm;

        System.out.printf("%.1fft = %.1fcm\n", feet, length1);
        System.out.printf("%.1fmi = %.1fcm", miles, length2);
    }
}