import java.util.*;
public class sumofarray {

    public static int arraysum(int[]nums,int index){
        if(index==nums.length){
            return 0;
        }
        return nums[index]+arraysum(nums, index+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];

        System.out.println("enter the array elemnts");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(arraysum(arr, 0));


    }
    
}
