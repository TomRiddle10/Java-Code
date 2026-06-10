import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node buildTree(Integer[] arr) {
        if (arr.length == 0)
            return null;
        Node root = new Node(arr[0]);
        Queue<Node> que = new LinkedList<Node>();
        que.add(root);
        int i = 1;
        while (i < arr.length && !que.isEmpty()) {
            Node curr = que.poll();
            if (i < arr.length && arr[i] != null) {
                curr.left = new Node(arr[i]);
                que.offer(curr.left);
            }
            if (i < arr.length && arr[i + 1] != null) {
                curr.right = new Node(arr[i + 1]);
                que.offer(curr.right);
            }
            i += 2;
        }
        return root;
    }

    static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static Node insert(Node root, int val) {
        if (root == null)
            return new Node(val);
        if (root.data < val) {
            root.right = insert(root.right, val);
        } else if (root.data > val) {

            root.left = insert(root.left, val);
        }
        return root;
    }

    static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static boolean search(Node root, int val) {
        if (root == null)
            return false;
        if (root.data == val)
            return true;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()) {
            Node curr = que.poll();
            if (curr.data == val)
                return true;
            if (curr.left != null)
                que.offer(curr.left);
            if (curr.right != null)
                que.offer(curr.right);
        }
        return false;
    }

    static Node height(Node root) {
        if (root == null) {
            return null;
        }
        Node leftHeight = height(root.left);
        Node rightHeight = height(root.right);
        return new Node(1 + Math.max(leftHeight.data, rightHeight.data));
    }

    static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null)
            return true;
        if ((min != null && root.data <= min.data) || (max != null && root.data >= max.data))
            return false;
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    static void topView(Node root) {
        if (root == null)
            return;
        Deque<Integer> st = new ArrayDeque<>();
        Node temp = root.left;
        while (temp != null) {
            st.push(temp.data);
            temp = temp.left;
        }
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }

    static void leftView(Node root) {
        if (root == null)
            return;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()) {
            int size = que.size();
            for (int i = 0; i < size; i++) {
                Node curr = que.poll();
                if (i == 0)
                    System.out.print(curr.data + " ");
                if (curr.left != null)
                    que.offer(curr.left);
                if (curr.right != null)
                    que.offer(curr.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root = buildTree(new Integer[] { 30, 20, 40, 15, 25, 35, 45 });
        inOrder(root);
        System.out.println();
        insert(root, 10);
        inOrder(root);
        System.out.println();
        System.out.println(search(root, 25));
        System.out.println(height(root));
        System.out.println(isValidBST(root, null, null));
        topView(root);
        System.out.println();
        leftView(root);
    }
}
