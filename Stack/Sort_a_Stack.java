import java.util.Stack;;

public class Stack_Sort_a_Stack {

    public static void sort(Stack<Integer> stack){
        if (stack.isEmpty()) {
            return;
        }
        int num = stack.peek();
        stack.pop();

        sort(stack);

        sortedInsert(stack, num);
    }

    public static void sortedInsert(Stack<Integer> stack, int num) {

        // Base Case
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
