import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the index: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements in nums array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the index");
        int[] index = new int[n];
        for (int i = 0; i < n; i++) {
            index[i] = sc.nextInt();
        }
        ArrayList<Integer> targetList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            targetList.add(index[i], nums[i]);
        }
        int[] target = new int[n];
        for (int i = 0; i < n; i++) {
            target[i] = targetList.get(i);
        }
        System.out.println(Arrays.toString(target));
    }
}