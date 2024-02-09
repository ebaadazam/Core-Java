import java.util.Scanner;

class StackOperation {

    int[] stack;
    int len;
    int top = 0;

    StackOperation(int len) {
        this.len = len;
        this.stack = new int[len];
    }

    public void push(int data) {
        if (!isFull()) {
            stack[top] = data;
            top++;
        } else {
            System.out.println("Stack Overflow!");
            System.exit(1);
        }
    }

    public void pop() {
        if (!isEmpty()) {
            top--;
            int popped = stack[top];
            System.out.println(popped + " is popped");
        } else {
            System.out.println("Stack UnderFlow");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("The Peek Element of the Stack is: " + stack[--top]);
        } else {
            System.out.println("Stack is Empty");
        }
    }

    public void size() {
        System.out.println("The Size of the Stack is: " + ++top);
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == len;
    }

    public void display() {
        System.out.println("The Stack Elements are:");
        for (int i = 0; i < top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

}

public class Stack {
    public static void main(String[] args) {

        System.out.print("Enter the size of the Stack: ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.close();

        StackOperation stackobj = new StackOperation(len);

        stackobj.push(11);
        stackobj.push(12);
        stackobj.push(13);
        stackobj.push(14);
        stackobj.push(15);
        stackobj.push(16);
        stackobj.push(17);
        stackobj.push(18);

        stackobj.display();

        stackobj.pop();
        stackobj.pop();

        stackobj.peek();

        stackobj.size();

        System.out.println(stackobj.isEmpty());

        System.out.println(stackobj.isFull());

        System.out.println(stackobj.top);
        System.out.println(stackobj.len);
        System.out.println(stackobj.stack.length);

    }
}
