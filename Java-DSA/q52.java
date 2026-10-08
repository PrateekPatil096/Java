import java.util.*;
public class q52 {
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

        //finding the highest frequency 
        int maxfreq=0;
        for(int count : map.values()){
            if(count>maxfreq){
                maxfreq=count;
            }
        }

            int lowfreq=Integer.MAX_VALUE;
            for(int count : map.values()){
                if(count<lowfreq){
                    lowfreq=count;
                }

            }

            int result=maxfreq+lowfreq;
            System.out.println(result);

        

    }    
}
