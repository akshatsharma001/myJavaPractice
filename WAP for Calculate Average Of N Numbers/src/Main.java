import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers n: ");
        int n = sc.nextInt();
        int sum = 0;
        float avg;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        avg = (float) sum / n;
        System.out.println(avg);
    }
}
