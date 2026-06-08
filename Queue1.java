class QueueOps {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node front = null;
    Node rear = null;

    void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    int peek() {
        if (front == null) {
            return -1;
        }

        return front.data;
    }

    void display() {
        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
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

public class Queue1 {
    public static void main(String[] args) {

        QueueOps q = new QueueOps();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.print("Queue 1: ");
        q.display();

        QueueOps w = new QueueOps();
        w.enqueue(15);
        w.enqueue(25);
        w.enqueue(35);

        System.out.print("Queue 2: ");
        w.display();

        QueueOps.Node merged =
                QueueOps.merge(q.front, w.front);

        System.out.print("Merged List: ");
        QueueOps.printList(merged);
    }
}