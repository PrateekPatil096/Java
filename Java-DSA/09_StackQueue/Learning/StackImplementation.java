import java.util.*;

public class StackImplementation {
    
    static int[] stack;
    static int top = -1;
    static int capacity;
    
    public static void main(String[] args) {
        capacity = 5;
        stack = new int[capacity];
        
        push(10);
        push(20);
        push(30);
        
        System.out.println("Top element: " + peek());
        System.out.println("Popped: " + pop());
        System.out.println("Top element after pop: " + peek());
        System.out.println("Is empty: " + isEmpty());
    }
    
    public static void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        stack[++top] = x;
    }
    
    public static int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stack[top--];
    }
    
    public static int peek() {
        if (isEmpty()) {
            return -1;
        }
        return stack[top];
    }
    
    public static boolean isEmpty() {
        return top == -1;
    }
}
