// To find the largest retangular area in a histogram, we will use the concept of next smallest element and also the prev smallest element

import java.util.Stack;

public class Stack_LargestRectangularAreaInHistogram {

    // for finding the largest area
    public int largestRectangularArea(int[] heights){
        int n = heights.length;
        int[] next = nextSmallestElement(heights, n);
        int[] prev = prevSmallestElement(heights, n);

        int area = 0;
        for (int i = 0; i < n; i++) {
            int l = heights[i];

            if (next[i] == -1) {
                next[i] = n;
            }
            int b = next[i] - prev[i] - 1; // max-width formula

            int newArea = l * b;
            area = Math.max(area, newArea);
        }
        return area;
    }

    // for finding the next smallest element
    private int[] nextSmallestElement(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];
            
            // Pop elements that are greater than the current element
            while (!stack.isEmpty() && arr[stack.peek()] >= current) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return result;
    }

    // for finding the previous smallest element
    private int[] prevSmallestElement(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int current = arr[i];
            
            // Pop elements that are greater than the current element
            while (!stack.isEmpty() && arr[stack.peek()] >= current) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        Stack_LargestRectangularAreaInHistogram obj = new Stack_LargestRectangularAreaInHistogram();
        int largestArea = obj.largestRectangularArea(heights);
        System.out.println("Largest Rectangular Area in Histogram: " + largestArea);
    }
}
