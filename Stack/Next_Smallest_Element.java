import java.util.Stack;

public class Stack_NextSmallestElement {

    public static void findNextSmallestElement(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] result = new int[arr.length];
        
        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];
            
            // Pop elements that are greater than the current element
            while (!stack.isEmpty() && stack.peek() >= current) {
                stack.pop();
            }
            // If stack is empty, no smaller element to the right
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            // Push the current element to stack
            stack.push(current);
        }

        // Print the result
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 4, 3};
        findNextSmallestElement(arr);
    }
}

