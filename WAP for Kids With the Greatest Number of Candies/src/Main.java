import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of kids with candies");
        int n = sc.nextInt();
        int[] candies = new int[n];
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }
        System.out.println("Enter the amount of extra candies");
        int extraCandies = sc.nextInt();
        int maxCandies = 0;

        for (int i = 0; i < n; i++) {
            if (candies[i] > maxCandies) {
                maxCandies = candies[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(candies[i] + extraCandies >= maxCandies);
        }

    }
}