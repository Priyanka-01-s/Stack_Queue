public class Main {
    public static void main(String[] args) {
        // Creating a stack with elements 56, 30, and 70
        Stack stack = new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);

        // Displaying the stack
        System.out.println("Stack after push operations:");
        stack.display();
    }
}
