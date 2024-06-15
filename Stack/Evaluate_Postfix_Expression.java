// Evaluate Postfix Expression

import java.util.Stack;
class Stack_EvaluatePostfixExpression {
    
    public int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            // charAt() method returns the character at the specified index 'i' of the string exp.
            char token = exp.charAt(i);

            // Check if token is an operand (digit)
            if (Character.isDigit(token)) {
                stack.push(token - '0'); // Convert char to int
            } else {
                // Token is an operator
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = 0;

                switch (token) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }

                stack.push(result);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        String exp = "53+62/*35*+";
        Practice_Stack stack = new Practice_Stack();
        int result = stack.evaluatePostfix(exp);
        System.out.println("The result of the postfix expression is: " + result);
    }
}


