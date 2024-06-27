import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        if (a <= 0) {
            System.out.println("The number has to be positive");
            return;
        }
        int temp = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                temp += i;
            }
        }
        if (temp == a) {
            System.out.println("The number is a perfect number");
        } else {
            System.out.println("The number is not a perfect number");
        }
    }
}