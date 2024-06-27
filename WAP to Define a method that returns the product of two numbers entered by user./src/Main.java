import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(multiply(n1, n2));
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}