import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] originalMatrix = new int[m][n];
        int[][] spiralMatrix = new int[m][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                originalMatrix[i][j] = sc.nextInt();
            }
        }

        // Print the original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(originalMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        int rowBegin = 0;
        int rowEnd = m - 1;
        int colBegin = 0;
        int colEnd = n - 1;
        int counter = 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse from left to right
            for (int i = colBegin; i <= colEnd; i++) {
                spiralMatrix[rowBegin][i] = counter++;
            }
            rowBegin++;

            // Traverse from top to bottom
            for (int i = rowBegin; i <= rowEnd; i++) {
                spiralMatrix[i][colEnd] = counter++;
            }
            colEnd--;

            // Traverse from right to left
            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    spiralMatrix[rowEnd][i] = counter++;
                }
                rowEnd--;
            }

            // Traverse from bottom to top
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    spiralMatrix[i][colBegin] = counter++;
                }
                colBegin++;
            }
        }


        // Print the generated spiral matrix
        System.out.println("Spiral Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(spiralMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
