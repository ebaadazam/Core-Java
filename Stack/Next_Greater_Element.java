// Not a Circular one
import java.util.Stack;

public class Stack_Next_Greater_Element {

    public static void findNextGreaterElement(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>(); // create a stack
        int[] result = new int[n]; // the result array contains the next greater element for each element in the original array.

        // Start iterating from the last element
        for (int i = n - 1; i >= 0; i--) {

            // We pop elements from the stack that are less than or equal to the current element because
            // they can't be the next greater element for the current element or any element to its left.
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If the stack is not empty after popping, the top of the stack is the next greater element
            // for the current element.
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            } else {
                result[i] = -1;
            }
            // Push the current element onto the stack.
            stack.push(arr[i]);
        }
        
        // printing the result array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " -> " + result[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6};
        findNextGreaterElement(arr);
    }
}


// Circular Array
import java.util.Stack;

public class Stack_Next_Greater_Element {

    public static void findNextGreaterElement(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n]; // the result array contains the next greater element for each element in the original array.

        // Initialize result array to -1
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        // Start iterating from the last element twice for circular array, using (2n-1) instead of (n-1)
        for (int i = 2 * n - 1; i >= 0; i--) {
            // We pop elements from the stack that are less than or equal to the current element because
            // they can't be the next greater element for the current element or any element to its left.
            while (!stack.isEmpty() && stack.peek() <= arr[i % n]) {
                stack.pop();
            }

            // If the stack is not empty after popping, the top of the stack is the next greater element
            // for the current element.
            if (!stack.isEmpty()) {
                result[i % n] = stack.peek();
            }

            // Push the current element onto the stack.
            stack.push(arr[i % n]);
        }

        // Print the result array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " -> " + result[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6};
        findNextGreaterElement(arr);
    }
}
