import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence = sc.nextLine();
        boolean[] inputArray = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            inputArray[sentence.charAt(i) - 97] = true;
        }
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == false) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}