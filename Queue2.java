class Queueing{
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    Node front=null;
    Node rear=null;
    void enqueue(int data){
        Node newNode=new Node(data);
        if(rear==null){
            front=rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }
    void dequeue(){
        if(front==null) return;
        front=front.next;
        if(front==null) rear=null;
    }
    int peek(){
        if(front==null) return -1;
        return front.data;
    }
    void display(){
        if(rear==null){
            System.out.println("Queue is Empty!!");
            return;
        }
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    static Node merge(Node head1, Node head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        Node head3;
        Node tail;

        if (head1.data < head2.data) {
            head3 = new Node(head1.data);
            head1 = head1.next;
        } else {
            head3 = new Node(head2.data);
            head2 = head2.next;
        }

        tail = head3;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                tail.next = new Node(head1.data);
                head1 = head1.next;
            } else {
                tail.next = new Node(head2.data);
                head2 = head2.next;
            }

            tail = tail.next;
        }

        while (head1 != null) {
            tail.next = new Node(head1.data);
            tail = tail.next;
            head1 = head1.next;
        }

        while (head2 != null) {
            tail.next = new Node(head2.data);
            tail = tail.next;
            head2 = head2.next;
        }

        return head3;
    }
    static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class Queue2 {
    public static void main(String[] args){
        Queueing q=new Queueing();
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(8);
        System.out.print("\nQueue 1:");
        q.display();
        Queueing w=new Queueing();
        w.enqueue(3);
        w.enqueue(5);
        w.enqueue(7);
        w.enqueue(9);
        System.out.print("\nQueue 2:");
        w.display();
        Queueing.Node merged =
                Queueing.merge(q.front, w.front);
        System.out.println("\nSorted Queue:");
        Queueing.printList(merged);
    }
}
