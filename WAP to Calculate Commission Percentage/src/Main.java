import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the commission: ");
        float commission = sc.nextFloat();
        System.out.println("Enter the totalSalesRevenue: ");
        float totalSalesRevenue = sc.nextFloat();
        float commissionRate =(commission/totalSalesRevenue)*100;
        System.out.println(commissionRate+" %");
    }
}
