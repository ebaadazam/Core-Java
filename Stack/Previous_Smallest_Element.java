import java.util.Stack;

public class Previous_Smallest_Element {

    public static void findPrevSmallestElement(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++) {
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
        int arr[] = {1, 4, 6, 7};
        findPrevSmallestElement(arr);
    }
}

