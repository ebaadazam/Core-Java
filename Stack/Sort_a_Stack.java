import java.util.Stack;;

public class Stack_Sort_a_Stack {

    // Method to sort a stack
    public static void sort(Stack<Integer> stack){
        if (stack.isEmpty()) {
            return;
        }
        // Store the top element and pop it from the stack
        int num = stack.peek();
        stack.pop();

        // Recursive call
        sort(stack);

        // After sorting, insert the elements in sorted order
        sortedInsert(stack, num);
    }

    public static void sortedInsert(Stack<Integer> stack, int num) {

        // Base Case- if num is less than the top element then store it before that element
        if ( stack.isEmpty()  || ( (!stack.isEmpty()) && stack.peek() < num ) ) {
            stack.push(num);
            return;
        }

        int n = stack.peek();
        stack.pop();

        sortedInsert(stack, num);

        stack.push(n);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(2);
        stack.push(-1);
        stack.push(6);
        stack.push(-2);

        System.out.println("Stack Before Reverse: " + stack);

        sort(stack);

        System.out.println("Stack After Reverse: " + stack);
    }
}
