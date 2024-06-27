import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        max(a, b, c);
        min(a, b, c);
    }

    static void max(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is the biggest number");
        } else if (b > a && b > c) {
            System.out.println(b + " is the biggest number");
        } else {
            System.out.println(c + " is the biggest number");
        }
    }

    static void min(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println(a + " is the smallest number");
        } else if (b < a && b < c) {
            System.out.println(b + " is the smallest number");
        } else {
            System.out.println(c + " is the smallest number");
        }
    }
}