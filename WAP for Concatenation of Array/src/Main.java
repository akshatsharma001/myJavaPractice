import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers are present in the array");
        int a = sc.nextInt();
        int[] ans = new int[2 * a];
        int[] nums = new int[a];
        for (int i = 0; i < a; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
            ans[i] = nums[i];
            ans[i + a] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}