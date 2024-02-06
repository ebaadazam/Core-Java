import java.util.Stack;

public class Stackprogram {
    public static void main(String args[]) {

        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(24);
        stack.push(36);
        stack.push(48);
        stack.push(60);

        stack.pop();

        System.out.println(stack);

        System.out.println("The Top Element of the Stack is: " + stack.peek());
    }
}
