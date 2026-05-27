/*
 * INTERVIEW QUESTIONS - Count Paths in Grid (DP Problem):
 *
 * Q1: What is the problem?
 * A: Count paths from (0,0) to (n-1,m-1) moving only right or down
 *
 * Q2: What is the recursive formula?
 * A: paths(i,j) = paths(i+1,j) + paths(i,j+1)
 *
 * Q3: What are the base cases?
 * A: Out of bounds returns 0; reaching destination returns 1
 *
 * Q4: Time complexity of naive recursion?
 * A: O(2^(n+m)) - exponential due to overlapping subproblems
 *
 * Q5: How to optimize?
 * A: Use DP (memoization or tabulation) for O(n*m)
 *
 * Q6: Mathematical formula for paths?
 * A: C(n+m-2, n-1) = (n+m-2)! / ((n-1)! * (m-1)!)
 */
public class recadv2 {
    public static int countPaths(int i,int j,int n,int m){
        // Q: What is this? A: Boundary condition - out of grid
        if(i==n||j==m){
            return 0;
        }
        // Q: What is this? A: Base case - reached destination
        if(i==n-1&&j==m-1){
            return 1;
        }
        // Q: Two choices at each cell? A: Go down or go right
        int downpaths=countPaths(i+1, j, n, m);   // Move down
        int rightpaths=countPaths(i, j+1, n, m);  // Move right
        return downpaths+rightpaths;  // Total paths from this cell


    }

    public static void main(String[] args) {
        int n=3,m=4;  // 3x4 grid
        int totalpaths=countPaths(0, 0, n, m);
        System.out.println(totalpaths);  // Output: 10
    }

}
