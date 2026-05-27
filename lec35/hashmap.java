/*
 * INTERVIEW QUESTIONS - HashMap:
 *
 * Q1: What is HashMap?
 * A: Key-value pair collection using hashing; O(1) average operations
 *
 * Q2: How does HashMap work internally?
 * A: Uses array of buckets; hash function maps key to bucket index
 *
 * Q3: What is a hash collision?
 * A: When two different keys hash to same bucket
 *
 * Q4: How are collisions handled?
 * A: Separate chaining (LinkedList/Tree in bucket) or open addressing
 *
 * Q5: Time complexity of put, get, remove?
 * A: O(1) average, O(n) worst case
 *
 * Q6: What is load factor?
 * A: Threshold (default 0.75) for when to resize; elements/capacity
 *
 * Q7: Difference between HashMap and Hashtable?
 * A: HashMap allows null, not synchronized; Hashtable opposite
 *
 * Q8: What is entrySet()?
 * A: Returns set of key-value pairs for iteration
 */
import java.util.*;
import java.util.HashMap;

public class hashmap {

    public static void main(String[] args) {
        // Q: What is <String, Integer>? A: Key type String, Value type Integer
        HashMap<String,Integer> map=new HashMap<>();

        // Q: What does put() do? A: Adds key-value pair; replaces if key exists
        map.put("india",120);
        map.put("usa",30);
        map.put("china",150);

        System.out.println(map);

        // Q: How to check if key exists? A: containsKey()
        if(map.containsKey("china")){
            System.out.println("present");
        }else{
            System.out.println("not presemt");
        }

        // Q: What does get() return if key doesn't exist? A: null
        System.out.println(map.get("china"));  // 150
        System.out.println(map.get("japan"));  // null

        // For-each loop examples
        int arr[]={12,15,18};
        for(int i=0; i<3 ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // Q: What is enhanced for loop? A: Simplified iteration
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();

        // Q: How to iterate through HashMap?
        // A: Using entrySet() which returns Set of Map.Entry objects
        for(Map.Entry<String,Integer>e:map.entrySet()){
            System.out.println(e.getKey());    // Get key
            System.out.println(e.getValue());  // Get value
        }

        // Q: What does remove() return? A: The removed value
        map.remove("china");
        System.out.println(map);
    }


}
