
class find_n_ll {

    Node head;

    class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    void addLast(int d) {
        Node n = new Node(d);
        if (head == null) { head = n; return; }
        Node cur = head;
        while (cur.next != null) cur = cur.next;
        cur.next = n;
    }

    void printList() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " --> ");
            cur = cur.next;
        }
        System.out.println("null");
    }

    // delete nth node from end (1-based)
    void deleteNthFromEnd(int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node fast = dummy, slow = dummy;

        // move fast n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            if (fast == null) return;   // n > length
            fast = fast.next;
        }

        // move both till fast hits null
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // slow is just before the node to delete
        slow.next = slow.next.next;
        head = dummy.next;  // update head
    }

    public static void main(String[] args) {
        find_n_ll list = new find_n_ll();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.printList();           // 1 --> 2 --> 3 --> 4 --> 5 --> null
        list.deleteNthFromEnd(2);   // delete 2nd from end (4)
        list.printList();           // 1 --> 2 --> 3 --> 5 --> null
    }
}
