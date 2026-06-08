import java.util.*;

public class Merge {

    public static void MergeSort(int[] a, int p, int r) {
        if (p < r) {
            int m = (p + r) / 2;

            MergeSort(a, p, m);
            MergeSort(a, m + 1, r);

            Merge(a, p, m, r);
        }
    }

    public static void Merge(int[] a, int p, int m, int r) {
        int n1 = m - p + 1;
        int n2 = r - m;

        int[] aa = new int[n1];
        int[] bb = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            aa[i] = a[p + i];
        }

        for (int i = 0; i < n2; i++) {
            bb[i] = a[m + 1 + i];
        }

        int i = 0, j = 0, k = p;

        while (i < n1 && j < n2) {
            if (aa[i] <= bb[j]) {
                a[k] = aa[i];
                i++;
            } else {
                a[k] = bb[j];
                j++;
            }
            k++;
        }

    

    // Copy remaining elements of aa[]
    while(i<n1){
        a[k]=aa[i];
        i++;
        k++;
    }

    while(j<n2){
            a[k]=bb[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("\nUnsorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        MergeSort(a, 0, n - 1);

        System.out.println("\n\nSorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}