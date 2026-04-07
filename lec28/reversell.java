class reversell {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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

    public void reverseRecursive() {
        head = reverseRecursive(head);
    }

    private Node reverseRecursive(Node node) {

        if (node == null || node.next == null) {
            return node;
        }

        Node newHead = reverseRecursive(node.next);

        node.next.next = node;
        node.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        reversell list = new reversell();

        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        System.out.println("Original:");
        list.printlist();

        list.reverseRecursive();

        System.out.println("Reversed:");
        list.printlist();
    }
}
