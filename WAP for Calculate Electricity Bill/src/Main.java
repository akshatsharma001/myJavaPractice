import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the unit of Electricity which is used unit: ");
        float unit = sc.nextFloat();
        if (unit <= 0) {
            System.out.println("enter the valid number");
        } else if (unit > 0 && unit <= 400) {
            float electricityBill = (float) (4.50 * unit);
            System.out.println(electricityBill);
        } else if (unit > 400 && unit <= 500) {
            float electricityBill = (float) ((4.50 * 400) + ((unit - 400) * 6.50));
            System.out.println(electricityBill);
        } else if (unit > 500 && unit <= 600) {
            float electricityBill = (float) ((4.50 * 400) + (6.50 * 100) + ((unit - 500) * 8.00));
            System.out.println(electricityBill);
        } else {
            float electricityBill = (float) ((4.50 * 400) + (6.50 * 100) + (8.00 * 100) + ((unit - 600) * 9.00));
            System.out.println(electricityBill);
        }

    }
}
