import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n");
        int n = sc.nextInt();
        int remainder, sum = 0;
        int temp = n;
        while(n>0){
            remainder = n % 10;
            sum = (sum*10)+remainder;
            n=n/10;
        }
        if (temp==sum){
            System.out.println("The number is a palindrome");
        }else {
            System.out.println("The number is not a palindrome");
        }
    }
}