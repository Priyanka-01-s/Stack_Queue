public class Stack {
    LinkedList linkedList;

    public Stack() {
        linkedList = new LinkedList();
    }

    public void push(int data) {
        linkedList.add(data);
    }

    public void display() {
        Node current = linkedList.head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int pop() {
        if (linkedList.head == null) {
            throw new IllegalStateException("Stack is empty");
        }
        int data = linkedList.head.data;
        linkedList.head = linkedList.head.next;
        return data;
    }

    public int peek() {
        if (linkedList.head == null) {
            throw new IllegalStateException("Stack is empty");
        }
        return linkedList.head.data;
    }

    public boolean isEmpty() {
        return linkedList.head == null;
    }
}
