import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side a");
        float a = sc.nextFloat();
        float area = (float) 0.433 * a * a;
        System.out.println("the area is: " + area);
    }
}
