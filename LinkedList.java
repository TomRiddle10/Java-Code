import java.util.*;

public class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node addAtHead(Node head, int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (head == null) {
            head = newNode;
        }
        return head;
    }

    static Node addAtTail(Node head, int value) {
        Node newNode = new Node(value);
        if (head == null) {
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    static Node addAtPos(Node head, int value, int pos) {
        if (pos == 1) {
            return addAtHead(head, value);
        }

        Node temp = head;
        for (int i = 1; i <= pos - 2; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    static Node deleteAtHead(Node head) {
        if (head == null) {
            return null;
        }
        head = head.next;
        return head;
    }

    static Node deleteAtTail(Node head) {
        if (head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    static Node deleteAtPos(Node head, int pos) {
        if (pos == 1) {
            return null;
        }
        Node temp = head;
        for (int i = 1; i <= pos - 2; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    static Node deleteAtValue(Node head, int value) {
        if (head == null || (head.data == value || head.next == null)) {
            return null;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }

    static Node updateAtPos(Node head, int value, int pos) {
        if (pos == 1) {
            head.data = value;
        }
        Node temp = head;
        for (int i = 1; i < pos - 2; i++) {
            temp = temp.next;
        }
        temp.next.data = value;
        return head;
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
    }

    static Node findMiddle(Node head) {
        if (head == null) {
            return null;
        }

        Node turtle = head;
        Node rabbit = head;

        while (rabbit != null && rabbit.next != null) {
            turtle = turtle.next;
            rabbit = rabbit.next.next;
        }

        return turtle;
    }

    static Boolean detect_cycle(Node head) {
        if (head == null) {
            return null;
        }

        Node turtle = head;
        Node rabbit = head;

        while (rabbit != null && rabbit.next != null) {
            turtle = turtle.next;
            rabbit = rabbit.next.next;
            if (turtle == rabbit) {
                return true;
            }
        }
        return false;
    }

    static Node cycle_start(Node head) {
        if (head == null) {
            return null;
        }

        Node turtle = head;
        Node rabbit = head;
        int a = 0;

        while (rabbit != null && rabbit.next != null) {
            turtle = turtle.next;
            rabbit = rabbit.next.next;
            if (turtle == rabbit) {
                turtle = head;
                while (turtle != rabbit) {
                    turtle = turtle.next;
                    rabbit = rabbit.next;
                }
                return turtle;
            }

        }
        return head;
    }

    static Node reverse(Node head) {
        if (head == null) {
            return null;
        }
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = null;
        head = addAtHead(null, 12);
        head = addAtTail(head, 13);
        head = addAtTail(head, 14);
        head = addAtTail(head, 15);
        System.out.println();
        printList(head);
        // head = deleteAtHead(head);
        // head = deleteAtTail(head);
        // System.out.println();
        // printList(head);
        System.out.println();

        // Node middle = findMiddle(head);
        // System.out.println("\nMiddle element is: " + middle.data);

        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);
        printList(head1);

    }
}
