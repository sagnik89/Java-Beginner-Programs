package Class_12.Recursion;

public class factorialRecursive {

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    public static void main(String[] args) {

        int res = factorial(6);

        System.out.println("Result is: " + res);
    }

}
