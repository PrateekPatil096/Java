/*
 * INTERVIEW QUESTIONS - Queue using Linked List:
 *
 * Q1: Advantage of LinkedList Queue over Array Queue?
 * A: No fixed size, O(1) enqueue and dequeue without shifting
 *
 * Q2: Why use both head and tail pointers?
 * A: head for dequeue O(1), tail for enqueue O(1)
 *
 * Q3: Time complexity of all operations?
 * A: add, remove, peek - all O(1)
 *
 * Q4: When is the queue empty?
 * A: When both head and tail are null
 *
 * Q5: What happens when removing last element?
 * A: Need to set tail to null as well (queue becomes empty)
 *
 * Q6: Is this better than array implementation?
 * A: Yes for dynamic size, but uses more memory per element
 */
public class circularq{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    static class queue{
        static Node head=null;  // Q: What is head? A: Front of queue (dequeue from here)
        static Node tail=null;  // Q: What is tail? A: Rear of queue (enqueue here)

        // Q: When is queue empty? A: When head AND tail are both null
        public static boolean isEmpty(){
            return head==null & tail==null;
        }

        // Q: Where do we add new element? A: At tail (rear)
        public static void add(int data){
            Node newNode=new Node(data);
            if(tail==null){  // Empty queue
                tail=head=newNode;  // New node is both head and tail
                return;
            }
            tail.next=newNode;  // Link new node after current tail
            tail=newNode;       // Update tail to new node

        }

        // Q: Time complexity of remove? A: O(1) - just update head
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
           int front=head.data;
           // Q: What if only one element? A: Need to reset tail to null
           if(head==tail){
            tail=null;
           }
           head=head.next;  // Move head to next node

           return front;
        }

        // Q: What does peek return? A: Front element without removing
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return-1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        queue q= new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // Q: Output? A: 1, 2, 3, 4, 5 (FIFO order)
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}
