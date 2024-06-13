import java.util.Stack;
public class Stack_Reverse_Stack_Using_Recursion {

    // Method to insert an element at the bottom of the stack
    public static void insertAtBottom(Stack<Integer> stack, int element){
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }
        int num = stack.peek();
        stack.pop();
        insertAtBottom(stack, element);
        stack.push(num);
    }

    public static void reverse(Stack<Integer> stack){

        // Base Case
        if (stack.isEmpty()) {
            return;
        }

        // Preserve the top element in a variable until the stack is empty
        int num = stack.peek();
        stack.pop();

        // Recursive call to reverse the stack
        reverse(stack);

        // After reversing, insert the preserved elements at the bottom
        insertAtBottom(stack, num);
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
