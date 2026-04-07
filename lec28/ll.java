public class ll {

    Node head;

     static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    public void reverse() {
        Node prev = null;      
        Node curr = head;      
        Node next;             

        while (curr != null) {
            next = curr.next;   
            curr.next = prev;   
            prev = curr;        
            curr = next;        
        }

        head = prev;   
    }

    
    public void printlist() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ll list = new ll();

        list.head = new ll.Node(1);           
        list.head.next = new ll.Node(2);
        list.head.next.next = new ll.Node(3);

        System.out.println("Original:");
        list.printlist();   

        list.reverse();     
        System.out.println("Reversed:");
        list.printlist();   
    }
}

