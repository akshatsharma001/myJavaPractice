import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a");
        double a = sc.nextDouble();
        System.out.println("Enter the number b");
        double b = sc.nextDouble();
        System.out.println("Enter the Operator op");
        String op = sc.next();
        if (op.equals("+")) {
            double value = a + b;
            System.out.println("a + b = " + value);
        } else if (op.equals("-")) {
            double value = a - b;
            System.out.println("a - b = " + value);
        } else if (op.equals("*")) {
            double value = a * b;
            System.out.println("a * b = " + value);
        } else if (op.equals("/")) {
            double value = a / b;
            System.out.println("a / b = " + value);
        }
    }
}
