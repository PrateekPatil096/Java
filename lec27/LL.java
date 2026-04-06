class LL {

    Node head;
    private int size;

    LL(){
        this.size=0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;   
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        
        currNode.next = newNode;  
    }

    
    public void printlist() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("this list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void deleteLast(){

        if(head==null){
            System.out.println("this list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node SecondLast=head;
        Node LastNode=head.next;
        while(LastNode.next!=null){
            LastNode=LastNode.next;
            SecondLast=SecondLast.next;
        }
        SecondLast.next=null;

    }
    public int getSize(){
        return size;

    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst("a");      
        list.addFirst("is");     

        list.printlist();        

        list.addLast("list");    

        list.printlist();        

        list.addFirst("this");
        list.printlist();

        list.deleteFirst();
        list.printlist();

        list.deleteLast();
        list.printlist();

        System.out.println(list.getSize());
    }
}
