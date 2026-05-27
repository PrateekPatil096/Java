/*
 * INTERVIEW QUESTIONS - HashSet:
 *
 * Q1: What is HashSet?
 * A: Collection that stores unique elements using hashing
 *
 * Q2: How does HashSet ensure uniqueness?
 * A: Uses hashCode() and equals() to check for duplicates
 *
 * Q3: Time complexity of add, contains, remove?
 * A: O(1) average, O(n) worst case (many collisions)
 *
 * Q4: Does HashSet maintain order?
 * A: No, use LinkedHashSet for insertion order
 *
 * Q5: Can HashSet store null?
 * A: Yes, but only one null value
 *
 * Q6: What is Iterator?
 * A: Object to traverse collection without knowing internal structure
 *
 * Q7: Difference between HashSet and TreeSet?
 * A: HashSet is O(1) unordered; TreeSet is O(log n) sorted
 */
import java.util.*;

public class hashing {
    public static void main(String[] args) {
        // Q: What is <Integer>? A: Generic type - stores Integer objects
        HashSet<Integer> set=new HashSet<>();

        // Q: What happens if we add duplicate?
        // A: Duplicate is ignored, only unique elements stored
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);  // Duplicate - will be ignored

        // Q: What will size be? A: 3 (1, 2, 3 - no duplicate)
        System.out.println("size of set is"+ set.size());
        System.out.println(set);

        // Q: Time complexity of contains? A: O(1) average
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("does not contain");
        }

        // Q: How to iterate through HashSet?
        // A: Using Iterator or for-each loop
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }


}
