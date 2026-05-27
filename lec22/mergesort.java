/*
 * INTERVIEW QUESTIONS - Merge Sort (Divide and Conquer):
 *
 * Q1: What is Merge Sort?
 * A: Divide array into halves, recursively sort, then merge sorted halves
 *
 * Q2: Time complexity of Merge Sort?
 * A: O(n log n) in all cases (best, average, worst)
 *
 * Q3: Space complexity?
 * A: O(n) - requires extra array for merging
 *
 * Q4: Is Merge Sort stable?
 * A: Yes, equal elements maintain their relative order
 *
 * Q5: What is "Divide and Conquer"?
 * A: Break problem into smaller subproblems, solve them, combine solutions
 *
 * Q6: When is Merge Sort preferred over Quick Sort?
 * A: When stability is needed, or guaranteed O(n log n) is required
 *
 * Q7: Why use mid = si + (ei-si)/2 instead of (si+ei)/2?
 * A: To prevent integer overflow for large indices
 */
public class mergesort {
    // Q: What is this function doing? A: CONQUER - merge two sorted halves
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];  // Temporary array for merging
        int idx1 = si;      // Pointer for left half
        int idx2 = mid + 1; // Pointer for right half
        int x = 0;          // Pointer for merged array

        // Q: What comparison ensures stability? A: arr[idx1] <= arr[idx2]
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];  // Take from left half
            } else {
                merged[x++] = arr[idx2++];  // Take from right half
            }
        }

        // Q: Why these two while loops? A: Copy remaining elements
        while (idx1 <= mid) {
            merged[x++]=arr[idx1++];  // Copy remaining left half
        }
        while (idx2<=ei) {
            merged[x++]=arr[idx2++];  // Copy remaining right half
        }

        // Copy merged array back to original
        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }

    // Q: What is this function? A: DIVIDE - split array recursively
    public static void divide(int arr[],int si,int ei){
        // Q: Base case? A: Single element or empty subarray is already sorted
        if(si>=ei){
            return;
        }
        // Q: Why this formula for mid? A: Prevents overflow
        int mid=si+(ei-si)/2;
        divide(arr, si, mid);      // Sort left half
        divide(arr, mid+1, ei);    // Sort right half
        conquer(arr, si, mid, ei); // Merge sorted halves
    }

    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        divide(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }

}
