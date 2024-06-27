import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabetical character");
        char character = sc.next().charAt(0);
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.println("The Character is a vowel");
        } else {
            System.out.println("The character is a consonant");
        }

    }
}