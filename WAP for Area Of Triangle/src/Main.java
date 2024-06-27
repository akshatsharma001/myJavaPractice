import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base b");
        float b = sc.nextFloat();
        System.out.println("Enter the height h");
        float h = sc.nextFloat();
        float area = (float) 0.5 * b * h;
        System.out.println("area of triangle is: " + area);
    }
}
