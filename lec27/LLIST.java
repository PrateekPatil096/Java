import java.util.*;
public class LLIST {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<String>();
        list.addFirst("a");
        list.addLast("is");
        System.out.println(list);

        list.addFirst("THIS");
        list.add("list");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" -->");

        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);
    }
}
