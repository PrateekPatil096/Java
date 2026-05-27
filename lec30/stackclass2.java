/*
 * INTERVIEW QUESTIONS - Stack using ArrayList:
 *
 * Q1: Can we implement stack using ArrayList?
 * A: Yes, ArrayList provides dynamic array functionality
 *
 * Q2: Where is top of stack in ArrayList implementation?
 * A: Last index (size - 1)
 *
 * Q3: Time complexity of push using ArrayList?
 * A: O(1) amortized (occasionally O(n) when resizing)
 *
 * Q4: Advantage of ArrayList over LinkedList for Stack?
 * A: Better cache locality, less memory per element
 *
 * Q5: Disadvantage of ArrayList for Stack?
 * A: Occasional resizing overhead
 *
 * Q6: Why access last index for top?
 * A: Adding/removing from end is O(1); from beginning is O(n)
 */
package Java.lec30;
import java.util.*;

public class stackclass2 {
    static class stack{
        // Q: Why ArrayList? A: Dynamic array, easy add/remove from end
        static ArrayList<Integer>list=new ArrayList<>();

        public static boolean isEmpty(){
            return list.size()==0;
        }

        // Q: Where do we add? A: At end (last index = top)
        public static void push(int data){
            list.add(data);  // Adds at end - O(1) amortized
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            // Q: Why size()-1? A: Last index is top of stack
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);  // Remove last element
            return top;
        }

        // Q: What does peek return? A: Top element without removing
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

     public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
