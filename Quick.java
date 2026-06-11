import java.util.*;

public class Quick {
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partiton(arr, low, high);
            quickSort(arr, low, p);
            quickSort(arr, p + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                int temp = arr[i + 1];
                a[i + 1] = a[j];
                a[j] = temp;
                j++;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int n = 0;
        int i;
        int[] arr = new int[100];
        int pivot = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        n = sc.nextInt();
        System.out.print("Enter element of array:");
        for (i = 0; i < n; i++) {
            arr = sc.nextInt();
        }
        System.out.print("\nUnsorted Array:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nEnter pivot element:");
        pivot = sc.nextInt();
        quickSort(arr, 0, n - 1);
        System.out.print("\nSorted Array:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
