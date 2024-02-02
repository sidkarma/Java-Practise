import java.util.*;

public void reverseIterate() {


    Node prevNode = head;
    Node currNode = head.next;
    while(currNode != null) {
        Node nextNode = currNode.next;
        currNode.next = prevNode;

        //update
        prevNode = currNode;
        currNode = nextNode;
    }
}

class LinkedList3 {
    public static void main(String[] args) {
        LinkedList3 list = new LinkedList3();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();
    }
}
