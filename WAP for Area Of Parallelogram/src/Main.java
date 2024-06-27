import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base b");
        float b = sc.nextFloat();
        System.out.println("enter the height h");
        float h = sc.nextFloat();
        float area = b * h;
        System.out.println("the are of parallelogram: " + area);
    }
}
