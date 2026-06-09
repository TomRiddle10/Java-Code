static class Node {
            int data;
            Node left;
            Node right;
            Node(int d) {
                this.data = d;
                this.left = null;
                this.right = null;
            }
        }
    class treeOps{
    Node createNode(int val){
            Node newNode = new Node(val);
            return newNode;
        }
        void inOrder(Node root){
            if(root==null) return;
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    Boolean mirror(Node head){
        Node front=new Node(0);
        Node last=new Node(0);
        if(head==null) return false;

        

    }
}
public class Mirror {
    public static void main(String[] args){

    }
}
