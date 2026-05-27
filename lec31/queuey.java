/*
 * INTERVIEW QUESTIONS - Queue using Array:
 *
 * Q1: What is a Queue?
 * A: FIFO (First In First Out) data structure
 *
 * Q2: What are the main operations of Queue?
 * A: enqueue (add at rear), dequeue (remove from front), peek (view front)
 *
 * Q3: Problem with this array implementation?
 * A: Remove is O(n) due to shifting; better to use circular queue
 *
 * Q4: What is the rear pointer?
 * A: Index of last element in queue
 *
 * Q5: When is queue full?
 * A: When rear == size - 1
 *
 * Q6: When is queue empty?
 * A: When rear == -1
 *
 * Q7: Real-world applications of Queue?
 * A: Print spooling, CPU scheduling, BFS traversal, message queues
 */
public class queuey {
    static class queue{
        static int arr[];
        static int size;
        static int rear=-1;  // Q: Why -1? A: Indicates empty queue

        queue(int n){
            arr=new int [n];
            this.size=n;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        // Q: What is enqueue? A: Adding element at rear
        public static void add(int data){
            if(rear==size-1){
                System.out.println("full queue");  // Queue overflow
                return;
            }
            rear++;  // Move rear forward
            arr[rear]=data;  // Add element
        }

        // Q: Time complexity of this remove? A: O(n) due to shifting
        // Q: How to improve? A: Use circular queue
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");  // Queue underflow
                return -1;
            }
            int front=arr[0];  // Get front element
            // Q: What is this loop doing? A: Shifting all elements left
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;  // Decrease size
            return front;
        }

        // Q: What is peek? A: View front element without removing
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return-1;
            }
            return arr[0];  // Front is always at index 0
        }
    }

    public static void main(String[] args) {
        queue q= new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        // Q: Output order? A: 1, 2, 3 (FIFO)
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}
