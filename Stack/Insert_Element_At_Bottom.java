import java.util.Stack;

public class Stack_InsertElementAtBottom {

    public static void insertAtBottom(Stack<Integer> stack, int element){

        // Base Case
        if(stack.isEmpty()){
            stack.push(element);
            return;
        }

        // Preserve the top element until stack is empty
        int var = stack.peek();
        stack.pop();

        // Recursive Call
        insertAtBottom(stack, element);

        //Push the element back to the stack
        stack.push(var);
    }
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Stack Before: " + stack);

        insertAtBottom(stack, 9);

        System.out.println("Stack After: " + stack);
        
    }
}

