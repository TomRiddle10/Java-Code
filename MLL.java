public class MLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node merge(Node head1, Node head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        Node temp1 = head1;
        Node temp2 = head2;

        Node head3;
        Node tail;

        // Create first node of merged list
        if (temp1.data < temp2.data) {
            head3 = new Node(temp1.data);
            temp1 = temp1.next;
        } else {
            head3 = new Node(temp2.data);
            temp2 = temp2.next;
        }

        tail = head3;

        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                tail.next = new Node(temp1.data);
                temp1 = temp1.next;
            } else {
                tail.next = new Node(temp2.data);
                temp2 = temp2.next;
            }
            tail = tail.next;
        }

        while (temp1 != null) {
            tail.next = new Node(temp1.data);
            tail = tail.next;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            tail.next = new Node(temp2.data);
            tail = tail.next;
            temp2 = temp2.next;
        }

        return head3;
    }

    static void printList(Node head) {
        if (head == null) {
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head1 = new Node(15);
        head1.next = new Node(30);
        head1.next.next = new Node(45);
        head1.next.next.next = new Node(60);
        head1.next.next.next.next = new Node(75);

        Node head2 = new Node(1);
        head2.next = new Node(10);
        head2.next.next = new Node(20);
        head2.next.next.next = new Node(50);
        head2.next.next.next.next = new Node(65);
        head2.next.next.next.next.next = new Node(70);

        Node merged = merge(head1, head2);

        System.out.println("Merged List:");
        printList(merged);
    }
}