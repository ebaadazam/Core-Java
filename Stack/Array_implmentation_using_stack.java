// array implementation using stack
class Stack {
    int[] stack; // for stack itself
    int len; // for length of the stack
    int top; // for values inserting and removing from the stack
    public Stack(int len) {
        this.len=len;
        this.stack = new int[len];
        this.top = -1;
    }

    public void push(int data) {
        // If there is any space in the stack
        if (top < len) {
            top++;
            stack[top] = data;
        }
        else
            System.out.println("Stack is full");
    }

    public void pop() {
        // If the stack has elements
        if (top > -1) 
            top--;
        else 
            System.out.println("Stack is empty");
    }

    public void peek() {
        if (top > -1) 
            System.out.println("The peek element of the stack is " + stack[top]);    
        else
            System.out.println("Stack is empty");
    }

    public void isEmpty() {
        if (top == -1) 
            System.out.println("Stack is empty");
        else
            System.out.println("Stack is not empty");
    }


    public void isFull() {
        if (top == len-1) 
            System.out.println("Stack is Full");
        else 
            System.out.println("Stack is not full");
    }

    public void size() {
        if (top > -1) 
            System.out.println("The size of the stack is " + (top+1));
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " "); 
        }
        System.out.println();
    }
}

public class Practice_Stack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        // Pushing the elements
        stack.push(20);
        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(40);

        // Displaying the elements
        stack.display();

        // Popping the elements
        stack.pop();
        stack.pop();

        // Displaying the elements
        stack.display();

        // Getting the topmost element
        stack.peek();

        // Checking if the stack is empty
        stack.isEmpty();

        // Checking if the stack is full
        stack.isFull();

        // Getting the size of the stack
        stack.size();
    }
}
