package Class_12.Recursion;

public class binaryToDecimalRecursion {
    static void binaryToDecimal(int n) {

        if (n > 1) {
            binaryToDecimal(n / 2);
        }
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        int n = 15;

        binaryToDecimal(n);

    }

}
