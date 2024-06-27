import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}