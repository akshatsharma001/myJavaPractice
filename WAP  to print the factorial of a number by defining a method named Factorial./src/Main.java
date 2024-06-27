import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number num: ");
        int num = sc.nextInt();
        factorial(num);
    }
    private static void factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("The factorial of num is: " + result);
    }
}