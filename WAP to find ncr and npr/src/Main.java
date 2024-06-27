import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r: ");
        int r = sc.nextInt();
        int ncr, npr;
        ncr = (fact(n)) / (fact(r) * (fact(n - r)));
        npr = fact(n) / fact(n - r);
        System.out.println(ncr);
        System.out.println(npr);
    }

    public static int fact(int n) {
        for (int i = n - 1; i > 0; i--) {
            n *= i;
        }
        return n;
    }
}
