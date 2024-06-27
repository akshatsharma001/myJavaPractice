import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose power we need to find num: ");
        int num = sc.nextInt();
        System.out.println("enter the Power power: ");
        int power = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * num;
        }
        System.out.println(result);
    }
}
