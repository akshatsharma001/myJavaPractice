import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number num: ");
        int num = sc.nextInt();
        isPrime(num);
    }

    private static void isPrime(int num) {
        if (num < 1) {
            System.out.println("The number is not a prime number");
            return;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("The number is not a prime number");
                return;
            }
        }
        System.out.println("The number is a prime number");
    }
}