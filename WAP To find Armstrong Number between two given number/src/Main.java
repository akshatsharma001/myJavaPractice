package com.Akshat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the number num2");
        int num2 = sc.nextInt();
        System.out.println("Armstrong numbers in the range are:");
        for (int num = num1; num <= num2; num++) {

            int sum = 0;
            int numDigits = 0;
            int temp = num;

            // Count the number of digits in 'num'
            while (temp != 0) {
                temp /= 10;
                numDigits++;
            }
            temp = num; // Reset 'num' to its original value

            // Calculate the sum of each digit raised to the power of the number of digits
            while (temp != 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, numDigits);
                temp /= 10;
            }
            // Check if the sum is equal to the original number
            if (sum == num) {
                System.out.println(num);
            }

        }
    }
}
