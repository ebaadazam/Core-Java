// Without using the Stack inbuilt data structure (Manually)
public class Stack_MinStack {
    int[] stack;
    int[] min_stack;
    int len;
    int top;

    public Stack_MinStack(int len){
        this.len = len;
        stack = new int[len];
        min_stack = new int[len];
        this.top = -1;
    }

    public void push(int data){
        if (top < len) {
            top++;
            stack[top] = data;

            if (top == 0) {
                min_stack[top] = data;
            } else {
                min_stack[top] = Math.min(data, min_stack[top - 1]);
            }
        }
        else{
            System.out.println("Stack is full");
        }  
    }

    public void pop() {
        if (top > -1) 
            top--;
        else 
            System.out.println("Stack is empty");
    }

    public int peek(){
        if (top > -1) {
            return stack[top+1];
        } else {
            return -1;
        }
    }

    public int getMin(){
        if (top == -1) {
            return -1;
        }
        return min_stack[top-1];
    }

    public static void main(String[] args) {
        Stack_MinStack stack = new Stack_MinStack(5);
        stack.push(4);
        stack.push(7);
        stack.push(3);
        stack.push(2);
        stack.push(6);
        System.out.println("Minimum: " + stack.getMin());
    }
}




// Using the Stack inbuilt data structure
import java.util.Stack;

public class Stack_MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    // Constructor to initialize the stacks
    public Stack_MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push an element onto the stack
    public void push(int x) {
        stack.push(x);
        // Push onto the min stack only if it's the new minimum
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    // Pop an element from the stack
    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        int popped = stack.pop();
        // Pop from the min stack if the popped element is the current minimum
        if (!minStack.isEmpty() && popped == minStack.peek()) {
            minStack.pop();
        }
    }

    // Retrieve the top element of the stack
    public int top() {
        if (stack.isEmpty()) {
            return -1; // or throw exception
        }
        return stack.peek();
    }

    // Retrieve the minimum element from the stack
    public int getMin() {
        if (minStack.isEmpty()) {
            return -1; // or throw exception
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
        Stack_MinStack minStack = new Stack_MinStack();
        minStack.push(3);
        minStack.push(5);
        minStack.push(2);
        minStack.push(1);
        minStack.pop();
        System.out.println("Current Min: " + minStack.getMin()); // 2
    }
}

