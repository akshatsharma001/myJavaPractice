import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Input n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the input in the array");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}