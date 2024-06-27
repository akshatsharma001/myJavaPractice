import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side a: ");
        float a = sc.nextFloat();
        float perimeter = 3*a;
        System.out.println("the perimeter of eq. triangle: "+perimeter);
    }
}
