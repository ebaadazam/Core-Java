import java.util.Stack;

class Stack_DeleteMiddleElement {

    // Method to delete the middle element
    public static void solve(Stack<Integer> stack, int size, int count) {

        if (size == 0) {
            System.out.println("Stack is empty");
            return;
        }

        // If we reach the middle, pop the element and return to backtracking
        if (count == size / 2) {
            stack.pop();
            return;
        }

        // Preserve the top element
        int var = stack.pop();
        count++;

        // Recursive call
        solve(stack, size, count);

        // Push the preserved element back
        stack.push(var);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println("Original Stack: " + stack);

        solve(stack, stack.size(), 0);

        System.out.println("Stack after deleting middle element: " + stack);
    }
}
