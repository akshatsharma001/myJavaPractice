import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of the Circle");
        double radius = sc.nextInt();
        circumference(radius);
        area(radius);
    }

    private static void area(double radius) {
        double area = radius * radius;
        System.out.println("The area of circle is: " + area);
    }

    private static void circumference(double radius) {
        double circumference = 2 * 3.14 * radius;
        System.out.println("The circumference of circle is: " + circumference);

    }
}