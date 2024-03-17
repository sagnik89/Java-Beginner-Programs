package Class_12.specimenQues;

import java.util.Scanner;

//ques_07_2023

// finding the transpose of a matrix

public class Trans {

    static int m;
    int ar[][];
    int arT[][];

    public Trans(int mm) {

        this.m = mm;

        ar = new int[m][m];
        arT = new int[m][m];

    }

    void fillarray() {
        Scanner sc = new Scanner(System.in);

        // input the elements ROW-WISE
        for (int i = 0; i < m; i++) {
            System.out.println("Row " + (i + 1));
            for (int j = 0; j < m; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
    }

    void transpose() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arT[i][j] = ar[j][i];
            }
        }
    }

    void display() {

        // displaying the original array
        System.out.println("Original array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ar[i][j] + "  ");
            }
            System.out.println();
        }

        // displaying the transposed array
        System.out.println("Transposed Array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arT[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Trans ob = new Trans(3);

        ob.fillarray();
        ob.transpose();
        ob.display();
    }
}
