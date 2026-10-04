
import java.util.*;
public class q50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the elements of array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int x:arr){
            map.put(x,map.getOrDefault(x, 0)+1);
        }
        int max=0;
        int ans=0;
         for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey();
            int count=entry.getValue();

            if(count>max){
                max=count;
                ans=key;

            }
            
        }
        System.out.println(ans);

    }
    
}

