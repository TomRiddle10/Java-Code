import java.util.Stack;

public class NextGE {
    static int[] nextGreater(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty()) {
                if (st.peek() > arr[i]) {
                    res[i] = st.peek();
                    break;
                }

                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            }
            st.push(arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 10 };
        int[] res = nextGreater(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
