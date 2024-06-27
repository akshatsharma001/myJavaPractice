import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age = sc.nextInt();
        eligibleForVote(age);
    }

    static void eligibleForVote(int age) {
        if (age >= 18) {
            System.out.println("The person is eligible");
        } else {
            System.out.println("The person is not eligible");
        }
    }
}