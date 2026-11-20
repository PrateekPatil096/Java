import java.util.*;

public class reverseofarray {
     public int[] reverseArray(int[] nums) {
        //your code goes here
        rev(nums,0,nums.length-1);
        return nums;
    }
    public void rev(int nums[],int start,int end){
        if(start>=end){
            return;
        }
    
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        rev(nums,start+1,end-1);
        


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enetr the array elemnts");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        reverseofarray obj = new reverseofarray();
        int[] result = obj.reverseArray(arr);

        System.out.println("Reversed array:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        
    }
    
}
