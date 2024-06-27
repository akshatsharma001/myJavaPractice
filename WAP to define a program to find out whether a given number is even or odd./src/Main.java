import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();
        evenOrOdd(n);
    }

    static void evenOrOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is odd");
        }
    }
}