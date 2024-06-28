// Queue Implementation Using Two Stacks
import java.util.Stack;
class Queue_QueueUsingTwoStacks {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public Queue_QueueUsingTwoStacks(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int data){
        // If the Stack1 is empty then push the element into the stack
        if (stack1.isEmpty()) {
            stack1.push(data);
        }

        // If the Stack1 has already got elements then first pop those elements and insert them to the Stack2. Now push the element into the Stack1 and after pushing, pop all the elemnts from Stack2 and push them again into the Stack1
        else{
            while (!stack1.isEmpty()) {
                int popped = stack1.pop();
                stack2.push(popped);
            }
            // Now the stack is empty, you can push the data
            stack1.push(data);
            while (!stack2.isEmpty()) {
                int popped = stack2.pop();
                stack1.push(popped);
            }
        }
    }

    public void dequeue(){
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        stack1.pop();
    }

    public int top(){
        if (stack1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            return stack1.peek();
        }
    }

    public void display(){
        System.out.println("Queue (Bottom to Top): " + stack1);
    }

    public static void main(String[] args) {
        Queue_QueueUsingTwoStacks queue = new Queue_QueueUsingTwoStacks();
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(15);
        queue.enqueue(17);

        queue.display();

       System.out.println("The Top element of the Queue is: " + queue.top());

       queue.dequeue();
       queue.dequeue();
       queue.display();
       System.out.println("The Top element of the Queue is: " + queue.top());
      
    }
}


