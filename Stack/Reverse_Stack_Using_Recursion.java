import java.util.Stack;
public class Stack_Reverse_Stack_Using_Recursion {

    // Method to insert an element at the bottom of the stack
    public static void insertAtBottom(Stack<Integer> stack, int element){

        // Base case: if stack is empty, push the item
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }
        // Preserve the top elements until it is empty
        int top = stack.pop();

        // Recursive call to insert item at the bottom
        insertAtBottom(stack, element);

        // Push the popped element back to the stack
        stack.push(top);
    }

    public static void reverse(Stack<Integer> stack){
        if (!stack.isEmpty()) {
            int top = stack.pop();
            reverse(stack);
            insertAtBottom(stack, top);
        }
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Stack Before Reverse: " + stack);

        reverse(stack);

        System.out.println("Stack After Reverse: " + stack);
    }
}

