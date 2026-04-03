import java.util.ArrayList;

public class arraylists {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<Integer>();

        list.add(0);
        list.add(1);
        list.add(3);
        System.out.println(list);

        int element=list.get(0);
        System.out.println(element);

        list.add(2,9);
        System.out.println(list);

        list.set(0,5);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);
    }
    
}
