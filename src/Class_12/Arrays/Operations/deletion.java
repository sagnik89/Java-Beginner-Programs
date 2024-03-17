package Class_12.Arrays.Operations;

public class deletion {
    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // position of the element which is to be deleted.
        int pos = 6;
        int n = ar.length;

        for (int i = pos - 1; i < n - 1; i++) {
            ar[i] = ar[i + 1];
        }
        n = n - 1;

        for (int j = 0; j < n; j++) {
            System.out.print(ar[j] + " ");
        }
    }

}
