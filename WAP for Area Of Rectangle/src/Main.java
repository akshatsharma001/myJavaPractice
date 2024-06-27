import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length l");
        float l = sc.nextFloat();
        System.out.println("Enter the breadth b");
        float b = sc.nextFloat();
        float area = l * b;
        System.out.println("area of rectangle is: " + area);
    }
}
