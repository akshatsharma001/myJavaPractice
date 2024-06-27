import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of marks");
        int totalMarks = sc.nextInt();
        System.out.println("Enter the number marks obtained");
        int marksObtained = sc.nextInt();
        float marksPercentage = (float) marksObtained / totalMarks * 100;
        float cgpa = marksPercentage / 9.5f;
        System.out.println("The cgpa is: " + cgpa);
    }
}
