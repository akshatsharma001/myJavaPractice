import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string str: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                System.out.println("The String is not a palindrome");
                return;
            }
        }
        System.out.println("The string is a palindrome");
    }
}
