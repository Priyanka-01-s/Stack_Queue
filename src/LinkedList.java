public class LinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    public int removeFront() {
        if (head == null) {
            throw new IllegalStateException("Queue is empty");
        }

        int data = head.data;
        head = head.next;
        return data;
    }
}
