import java.util.Stack;

public class BalancedParathesis {
    public static int balanced(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty())
                    return 0;
                char top = st.peek();
                if ((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[')) {
                    st.pop();
                } else
                    return 0;
            }
        }
        return st.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        String s = "{([])}";
        System.out.println(balanced(s));
    }
}
