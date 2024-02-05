import java.util.LinkedList;

public class LinkedList4 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null"); // Print "Null" to indicate the end of the list
    }

    public static void main(String[] args) {
        LinkedList4 list = new LinkedList4();
        list.addLast(1);
        // list.addLast(2);
        // list.addLast(3);
        // list.addLast(4);

        System.out.println("Original List:");
        list.printList();

        System.out.println("Reversed List:");
        list.head = list.reverseRecursive(list.head);
        list.printList();
    }
}
