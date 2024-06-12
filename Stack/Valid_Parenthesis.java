import java.util.Stack;
public class Stack_ValidParenthesis {

    public static boolean isValidParenthesis(String s){

        // Convert the immutable string into the char array for traversal
        char[] char_str = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char c : char_str) {
            // If opening brackets then push into stack
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            }
            else{
                if (stack.isEmpty()) {
                    return false;
                }
                char top_elem = stack.peek();
                // If closing and top element matches then pop
                if((c==']' && top_elem=='[') || (c=='}' && top_elem=='{') || (c==')' && top_elem=='(')) {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }

        // If the stack is empty, all parentheses were matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s = "{}(){[][}]";
        System.out.println(isValidParenthesis(s));
    }
}
