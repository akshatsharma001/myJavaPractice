import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle r:");
        float r = sc.nextFloat();
        float area = (float) 3.14 * r * r;
        System.out.println(area);
    }
}
