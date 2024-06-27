import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            nums[i + n] += nums[i] * 10000;
        }
        for (int i = 0; i < n; i++) {
            nums[2 * i] = nums[n + i] / 10000;
            nums[2 * i + 1] = nums[n + i] % 10000;
        }
        System.out.println(Arrays.toString(nums));
    }
}