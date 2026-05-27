/*
 * INTERVIEW QUESTIONS - ArrayList in Java:
 *
 * Q1: What is ArrayList?
 * A: Dynamic array that can grow/shrink; part of Java Collections Framework
 *
 * Q2: How is ArrayList different from Array?
 * A: ArrayList is resizable; Array has fixed size
 *
 * Q3: What is the initial capacity of ArrayList?
 * A: 10 (default); doubles when full
 *
 * Q4: Time complexity of add() at end?
 * A: O(1) amortized; O(n) when resize needed
 *
 * Q5: Time complexity of get(index)?
 * A: O(1) - direct index access
 *
 * Q6: Time complexity of add(index, element)?
 * A: O(n) - elements need to shift
 *
 * Q7: Can ArrayList store primitives?
 * A: No, only objects; use wrapper classes (Integer, not int)
 *
 * Q8: What is Collections.sort()?
 * A: Sorts ArrayList in ascending order; uses TimSort O(n log n)
 */
import java.util.ArrayList;
import java.util.Collections;

public class arraylists {
    public static void main(String[] args) {
        // Q: What is <Integer>? A: Generic type parameter - ArrayList stores Integer objects
        ArrayList<Integer>list=new ArrayList<Integer>();

        // Q: What is add()? A: Adds element at end; O(1)
        list.add(2);
        list.add(1);
        list.add(5);
        System.out.println(list);  // [2, 1, 5]

        // Q: What is get(0)? A: Returns element at index 0; O(1)
        int element=list.get(0);
        System.out.println(element);  // 2

        // Q: What does add(2, 9) do? A: Inserts 9 at index 2; O(n) shifts elements
        list.add(2,9);
        System.out.println(list);  // [2, 1, 9, 5]

        // Q: What is set()? A: Replaces element at index; O(1)
        list.set(0,5);
        System.out.println(list);  // [5, 1, 9, 5]

        // Q: What does remove(3) do? A: Removes element at index 3; O(n)
        list.remove(3);
        System.out.println(list);  // [5, 1, 9]

        // Q: What is size()? A: Returns number of elements
        int size=list.size();
        System.out.println(size);  // 3

        // Q: How to iterate ArrayList?
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();

        // Q: What does Collections.sort() do? A: Sorts in ascending order
        Collections.sort(list);
        System.out.println(list);  // [1, 5, 9]

        list.remove(0);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        list.add(1,3);
        System.out.println(list);

        list.set(0,6);
        System.out.println(list);
    }

}
