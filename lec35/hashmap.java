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

        int arr[]={12,15,18};
        for(int i=0; i<3 ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }


    
}
