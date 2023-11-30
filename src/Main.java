public class Main {
    public static void main(String[] args) {
        // Creating a stack with elements 56, 30, and 70
        Stack stack = new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);

        // Displaying 
        System.out.println("Stack after push operations:");
        stack.display();

		// Peeking and popping 
        while (!stack.isEmpty()) {
            System.out.println("Peek: " + stack.peek());
            System.out.println("Pop: " + stack.pop());
        }

        // Creating a queue with elements 56, 30, and 70
        Queue queue = new Queue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        // Displaying the queue
        System.out.println("Queue after enqueue operations:");
        queue.display();
    }
}
