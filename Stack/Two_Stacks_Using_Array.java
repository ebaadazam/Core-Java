// Implementation of two stacks using a single array
class TwoStacks {
    int[] arr;  // an array to hold elements for both stacks
    int size;  // the size of the array
    int top1, top2;  // top1 for stack 1 and top2 for stack 2

    public TwoStacks(int size) {
        this.size = size;
        arr = new int[size];
        top1 = -1; // top1 will start from the beginning
        top2 = size; // top2 will start from the end
    }

    // Push to Stack 1
    public void push1(int data) {
        // If there is an empty space in the array
        if (top2 - top1 > 1) {
            top1++;
            arr[top1] = data;
        } else {
            System.out.println("Stack 1 is full");
        }
    }

    // Push to Stack 2
    public void push2(int data) {
        // If there is an empty space in the array
        if (top2 - top1 > 1) {
            top2--;
            arr[top2] = data;
        } else {
            System.out.println("Stack 2 is full");
        }
    }

    // Pop from Stack 1
    public int pop1() {
        // If the stack 1 has elements
        if (top1 >= 0) {
            int poppedValue = arr[top1];
            top1--;
            return poppedValue;
        } else {
            System.out.println("Stack 1 is empty");
            return -1;
        }
    }

    // Pop from Stack 2
    public int pop2() {
        // If the stack 2 has elements. Stack 2 will have elements only if top2 is less than size as top2 will start from size and keep decreasing when any element is pushed
        if (top2 < size) {
            int poppedValue = arr[top2];
            top2++;
            return poppedValue;
        } else {
            System.out.println("Stack 2 is empty");
            return -1;
        }
    }

    // Check if Stack 1 is empty
    public boolean isEmpty1() {
        return top1 == -1;
    }

    // Check if Stack 2 is empty
    public boolean isEmpty2() {
        return top2 == size;
    }

    // Display Stack 1
    public void displayStack1() {
        if (isEmpty1()) {
            System.out.println("Stack 1 is empty");
        } else {
            System.out.print("Stack 1: ");
            for (int i = 0; i <= top1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    // Display Stack 2
    public void displayStack2() {
        if (isEmpty2()) {
            System.out.println("Stack 2 is empty");
        } else {
            System.out.print("Stack 2: ");
            for (int i = size - 1; i >= top2; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class Stack_TwoStacksUsingOneArray {
    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(5);

        ts.push1(1);
        ts.push1(2);
        ts.push1(3);
        ts.displayStack1(); // Stack 1: 1 2 3

        ts.push2(6);
        ts.push2(7);
        ts.displayStack2(); // Stack 2: 7 6

        ts.pop1();
        ts.displayStack1();

        ts.pop2();
        ts.displayStack2(); // Stack 2: 6
    }
}
