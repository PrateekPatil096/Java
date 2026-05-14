import java.util.*;
import java.util.HashMap;

public class hashmap {

    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        map.put("india",120);
        map.put("usa",30);
        map.put("china",150);

        System.out.println(map);

        if(map.containsKey("china")){
            System.out.println("present");
        }else{
            System.out.println("not presemt");
        }

        System.out.println(map.get("china"));
        System.out.println(map.get("japan"));
    }

    
}
