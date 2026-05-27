/*
 * INTERVIEW QUESTIONS - Tiling Problem (Place Tiles):
 *
 * Q1: What is the tiling problem?
 * A: Count ways to fill n x m board with 1 x m tiles
 *
 * Q2: What are the two choices at each step?
 * A: Place tile vertically or horizontally
 *
 * Q3: When does n==m return 2?
 * A: Can place single horizontal tile or m vertical tiles
 *
 * Q4: When does n<m return 1?
 * A: Only one way - place tiles vertically
 *
 * Q5: What is the recurrence relation?
 * A: f(n) = f(n-m) + f(n-1) for tile placements
 *
 * Q6: Similar to which famous problem?
 * A: Fibonacci-like structure; also similar to staircase problem
 */
public class recadv3 {
    public static int placeTiles(int n, int m ){
        // Q: Base case - square grid
        if(n==m){
            return 2;  // Place all vertical OR one horizontal
        }
        // Q: Base case - not enough space for horizontal
        if(n<m){
            return 1;  // Only vertical placement possible
        }
        // Q: Two choices at each step
        int vertplacements=placeTiles(n-m, m);  // Place tile vertically (uses m columns)
        int horplacements=placeTiles(n-1, m);   // Place tile horizontally (uses 1 column)
        return vertplacements+horplacements;
    }

    public static void main(String[] args) {
        int n=4 ,m=2;  // 4x2 board with 1x2 tiles
        System.out.println(placeTiles(n, m));  // Output: 5
    }

}
