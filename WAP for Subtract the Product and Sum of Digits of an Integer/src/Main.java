import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number n");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int product = 1;
        while (n != 0) {
            int rem = n % 10;
            sum = rem + sum;
            n = n / 10;
        }
        while (temp != 0) {
            int rem = temp % 10;
            product = rem * product;
            temp = temp / 10;
        }
        int result = product - sum;
        System.out.println("Result: " + result);

    }
}
