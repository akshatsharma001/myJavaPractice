import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negativeSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;
        while (true) {
            System.out.println("Enter the number n");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n < 0) {
                negativeSum += n;
            } else {
                if (n % 2 == 0) {
                    positiveEvenSum += n;
                } else {
                    positiveOddSum += n;
                }
            }
        }
        System.out.println("Sum of negative numbers: " + negativeSum);
        System.out.println("Sum of positive even numbers: " + positiveEvenSum);
        System.out.println("Sum of positive odd numbers: " + positiveOddSum);
    }
}