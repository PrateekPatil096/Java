import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class q44 {
    public static void main(String[] args) {
        Node first=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);
        
        first.next=second;
        second.next=third;
        third.next=fourth;

        Node prev=null;
        Node curr=first;
        Node next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node temp=prev;
        while(temp!=null){
            System.out.print(temp.data+"-");
            temp=temp.next;
        }
    }
    
}
