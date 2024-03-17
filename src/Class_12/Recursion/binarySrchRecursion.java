package Class_12.Recursion;

public class binarySrchRecursion {

    static int binary(int ar[], int val, int start, int end) {
        int mid = 0;

        if (end >= start) {
            mid = (start + end) / 2;

            if (ar[mid] == val) {
                return val;
            }
            if (ar[mid] > val) {
                return binary(ar, val, start, mid - 1);
            } else {
                return binary(ar, val, mid + 1, end);
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4, 5, 6, 7 };
        int val = 87;

        int res = binary(ar, val, 0, ar.length - 1);

        if (res == -1) {
            System.out.println("Not present. ");
        } else {
            System.out.println("Present. ");
        }

    }

}
