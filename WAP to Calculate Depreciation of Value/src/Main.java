import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost");
        float cost = sc.nextFloat();
        System.out.println("enter the salvageValue");
        float salvageValue = sc.nextFloat();
        System.out.println("enter the usefulLife");
        float usefulLife = sc.nextFloat();
        float depreciationValue = (cost-salvageValue)/usefulLife;
        System.out.println(depreciationValue);
    }
}
