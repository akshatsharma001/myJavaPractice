import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of runs");
        int totalRuns = sc.nextInt();
        System.out.println("The number of innings a player has batted");
        int playerBatted = sc.nextInt();
        System.out.println("The number of times a player has remain not out");
        int playerNotOut = sc.nextInt();
        double battingAverage = (double) totalRuns / (playerBatted - playerNotOut);
        System.out.println("The batting average is: " + battingAverage);
    }
}
