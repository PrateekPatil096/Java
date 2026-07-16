import java.util.*;
public class q46 {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("queue after adding"+q);

        int removed=q.remove();
        System.out.println("removed element"+removed);
        System.out.println("queueafter removing "+q);

        int peeks=q.peek();
        System.out.println("peeked element"+peeks);
    }
    
}
