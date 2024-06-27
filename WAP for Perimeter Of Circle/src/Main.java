import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius r: ");
        float r = sc.nextFloat();
        float perimeter = (float) (2*3.14*r);
        System.out.println("the perimeter of the circle is: "+perimeter);
    }
}
