/*
 * Redundant brackets are those brackets which are considered useless or unnecessary bracKets in an expression.
 * Now how do we get to know if the there are redundant brackets? Well, we can do this by checking if the brackets are enclosing an operator or not.
 * If there is an operator between two brackets then they are not redundant else they are
 */
import java.util.Stack;
public class Stack_Redundant_Brackets {

    public static boolean isRedundant(String str){

        Stack<Character> stack = new Stack<>();
        for (char exp : str.toCharArray()) {
            if (exp=='(' || exp=='+'|| exp=='-' || exp=='*' || exp=='/') {
                stack.push(exp);
            }
            else{
                if (exp==')') {
                    boolean isValid = true;
                    while (stack.peek() != '(') {
                        int top = stack.peek();
                        if (top=='+'|| top=='-' || top=='*' || top=='/') {
                            isValid=false;
                        }
                        stack.pop();
                    }
                    if (isValid == true) {
                        return true;
                    }
                    stack.pop();
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "(a+(a+b))";
        String str2 = "((a+b))";
        System.out.println("Is Redundant? " + isRedundant(str));
        System.out.println("Is Redundant? " + isRedundant(str2));
    }
}
