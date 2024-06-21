package Class_12.Recursion;

public class gcdRecursive {

    static int gcd(int a, int b) {
        if (b == 0) {
            return a; // When b becomes 0, a is the GCD.
        }
        return gcd(b, a % b); // Recursive call with b and the remainder of a divided by b.
    }

    /*
     * 1st time
     * a = 36, b = 60
     * function(60, 36)
     * 
     * 2nd time
     * a = 60, b = 36
     * function(36, 24)
     * 
     * 3 time
     * a = 36, b = 24
     * function(24, 12)
     * 
     * 2nd time
     * a = 24, b = 12
     * function(12, 0)
     */

    public static void main(String[] args) {
        int res = gcd(36, 60);
        System.out.println("res: " + res);
    }
}
