import java.util.*;
public class SortByFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        char[]arr=s.toCharArray();
       int [] freq=new int[128];

       for(int i=0;i<arr.length;i++){
        freq[arr[i]]++;
       }

       for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(freq[arr[j]]>freq[arr[i]]){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
       }

       System.out.println(new String(arr));

       
    }
}
    
    

