import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input n: ");
        int largestNumber = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n > largestNumber) {
                largestNumber = n;
            }
        }
        System.out.println(largestNumber);
    }
}
