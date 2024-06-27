import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number num: ");
        int num = sc.nextInt();
        isPalindrome(num);
    }

    private static void isPalindrome(int num) {
        int reversed = 0;
        int temp = num;
        while (num != 0) {
            int digit = num % 10;
            reversed = (reversed * 10) + digit;
            num = num / 10;
        }
        if (temp == reversed) {
            System.out.println("The number is a palindrome number");
        } else {
            System.out.println("The number is not a palindrome number");
        }
    }
}