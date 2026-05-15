import java.util.*;

import org.w3c.dom.Node;

public class HashMapCode {

    static class HashMap<K, V> {   // Generic HashMap

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;   // number of nodes
        private int N;   // bucket size

        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {

            this.N = 4;
            this.buckets = new LinkedList[4];

            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        // hash function
        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        // search in linked list
        private int searchInLL(K key, int bi) {

            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }

            return -1;
        }
        private void rehash(){
            LinkedList<Node> oldBucket[]=buckets;
            buckets=new LinkedList[N*2];

            for(int i=0;i<N*2;i++){
                buckets[i]=new LinkedList<>();
            }
            
            for(int i=0;i<oldBucket.length;i++){
                LinkedList<Node> ll= oldBucket[i];
                for(int j=0;j<ll.size();j++){
                Node node=ll.get(j);
                put(node.key,node.value);
                 }
             }
        }
         public void put(K key, V value) {
            int bi = hashFunction(key);      // bucket index
            int di = searchInLL(key, bi);    // data index in linked list

            if (di == -1) {
                // key doesn't exist, add new node
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                // key exists, update value
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            // check load factor and rehash if needed
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

        