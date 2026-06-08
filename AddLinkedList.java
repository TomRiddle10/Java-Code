public class AddLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void printList(Node head) {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " ,");
            temp = temp.next;
        }
        System.out.print(temp.data + " ,");
        System.out.println("Null");
    }

    static Node reverse(Node head) {
        if (head == null) {
            return null;
        }
        Node curr = head;
        Node prev = null;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static Node addAtPos(Node head, int value, int pos) {
        Node temp = head;
        for (int i = 1; i <= pos - 2; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    static Node addLList(Node head1, Node head2) {
        if (head1 == head2)
            return null;
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;
        Node temp1 = reverse(head1);
        Node temp2 = reverse(head2);
        int carry = 0;
        Node res = new Node(-1);
        while (temp1 != null && temp2 != null) {
            int sum = temp1.data + temp2.data + carry;
            Node newNode = new Node(sum % 10);
            carry = sum / 10;
            newNode.next = res.next;
            res.next = newNode;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while (temp1 != null) {
            Node newNode = new Node(temp1.data);
            newNode.next = res.next;
            res.next = newNode;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            Node newNode = new Node(temp2.data);
            newNode.next = res.next;
            res.next = newNode;
            temp2 = temp2.next;
        }
        if (carry != 0) {
            Node newNode = new Node(carry);
            newNode.next = res.next;
            res.next = newNode;
        }
        return res.next;
    }

    public static void main(String[] args) {
        Node head1 = new Node(7);
        head1.next = new Node(3);
        head1.next.next = new Node(4);
        printList(head1);
        System.out.println();
        Node head2 = new Node(9);
        head2.next = new Node(8);
        head2.next.next = new Node(6);
        printList(head2);

        Node head3 = addLList(head1, head2);
        printList(head3);
    }
}
