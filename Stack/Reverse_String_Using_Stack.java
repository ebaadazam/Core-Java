import java.util.Stack;

class Stack_ReverseStringUsingStack{

    public static String reverse(String str){

        // Convert the immutable string into the char array for traversal
        char[] ch = str.toCharArray();
        
        // Create a Stack
        Stack<Character> stack = new Stack<>();

        // Pushing all chars into the stack
        for (int i = 0; i < ch.length; i++) {
            stack.push(ch[i]);
        }

        StringBuffer reversedString = new StringBuffer(); // As StringBuffer is mutable
        
 
        // Moving all stack elements to the new String in LIFO Order
        while (!stack.isEmpty()) {
            reversedString.append(stack.peek());
            stack.pop();
        }

        return reversedString.toString();
    }
    public static void main(String[] args) {
        String str = "Ebaad Azam";
        String reversed_str = reverse(str);

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed_str);
       
    }
}
