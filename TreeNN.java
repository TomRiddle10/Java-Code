import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Deque;
class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        this.data=d;
        this.left=null;
        this.right=null;
    }
}
class TreeOps{
    Node buildTree(Integer[] arr){
        if(arr.length==0||arr[0]==null) return null;
        Queue<Node> que=new LinkedList<>();
        Node root=new Node(arr[0]);
        que.offer(root);
        int i=1;
        while(!que.isEmpty()&&i<arr.length){
            Node current=que.poll();
            if(i<arr.length&&arr[i]!=null){
                current.left=new Node(arr[i]);
                que.offer(current.left);
            }
            i++;
            if(i<arr.length&&arr[i]!=null){
                current.right=new Node(arr[i]);
                que.offer(current.right);
            }
            i++;
        }
        return root;  
        }
        Node createNode(int val){
            Node newNode=new Node(val);
            return newNode;
        }
        void preOrder(Node root){
            if(root==null) return;
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        void inOrder(Node root){
            if(root==null) return;
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        void postOrder(Node root){
            if(root==null) return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        void levelOrder(Node root){
            if(root==null) return;
            Queue<Node> que=new LinkedList<>();
            que.add(root);
            while(!que.isEmpty()){
                Node ele=que.poll();
                System.out.print(ele.data+" ");
                if(ele.left!=null){
                    que.offer(ele.left);
                }
                if(ele.right!=null){
                    que.offer(ele.right);
                }
            }
        }
        void preOrderiterator(Node root){
            if(root==null) return;
            Deque<Node> stack=new ArrayDeque<>();
            stack.push(root);
            while(!stack.isEmpty()){
                Node current=stack.pop();
                System.out.print(current.data+" ");
                if(current.right!=null){
                    stack.push(current.right);
                }
                if(current.left!=null){
                    stack.push(current.left);
                }
            }
            System.out.println(stack);
        }
        boolean isMirror(Node root1,Node root2){
            if(root1==null && root2==null){
                return true;
            }
            if(root1==null||root2==null) return false;
            if(root1.data!=root2.data) return false;
            return (root1.data==root2.data)&&isMirror(root1.left, root2.left)&&isMirror(root1.right, root2.right);
        }
        int height(Node root){
            if(root==null) return 0;
            return 1+Math.max(height(root.left),height(root.right));
        }
        void delete(Node root,int key){
            if(root==null) return;
            Node keyNode=null;
            Node curr=null;
            Queue<Node> que=new LinkedList<>();
            que.add(root);
            while(!que.isEmpty()){
                curr=que.poll();
                if(curr.data==key) keyNode=curr;
                if(curr.left!=null){
                    que.offer(curr.left);
                }
                if(curr.right!=null) que.offer(curr.right);
                if(keyNode!=null){
                    keyNode.data=curr.data;
                    delLastNode(root,curr);
                }
            }
        }
        void delLastNode(Node root, Node delNode) {
    Queue<Node> que = new LinkedList<>();
    que.offer(root);

    while (!que.isEmpty()) {
        Node curr = que.poll();

        if (curr.left != null) {
            if (curr.left == delNode) {
                curr.left = null;
                return;
            }
            que.offer(curr.left);
        }

        if (curr.right != null) {
            if (curr.right == delNode) {
                curr.right = null;
                return;
            }
            que.offer(curr.right);
        }
    }
}
    }
public class TreeNN {
    public static void main(String[] args){
        TreeOps tree=new TreeOps();
        Node root=tree.buildTree(new Integer[]{5,4,7,6,9});
        System.out.println();
        tree.preOrder(root);
        System.out.println();
        tree.inOrder(root);
        System.out.println();
        tree.postOrder(root);
        System.out.println();
        tree.levelOrder(root);
        System.out.println();
        tree.preOrderiterator(root);
        Node root1=tree.buildTree(new Integer[]{5,4,7,6,9,10});
        System.out.println(tree.isMirror(root, root1));
        tree.delete(root1, 10);
        tree.levelOrder(root1);
    }
}
