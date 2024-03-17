package Class_12.Arrays.Sorts;

public class insertionSort {
    public static void main(String[] args) {
        int a[] = { 1, 5, 4, 8, 2, 3, 7, 6, 10, 9 };

        // insertion sort
        for (int i = 1; i < a.length; i++) {
            int current = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > current) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = current;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
