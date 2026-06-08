import java.util.ArrayDeque;
import java.util.Deque;

public class SumArray {
    public static int longestSubarraySumLeqK(int[] a, int k) {
        int n = a.length;
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] - a[i];
        }
        long K = -1L * k;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i <= n; i++) {
            if (stack.isEmpty() || prefix[i] < prefix[stack.peekLast()]) {
                stack.addLast(i);
            }
        }

        int best = 0;
        for (int j = n; j >= 0; j--) {
            while (!stack.isEmpty() && prefix[j] - prefix[stack.peekLast()] >= K) {
                best = Math.max(best, j - stack.peekLast());
                stack.pollLast();
            }
        }

        return best;
    }

    public static void main(String[] args) {
        int[] a = { 3, -2, 5, -1, 2, -3, 6, -2, 4 };
        int k = 7;

        int length = longestSubarraySumLeqK(a, k);
        System.out.println(length);
    }
}
