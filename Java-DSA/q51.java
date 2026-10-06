import java.util.*;
public class q51 {
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

        for(int x: arr){
            map.put(x,map.getOrDefault(x, 0)+1);
        }
        //finding the highest frequency

        int maxfreq=0;
        for(int count:map.values()){
            if(count>maxfreq){
                maxfreq=count;
            }
        }
        //finding 2nd highest frequency
        int secondmaxfreq=0;
        for(int count:map.values()){
            if(count<maxfreq && count>secondmaxfreq){
                secondmaxfreq=count;
            }
        }
        //if 2nd highest frequency did not exits
        if(secondmaxfreq==0){
            System.out.println("-1");
            return;
        }

        int ans=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int key=entry.getKey();
            int count=entry.getValue();

            if(count==secondmaxfreq && key < ans){
                ans=key;
            }
        }
        System.out.println(ans);




    }
    
}
