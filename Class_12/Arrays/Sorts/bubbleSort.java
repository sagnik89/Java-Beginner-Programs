package Class_12.Arrays.Sorts;

import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ar[] = new int[5];

        // to take the input for array 
        System.out.println("Input the elements of the array: ");
        for(int i = 0; i < ar.length; i++){
            ar[i] = sc.nextInt();
        }

        //ascending bubble sort
        for(int j = 0; j < ar.length; j++)
        {
            for(int k = 0; k < ar.length - j - 1; k++)
            {
                if(ar[k] > ar[k + 1])
                {
                    int temp = ar[k];
                    ar[k] = ar[k+1];
                    ar[k+1] = temp;
                }
            }
        }

        // to give the output for array 
        System.out.println("The sorted array is: ");
        for(int i = 0; i < ar.length; i++){
            System.out.println(ar[i]);
        }
        

        sc.close();
    }
}