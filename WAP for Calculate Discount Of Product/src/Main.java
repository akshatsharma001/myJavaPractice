import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of the product prod: ");
        double productPrice = sc.nextDouble();
        System.out.println("Enter the discount percentage discountPercentage: ");
        double discountPercentage = sc.nextDouble();
        double discountedPriceOfProduct = productPrice - ((productPrice * discountPercentage) / 100);
        System.out.println("the discounted price of the product is: " + discountedPriceOfProduct);
    }
}
