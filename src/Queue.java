public class Queue {
    LinkedList linkedList;

    public Queue() {
        linkedList = new LinkedList();
    }

    public void enqueue(int data) {
        linkedList.append(data);
    }

    
    public int dequeue() {
        return linkedList.removeFront();
    }

    public void display() {
        Node current = linkedList.head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
