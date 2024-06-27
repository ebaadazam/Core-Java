// Queue Implementation Using Array
class Queue_QueueImplementationUsingArray{
    int[] arr;
    int len;
    int front, rear; 
    int count; // to keep track of the size

    public Queue_QueueImplementationUsingArray(int len){
        this.len = len;
        this.arr = new int[len];
        this.front=0;
        this.rear=0;
        this.count=0;
    }

    public void enqueue(int data){
        if(rear == len){
            System.out.println("Queue is full");
            return;
        }
        arr[rear] = data;
        rear++;
        count++;
    }

    public void dequeue(){
        if(front == rear){
            System.out.println("Queue is empty");
            return;
        }
        arr[front]=0;
        front++;
        count--;
    }

    public int peek(){
        if(front == rear){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return (front == rear);
    }

    public boolean isFull(){
        return rear == count;
    }

    public void display(){
        System.out.print("Queue: [ ");
        for (int i = front; i < rear; i++) {
            System.out.print(arr[i] + " ");
        } System.out.println("]");
    }

    public static void main(String[] args) {
        Queue_QueueImplementationUsingArray obj = new Queue_QueueImplementationUsingArray(5);
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);
        obj.display();
        System.out.println("The Peek Elemene in the Queue is: " + obj.peek());
        System.out.println("The Size of the Queue is: " + obj.size());
        System.out.println("Empty?-" + obj.isEmpty());
        System.out.println("Full?-" + obj.isFull());

        obj.dequeue();
        obj.display();
        System.out.println("The Peek Elemene in the Queue is: " + obj.peek());
        System.out.println("The Size of the Queue is: " + obj.size());

        obj.dequeue();
        obj.display();
        System.out.println("The Peek Element in the Queue is: " + obj.peek());
        System.out.println("The Size of the Queue is: " + obj.size());
        System.out.println("Empty?-" + obj.isEmpty());
        System.out.println("Full?-" + obj.isFull());


        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        System.out.println("Empty?-" + obj.isEmpty());


    }
}
