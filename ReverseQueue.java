public class ReverseQueue {
    static class QueueOps {
        static Node front = null;
        static Node rear = null;

        static class Node {
            int data;
            Node next;

            Node(int d) {
                this.data = d;
                this.next = null;
            }
        }

        static void enqueue(int val) {
            Node newNode = new Node(val);
            if (rear == null) {
                rear = newNode;
                front = rear;
            }
            rear.next = newNode;
            rear = newNode;
        }

        static void dequeue() {
            if (front == null) {
                System.out.println("Queue is empty");
                return;
            }
            front = front.next;
        }

        static void reverse(Node head) {
            if (rear == null)
                return;

            Node curr = front;
            Node prev = null;

            Node next = null;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            

        }

        void display() {
            Node temp = front;
            if (front == null) {
                System.out.println("Queue is empty");
                return;
            }

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueOps q = new QueueOps();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        System.out.println("Original Queue:");
        q.display();

        System.out.println("Reversed Queue:");
        q.reverse(q.front);
        q.display();
    }
}
