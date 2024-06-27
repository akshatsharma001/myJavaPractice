import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of presentValue: ");
        double presentValue = sc.nextDouble();
        System.out.println("Enter the value of interest: ");
        double interest = sc.nextDouble();
        System.out.println("Enter the time period in years: ");
        double timePeriod = sc.nextDouble();
        double FutureValue = presentValue * Math.pow((1 + interest / 100), timePeriod);
        System.out.println("The value of future investment is: " + FutureValue);
    }
}