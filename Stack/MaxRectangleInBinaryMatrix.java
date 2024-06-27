import java.util.Stack;
class Stack_MaxRectangleInBinaryMatrix{

    // actual method
    public int maxArea(int matrix[][], int n, int m){
        int area = largestRectangularArea(matrix[0], m);

        // for remaining rows
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // update row by adding the previous row's value
                if (matrix[i][j] != 0) {
                    matrix[i][j] += matrix[i - 1][j];
                }
                else{
                    matrix[i][j] = 0;
                }
            }
                // entire row is updated now
                int newArea = largestRectangularArea(matrix[i], m);
                area = Math.max(area, newArea);
                
        }
        return area;
    }

    // for finding the largest rectangular area
    public int largestRectangularArea(int[] heights, int n){
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

    // for finding the next smallest element for largestRectangularArea
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

    // for finding the previous smallest element for largestRectangularArea
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

    public static void main(String[] args) {
        Stack_MaxRectangleInBinaryMatrix obj = new Stack_MaxRectangleInBinaryMatrix();
        int[][] matrix = {
            {0, 1, 1, 0},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 0, 0}
            };

            int n = 4;
            int m = 4;

            System.out.println(obj.maxArea(matrix, n, m)); 
        }   
    }

