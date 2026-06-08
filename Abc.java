import java.util.*;

public class Abc {

    public void binar(int[] a, int k, int n) {

        int l = 0;
        int h = n - 1;

        while (l <= h) {

            int m = (l + h) / 2;

            if (a[m] == k) {
                System.out.println("Element " + k + " found at index " + (m + 1));
                return;
            }

            if (a[m] < k) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }

        System.out.println("Element not found");
    }

    public static void main(String[] args) {

        Abc aa = new Abc();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        System.out.println("Enter sorted array elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        aa.binar(arr, key, size);

        sc.close();
    }
}