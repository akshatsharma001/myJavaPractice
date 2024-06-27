import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a");
        int a = sc.nextInt();
        System.out.println("Enter the number b");
        int b = sc.nextInt();
        int temp = Math.max(a, b);
        while (true) {
            if (temp % a == 0 && temp % b == 0) {
                break;
            }
            temp++;
        }
        System.out.println(temp);

    }
}