import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        isPythagoreanTriplet(a, b, c);
    }

    private static void isPythagoreanTriplet(int a, int b, int c) {
        if ((a * a) + (b * b) == (c * c) || (b * b) + (c * c) == (a * a) || (a * a) + (c * c) == (b * b)) {
            System.out.println("The given triplet is a pythagorean triplet");
        } else {
            System.out.println("The given triplet is not a pythagorean triplet");
        }
    }

}