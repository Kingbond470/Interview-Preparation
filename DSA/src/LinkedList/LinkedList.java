package LinkedList;

public class LinkedList {

    public Node head;
    public Node tail;
    private int size;

    // to find size of linked list : length
    public  LinkedList() {
        this.size = 0;
    }

    // to add the node at first
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;     //  link the current node to head address
        head = node;          // to make head as this node

        if (tail == null) {
            tail = node;
        }

        size += 1;
    }

    // to display the element from linked list
    public void displayLinkedList() {
        Node temp = head;           // to not change the original head, we are creating temp head
        while (temp != null) {
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }

        System.out.println("Null");
    }

    private class Node {

        private int val;
        private Node next;

        // want to access : data only
        public Node(int val) {
            this.val = val;
        }

        // want to access : data and next
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }
}
