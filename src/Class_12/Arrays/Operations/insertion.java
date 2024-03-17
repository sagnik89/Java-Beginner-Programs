package Class_12.Arrays.Operations;

public class insertion {
    public static void main(String[] args) {

        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

        int n = ar.length;

        // value to be inserted in the array
        int insertValue = 100;

        // position in the array where the value is to be inserted
        int pos = 3;

        for (int i = n - 1; i >= pos; i--) {

            ar[i] = ar[i - 1];
        }

        ar[pos - 1] = insertValue;

        for (int j = 0; j < ar.length; j++) {
            System.out.print(ar[j] + " ");
        }

    }
}
