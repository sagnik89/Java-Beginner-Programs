package Class_12.Arrays.Searches;

import java.util.Scanner;

public class linearSearch {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ar[] = new int[5];

        // to take the input for array 
        System.out.println("Input the elements of the array: ");
        for(int i = 0; i < ar.length; i++){
            ar[i] = sc.nextInt();
        }

        //to take input of the item to search on
        System.out.println("Input the item to be searched for: ");
        int val = sc.nextInt(); 

        boolean present = false;

        for(int j = 0; j < ar.length; j++)
        {
            if( val == ar[j])
            {
                present  = true;
            }
        }

        if(present){
            System.out.println("The item is present in the array. ");
         }
         else{
            System.out.println("The item is not present in the array. ");
         }

         sc.close();
    }
}
