import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer n: ");
        int n;
        int sum = 0;
        while (true) {
            n = sc.nextInt();
            if (n == 0) {
                break;
            }
            sum += n;

        }
        System.out.println(sum);
    }
}
