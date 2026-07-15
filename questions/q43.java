import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class q43 {
    public static void main(String[] args) {
        Node first=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);

        first.next=second;
        second.next=third;

        Node temp=first;

        while(temp!=null){
            System.out.print(temp.data+"-");
            temp=temp.next;
        }
    }

    
}
