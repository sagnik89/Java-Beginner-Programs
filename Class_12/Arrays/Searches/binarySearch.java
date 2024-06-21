package Class_12.Arrays.Searches;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ar[] = new int[5];

        // to take the input for array
        System.out.println("Input the elements of the array: ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }

        // to take input of the item to search on
        System.out.println("Input the item to be searched for: ");
        int val = sc.nextInt();

        boolean present = false;
        int first = 0, mid, last = ar.length - 1;

        while (first <= last) {

            mid = (first + last) / 2;

            if (ar[mid] == val) {
                present = true;
                break;
            }

            else if (val > ar[mid]) {
                first = mid + 1;
            }

            else if (val < ar[mid]) {
                last = mid - 1;
            }

        }

        if (present) {
            System.out.println("The item is present in the array. ");
        } else {
            System.out.println("The item is not present in the array. ");
        }

        sc.close();
    }
}
