import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;    
    class Node {
            int data;
            Node left;
            Node right;
            Node(int d) {
                this.data = d;
                this.left = null;
                this.right = null;
            }
        }
    class TreeOps {
        Node buildTree(Integer[] arr) {
    if (arr.length == 0 || arr[0] == null)
        return null;

    Queue<Node> que = new LinkedList<>();
    Node root = new Node(arr[0]);
    que.offer(root);

    int i = 1; // start after root

    while (!que.isEmpty() && i < arr.length) {
        Node current = que.poll();

        // Left child
        if (i < arr.length && arr[i] != null) {
            current.left = new Node(arr[i]);
            que.offer(current.left);
        }
        i++;

        // Right child
        if (i < arr.length && arr[i] != null) {
            current.right = new Node(arr[i]);
            que.offer(current.right);
        }
        i++;
    }

    return root;
}
        Node createNode(int val){
            Node newNode = new Node(val);
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
                if(ele.left!=null)
                    que.offer(ele.left);
                if(ele.right!=null)
                    que.offer(ele.right);
            }
        }
        void preorderIterator(Node root){
         Deque<Node> stack = new ArrayDeque<>();
         stack.push(root);

         while (!stack.isEmpty()) {
             Node current = stack.pop();
             System.out.print(current.data + " ");
             if (current.right != null) {
                 stack.push(current.right);
             }
             if (current.left != null) {
                 stack.push(current.left);
             }
         }
          System.out.println(stack);

        }
        boolean ismirror(Node root1, Node root2) {
            if (root1 == null && root2 == null) {
                return true;
            }
            if (root1 == null || root2 == null) {
                return false;
            }
            if (root1.data!=root2.data) {
                return false;
                
            }

            
            return (root1.data == root2.data) &&
                    ismirror(root1.left, root2.right) &&
                    ismirror(root1.right, root2.left);
        }

        int height(Node root){
            if(root==null) return 0;
            return 1+Math.max(height(root.left),height(root.right));
        }
        int diameter=0;
        int getDiameter(Node root){
            if(root==null) return 0;
            return 1+height(root.left)+height(root.right);
        }
        boolean isEqual(Node root1,Node root2){
            if(root1==null&&root2==null) return true;
            if(root1==null|| root2==null) return false;
            if(root1.data!=root2.data) return false;
            return root1.data==root2.data && isEqual(root1.left, root2.left) && isEqual(root1.right,root2.right);
        }
        void delete(Node root,int key){
            if(root==null) return;
            Queue<Node> que=new LinkedList<>();
            Node keyNode=null;
            Node curr=null;
            que.add(root);
            while(!que.isEmpty()){
                curr=que.poll();
                if(curr.data==key){
                    keyNode=curr;
                }
                if(curr.left!=null) que.offer(curr.left);
                if(curr.right!=null) que.offer(curr.right);
            }
            if(keyNode!=null){
                keyNode.data=curr.data;
                delLastNode(root, curr);
        }
    }
    void delLastNode(Node root,Node delNode){
        Queue<Node> que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            Node curr=que.poll();
            if(curr.left==delNode){
                curr.left=null;
                return;
            }else{
                que.offer(curr.left);
            }
            if(curr.right==delNode){
                curr.right=null;
                return;
            }else{
                que.offer(curr.right);
            }
            if(curr.left!=null) que.offer(curr.left);
            if(curr.right!=null) que.offer(curr.right);
        }
    }
}
        

public class TreeJ {

    public static void main(String[] args) {

        TreeOps tree = new TreeOps();
        Node root = tree.createNode(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.left.left=new Node(3);
        root.left.right=new Node(7);
        System.out.println("Pre order");
        tree.preOrder(root);
        System.out.println();
        System.out.println("\nIn order");
        tree.inOrder(root);
        System.out.println();
        System.out.println("\nPost order");
        tree.postOrder(root);
        System.out.println();
        System.out.println("\nLevel order");
        tree.levelOrder(root);
        // Node root = tree.buildTree(new Integer[]{10,20,30,40,50,60,70});
        // System.out.println("\nLevel order of built tree:");
        // tree.levelOrder(root);
        // System.out.println();
        // System.out.println("\nPre order of built tree:");
        // tree.preOrder(root);
        Node root4=tree.buildTree(new Integer[]{10,20,20,30,40,40,30});
        System.out.println("\nMirror check:");
        System.out.println(tree.ismirror(root, root4));
        System.out.println("\nHeight of the tree:");
        System.out.println(tree.height(root));
        System.out.println("\nDiameter of the tree:");
        System.out.println(tree.getDiameter(root));
        Node r1 = tree.buildTree(new Integer[]{10,20,30,40,50,60,70,null});
        Node r2 = tree.buildTree(new Integer[]{10,20,30,40,50,60,70});
        System.out.println("\nEquality check:");
        System.out.println(tree.isEqual(r1, r2));
        System.out.println("\nDelete node 15:");
        tree.delete(root, 15);
        tree.levelOrder(root);
    }
}


