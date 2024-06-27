import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal P: ");
        double P = sc.nextDouble();
        System.out.println("Enter the Time T: ");
        double T = sc.nextDouble();
        System.out.println("Enter the Rate R: ");
        double R = sc.nextDouble();
        double SI = (P*T*R)/100;
        System.out.println("The Simple Interest is: "+SI);
    }
}
