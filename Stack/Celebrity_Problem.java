// There are two concepts: 1. Celebrity knows noone  2. Everyone knows Celebrity
// It is basically a NxN matrix where 1 means persons knows and 0 means the person does not
// Celebrity row should contain all 0s
// Celebrity cols should contain all 1s except the Celeb itself

import java.util.Stack;

class Stack_CelebrityProblem {

    // Utility method to check if a knows b
    private boolean knows(int[][] matrix, int a, int b) {
        return matrix[a][b] == 1;
    }

    public int celebrityProblem(int[][] matrix, int n) {
        Stack<Integer> stack = new Stack<>();

        // Push all elements into the stack
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        // Keep popping out two elements from the stack until its size is 1
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();

            // If a knows b, then a is not a celebrity. So there might be chance of having b as celebrity
            if (knows(matrix, a, b)) {
                stack.push(b);
            }
            // If b knows a, then there might be chance of having a as celebrity so we push a into stack
            else {
                stack.push(a);
            }
        }

        // At the end, the element left in the stack is the potential candidate
        int potentialCandidate = stack.pop();

        // Now verify the single element

        // Row check
        boolean rowCheck = true;
        for (int i = 0; i < n; i++) {
            if (matrix[potentialCandidate][i] == 1) {
                rowCheck = false;
                break;
            }
        }

        // Col check
        boolean colCheck = true;
        for (int i = 0; i < n; i++) {
            if (i != potentialCandidate && matrix[i][potentialCandidate] == 0) {
                colCheck = false;
                break;
            }
        }

        if (rowCheck && colCheck) {
            return potentialCandidate;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 0},
            {0, 0, 0},
            {0, 1, 0}
        };
        int n = matrix.length;

        Practice_Stack obj = new Practice_Stack();
        int result = obj.celebrityProblem(matrix, n);

        if (result == -1) {
            System.out.println("No celebrity found");
        } else {
            System.out.println("Celebrity is person " + result);
        }
    }
}

