import java.util.ArrayList;
import java.util.Collections;

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

        int size=list.size();
        System.out.println(size);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();
        
        Collections.sort(list);
        System.out.println(list);
    }
    
}
