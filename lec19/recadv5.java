/*
 * INTERVIEW QUESTIONS - Print All Subsets (Power Set):
 *
 * Q1: What is a subset?
 * A: Any combination of elements from a set, including empty set
 *
 * Q2: How many subsets for a set of n elements?
 * A: 2^n subsets (each element can be included or excluded)
 *
 * Q3: What is the Power Set?
 * A: Set of all subsets of a given set
 *
 * Q4: What is the backtracking approach here?
 * A: For each element, choose to include or exclude, then recurse
 *
 * Q5: Time complexity?
 * A: O(n * 2^n) - 2^n subsets, each takes O(n) to print
 *
 * Q6: What does removing last element do?
 * A: Backtracking - undo the choice to explore other possibilities
 */
import java.lang.module.FindException;
import java.util.*;
public class recadv5 {
    public static void printsubset(ArrayList<Integer>subset){
        for(int i=-0;i<subset.size();i++){
            System.out.println(subset.get(i)+"");
        }
         System.out.println();
    }

    public static void findsubset(int n,ArrayList<Integer>subset){
        // Q: Base case - no more elements to consider
        if(n==0){
            printsubset(subset);
            return;
        }
        // Q: Choice 1 - INCLUDE current element
        subset.add(n);
        findsubset(n-1, subset);

        // Q: What is this? A: BACKTRACK - remove element we just added
        subset.remove(subset.size()-1);

        // Q: Choice 2 - EXCLUDE current element
        findsubset(n-1, subset);

    }

    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer>subset=new ArrayList<>();
        findsubset(n, subset);  // Prints all 2^3 = 8 subsets
    }

}
