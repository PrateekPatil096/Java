/*
 * INTERVIEW QUESTIONS - Quick Sort (Divide and Conquer):
 *
 * Q1: What is Quick Sort?
 * A: Select pivot, partition array so smaller elements are left, larger are right
 *
 * Q2: Time complexity of Quick Sort?
 * A: Average O(n log n), Worst O(n^2) when already sorted
 *
 * Q3: Space complexity?
 * A: O(log n) for recursion stack (in-place sorting)
 *
 * Q4: Is Quick Sort stable?
 * A: No, equal elements may change relative order
 *
 * Q5: What is a pivot?
 * A: Element used to partition the array; here we use last element
 *
 * Q6: How does partitioning work?
 * A: Elements < pivot go left, elements >= pivot go right
 *
 * Q7: What makes worst case occur?
 * A: Already sorted array with last element as pivot (unbalanced partitions)
 *
 * Q8: How to avoid worst case?
 * A: Use random pivot or median-of-three pivot selection
 */
public class quicksort {
    // Q: What does partition function do?
    // A: Arranges array so elements < pivot are left, >= pivot are right
    public static int partion(int arr[],int low,int high){
        int pivot=arr[high];  // Q: What is pivot selection strategy? A: Last element
        int i=low-1;  // Q: What is i? A: Index of last element smaller than pivot

        // Q: What does this loop do? A: Move all elements < pivot to left side
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;  // Expand the "smaller than pivot" region
                // Swap arr[i] and arr[j]
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        // Q: What is final step? A: Place pivot in its correct position
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;  // Return pivot's final position
    }

    public static void quicksorting(int arr[],int low,int high){
        // Q: Base case? A: When subarray has 0 or 1 element
        if(low<high){
            // Q: What is pidx? A: Pivot's final sorted position
            int pidx=partion(arr, low, high);
            quicksorting(arr, low, pidx-1);   // Sort left partition
            quicksorting(arr, pidx+1, high);  // Sort right partition
        }
    }

    public static void main(String[] args) {
         int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        quicksorting(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }


}
