import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number num");
        int num = sc.nextInt();
        System.out.println(sumOfFirstNaturalNumbers(num));

    }

    static int sumOfFirstNaturalNumbers(int num) {
        return (num * (num + 1)) / 2;
    }
}