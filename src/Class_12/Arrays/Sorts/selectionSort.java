package Class_12.Arrays.Sorts;

import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int ar[] = new int[5];

        // to take the input for array 
        System.out.println("Input the elements of the array: ");
        for(int i = 0; i < ar.length; i++){
            ar[i] = sc.nextInt();
        }

        
        //ascending selection sort
        for(int j = 0; j < ar.length - 1; j++)
        {
            int min =j;
            for(int k = j + 1; k < ar.length; k ++)
            {
                if(ar[min] > ar[k]){
                    min = k;
                }
            }

            //swapping values
            int temp = ar[j];
            ar[j] = ar[min];
            ar[min] = temp;
        }

        // to give the output for array 
        System.out.println("The sorted array is: ");
        for(int i = 0; i < ar.length; i++){
            System.out.println(ar[i]);
        }

        sc.close();
    }
}