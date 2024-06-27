import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sum(n1, n2);
    }

    static void sum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of the two numbers is: " + sum);
    }
}