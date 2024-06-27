import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in rupees: ");
        double inr = sc.nextDouble();
        double usd = inr / 83.25;
        System.out.println("The amount in dollars: " + usd);
    }
}
