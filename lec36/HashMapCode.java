/*
 * INTERVIEW QUESTIONS - HashMap Implementation:
 *
 * Q1: How is HashMap implemented internally?
 * A: Array of buckets (LinkedList), hash function, and load factor
 *
 * Q2: What is a hash function?
 * A: Converts key to array index: hashCode() % bucketSize
 *
 * Q3: Why use Math.abs()?
 * A: hashCode() can return negative values
 *
 * Q4: What is rehashing?
 * A: Creating larger bucket array and redistributing elements
 *
 * Q5: When does rehashing occur?
 * A: When load factor exceeds threshold (here 2.0)
 *
 * Q6: What is load factor formula?
 * A: lambda = n/N (number of elements / number of buckets)
 *
 * Q7: Time complexity after rehashing?
 * A: Still O(1) amortized; rehashing is O(n) but rare
 */
import java.util.*;

import org.w3c.dom.Node;

public class HashMapCode {

    // Q: What is <K, V>? A: Generic types for Key and Value
    static class HashMap<K, V> {   // Generic HashMap

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;   // Q: What is n? A: Number of key-value pairs
        private int N;   // Q: What is N? A: Number of buckets

        private LinkedList<Node> buckets[];  // Array of linked lists

        @SuppressWarnings("unchecked")
        public HashMap() {

            this.N = 4;  // Q: Initial capacity? A: 4 buckets
            this.buckets = new LinkedList[4];

            // Initialize each bucket as empty linked list
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        // Q: What does hash function do?
        // A: Converts key to bucket index using hashCode
        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;  // Q: Why % N? A: To get valid index
        }

        // Q: What does this search do?
        // A: Finds index of key in the bucket's linked list
        private int searchInLL(K key, int bi) {

            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;  // Found at index i
                }
            }

            return -1;  // Not found
        }

        // Q: What is rehashing?
        // A: Doubling bucket size and redistributing all elements
        private void rehash(){
            LinkedList<Node> oldBucket[]=buckets;
            buckets=new LinkedList[N*2];  // Double the size

            for(int i=0;i<N*2;i++){
                buckets[i]=new LinkedList<>();
            }

            // Q: Why re-insert all elements?
            // A: Hash function changed (new N), need new positions
            for(int i=0;i<oldBucket.length;i++){
                LinkedList<Node> ll= oldBucket[i];
                for(int j=0;j<ll.size();j++){
                Node node=ll.get(j);
                put(node.key,node.value);  // Re-insert
                 }
             }
        }

         // Q: What does put() do?
         // A: Inserts or updates key-value pair
         public void put(K key, V value) {
            int bi = hashFunction(key);      // Get bucket index
            int di = searchInLL(key, bi);    // Search in bucket

            if (di == -1) {
                // Q: Key not found? A: Add new node
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                // Q: Key exists? A: Update value
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            // Q: When to rehash? A: When load factor exceeds threshold
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("China", 150);
        map.put("USA", 30);
        System.out.println("HashMap created successfully!");
    }
}
