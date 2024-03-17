package Class_12.specimenQues;

import java.util.Scanner;

public class saddleMatrix {

    // to display the array
    static void display(int ar[][]) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {

                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();

        int a[][] = new int[n][n];

        // taking array input
        System.out.println("Matrix A: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // to display the matrix
        System.out.println("Original Matrix: ");
        display(a);

        int smallestInRow = 0;
        int greatestInColumn = 0;
        int t = 0;

        smallestInRow = 1000000;
        greatestInColumn = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (a[i][j] < smallestInRow) {
                    smallestInRow = a[i][j];
                }
                if (i < n - 1) {
                    if (a[j][i] > greatestInColumn) {
                        greatestInColumn = a[j][i];
                    }
                }
            }
            if (smallestInRow == greatestInColumn) {
                System.out.println("Saddle Point: " + smallestInRow);
                t = 1;
                break;

            }
        }

        if (t != 1) {
            System.out.println("No Saddle Point.");
        }

        // insertion sort after finding the saddle point.

        sc.close();
    }

}
// test input
// 4 6 12 2 8 14 1 3 6
