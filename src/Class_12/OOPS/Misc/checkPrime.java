package Class_12.OOPS.Misc;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number that you want to check! ");
        int n = sc.nextInt();

        int checker = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                checker++;
        }

        if (checker == 1) {
            System.out.println("It is a prime number. ");
        } else {
            System.out.println("It is not a prime number. ");
        }
        sc.close();

    }
}
