import java.util.*;

public class LRUCache {
    
    private int capacity;
    private LinkedHashMap<Integer, Integer> cache;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }
        };
    }
    
    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        cache.put(key, value);
    }
    
    public static void main(String[] args) {
        LRUCache lru = new LRUCache(2);
        
        lru.put(1, 1);
        lru.put(2, 2);
        System.out.println(lru.get(1));  // 1
        
        lru.put(3, 3);  // Evicts key 2
        System.out.println(lru.get(2));  // -1
        
        lru.put(4, 4);  // Evicts key 1
        System.out.println(lru.get(1));  // -1
        System.out.println(lru.get(3));  // 3
        System.out.println(lru.get(4));  // 4
    }
}
