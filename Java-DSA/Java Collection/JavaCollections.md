# Java Collections - Complete Guide

## Collection Framework Hierarchy

```
                            Iterable
                               │
                          Collection
                               │
          ┌────────────────────┼────────────────────┐
          │                    │                    │
         List                 Set                 Queue
          │                    │                    │
    ┌─────┼─────┐        ┌─────┼─────┐        ┌─────┼─────┐
    │     │     │        │     │     │        │     │     │
ArrayList │  Vector   HashSet │  TreeSet  PriorityQueue │
       LinkedList      LinkedHashSet              ArrayDeque
          │
        Stack


                              Map (Separate Interface)
                               │
              ┌────────────────┼────────────────┐
              │                │                │
           HashMap      LinkedHashMap       TreeMap
              │
          Hashtable
```

---

# 1. ArrayList

### What is it?
- Dynamic array (grows automatically)
- Allows duplicates
- Maintains insertion order
- Fast random access (index based)
- Slow insert/delete in middle

```java
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
```

### All Methods:

| Method | Description | Example |
|--------|-------------|---------|
| `add(E e)` | Add element at end | `list.add("Apple")` |
| `add(int index, E e)` | Add at specific index | `list.add(0, "Mango")` |
| `addAll(Collection c)` | Add all elements | `list.addAll(list2)` |
| `addAll(int index, Collection c)` | Add all at index | `list.addAll(1, list2)` |
| `get(int index)` | Get element at index | `list.get(0)` |
| `set(int index, E e)` | Replace element | `list.set(0, "Banana")` |
| `remove(int index)` | Remove by index | `list.remove(0)` |
| `remove(Object o)` | Remove by object | `list.remove("Apple")` |
| `removeAll(Collection c)` | Remove all matching | `list.removeAll(list2)` |
| `removeIf(Predicate p)` | Remove if condition | `list.removeIf(x -> x.length() > 5)` |
| `clear()` | Remove all elements | `list.clear()` |
| `size()` | Get number of elements | `list.size()` |
| `isEmpty()` | Check if empty | `list.isEmpty()` |
| `contains(Object o)` | Check if exists | `list.contains("Apple")` |
| `containsAll(Collection c)` | Check all exist | `list.containsAll(list2)` |
| `indexOf(Object o)` | First index of element | `list.indexOf("Apple")` |
| `lastIndexOf(Object o)` | Last index of element | `list.lastIndexOf("Apple")` |
| `subList(int from, int to)` | Get portion of list | `list.subList(1, 3)` |
| `toArray()` | Convert to array | `list.toArray()` |
| `sort(Comparator c)` | Sort the list | `list.sort(Comparator.naturalOrder())` |
| `forEach(Consumer c)` | Loop through | `list.forEach(System.out::println)` |
| `replaceAll(UnaryOperator)` | Replace all elements | `list.replaceAll(String::toUpperCase)` |
| `retainAll(Collection c)` | Keep only matching | `list.retainAll(list2)` |
| `clone()` | Create copy | `list.clone()` |
| `ensureCapacity(int n)` | Set minimum capacity | `list.ensureCapacity(100)` |
| `trimToSize()` | Trim capacity to size | `list.trimToSize()` |

### Example:
```java
ArrayList<Integer> nums = new ArrayList<>();

// Adding
nums.add(10);           // [10]
nums.add(20);           // [10, 20]
nums.add(1, 15);        // [10, 15, 20]

// Accessing
int val = nums.get(0);  // 10

// Updating
nums.set(0, 100);       // [100, 15, 20]

// Removing
nums.remove(0);         // [15, 20]

// Size
int size = nums.size(); // 2

// Check
boolean exists = nums.contains(15);  // true

// Loop
for(int n : nums) {
    System.out.println(n);
}

// Sort
Collections.sort(nums);  // ascending
Collections.sort(nums, Collections.reverseOrder());  // descending
```

---

# 2. LinkedList

### What is it?
- Doubly linked list
- Fast insert/delete anywhere
- Slow random access
- Can be used as List, Queue, Deque

```java
import java.util.LinkedList;

LinkedList<String> list = new LinkedList<>();
```

### All Methods:

| Method | Description | Example |
|--------|-------------|---------|
| **List Methods** | | |
| `add(E e)` | Add at end | `list.add("A")` |
| `add(int index, E e)` | Add at index | `list.add(0, "B")` |
| `get(int index)` | Get at index | `list.get(0)` |
| `set(int index, E e)` | Replace at index | `list.set(0, "C")` |
| `remove(int index)` | Remove at index | `list.remove(0)` |
| **LinkedList Special** | | |
| `addFirst(E e)` | Add at beginning | `list.addFirst("X")` |
| `addLast(E e)` | Add at end | `list.addLast("Y")` |
| `getFirst()` | Get first element | `list.getFirst()` |
| `getLast()` | Get last element | `list.getLast()` |
| `removeFirst()` | Remove first | `list.removeFirst()` |
| `removeLast()` | Remove last | `list.removeLast()` |
| **Queue Methods** | | |
| `offer(E e)` | Add at end (queue) | `list.offer("A")` |
| `poll()` | Remove from front | `list.poll()` |
| `peek()` | View front element | `list.peek()` |
| **Deque Methods** | | |
| `offerFirst(E e)` | Add at front | `list.offerFirst("A")` |
| `offerLast(E e)` | Add at end | `list.offerLast("B")` |
| `pollFirst()` | Remove from front | `list.pollFirst()` |
| `pollLast()` | Remove from end | `list.pollLast()` |
| `peekFirst()` | View front | `list.peekFirst()` |
| `peekLast()` | View end | `list.peekLast()` |
| **Stack Methods** | | |
| `push(E e)` | Push to top | `list.push("A")` |
| `pop()` | Pop from top | `list.pop()` |
| **Other Methods** | | |
| `size()` | Get size | `list.size()` |
| `isEmpty()` | Check empty | `list.isEmpty()` |
| `contains(Object o)` | Check exists | `list.contains("A")` |
| `clear()` | Remove all | `list.clear()` |
| `clone()` | Create copy | `list.clone()` |
| `descendingIterator()` | Reverse iterator | `list.descendingIterator()` |

### Example:
```java
LinkedList<String> list = new LinkedList<>();

// As List
list.add("B");           // [B]
list.addFirst("A");      // [A, B]
list.addLast("C");       // [A, B, C]

// As Queue (FIFO)
list.offer("D");         // [A, B, C, D]
String front = list.poll(); // "A", list = [B, C, D]

// As Stack (LIFO)
list.push("X");          // [X, B, C, D]
String top = list.pop(); // "X", list = [B, C, D]
```

---

# 3. Stack

### What is it?
- LIFO (Last In First Out)
- Extends Vector class
- Use Deque instead (recommended)

```java
import java.util.Stack;

Stack<Integer> stack = new Stack<>();
```

### All Methods:

| Method | Description | Example |
|--------|-------------|---------|
| `push(E e)` | Push to top | `stack.push(10)` |
| `pop()` | Remove & return top | `stack.pop()` |
| `peek()` | View top (no remove) | `stack.peek()` |
| `empty()` | Check if empty | `stack.empty()` |
| `search(Object o)` | Position from top (1-based) | `stack.search(10)` |
| `size()` | Get size | `stack.size()` |
| `clear()` | Remove all | `stack.clear()` |
| `contains(Object o)` | Check exists | `stack.contains(10)` |

### Example:
```java
Stack<Integer> stack = new Stack<>();

stack.push(10);     // [10]
stack.push(20);     // [10, 20]
stack.push(30);     // [10, 20, 30]

int top = stack.peek();   // 30 (view only)
int popped = stack.pop(); // 30, stack = [10, 20]

boolean empty = stack.empty();  // false
int pos = stack.search(10);     // 2 (position from top)
```

### Better Alternative - ArrayDeque as Stack:
```java
Deque<Integer> stack = new ArrayDeque<>();

stack.push(10);
stack.push(20);
int top = stack.pop();  // 20
```

---

# 4. Queue

### What is it?
- FIFO (First In First Out)
- Interface implemented by LinkedList, PriorityQueue

```java
import java.util.Queue;
import java.util.LinkedList;

Queue<String> queue = new LinkedList<>();
```

### All Methods:

| Method | Description | Throws Exception | Returns null/false |
|--------|-------------|------------------|-------------------|
| Add element | `add(E e)` | Yes | `offer(E e)` - No |
| Remove element | `remove()` | Yes | `poll()` - No |
| View front | `element()` | Yes | `peek()` - No |

| Method | Description | Example |
|--------|-------------|---------|
| `add(E e)` | Add at end (throws exception if full) | `queue.add("A")` |
| `offer(E e)` | Add at end (returns false if full) | `queue.offer("A")` |
| `remove()` | Remove from front (throws if empty) | `queue.remove()` |
| `poll()` | Remove from front (returns null if empty) | `queue.poll()` |
| `element()` | View front (throws if empty) | `queue.element()` |
| `peek()` | View front (returns null if empty) | `queue.peek()` |
| `size()` | Get size | `queue.size()` |
| `isEmpty()` | Check empty | `queue.isEmpty()` |
| `contains(Object o)` | Check exists | `queue.contains("A")` |
| `clear()` | Remove all | `queue.clear()` |

### Example:
```java
Queue<Integer> queue = new LinkedList<>();

queue.offer(10);    // [10]
queue.offer(20);    // [10, 20]
queue.offer(30);    // [10, 20, 30]

int front = queue.peek();  // 10
int removed = queue.poll(); // 10, queue = [20, 30]
```

---

# 5. PriorityQueue

### What is it?
- Elements ordered by priority (natural order or comparator)
- Min-heap by default (smallest first)
- Not thread-safe

```java
import java.util.PriorityQueue;

PriorityQueue<Integer> pq = new PriorityQueue<>();  // Min heap
PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());  // Max heap
```

### All Methods:

| Method | Description | Example |
|--------|-------------|---------|
| `add(E e)` | Add element | `pq.add(10)` |
| `offer(E e)` | Add element | `pq.offer(10)` |
| `poll()` | Remove smallest | `pq.poll()` |
| `peek()` | View smallest | `pq.peek()` |
| `remove(Object o)` | Remove specific | `pq.remove(10)` |
| `size()` | Get size | `pq.size()` |
| `isEmpty()` | Check empty | `pq.isEmpty()` |
| `contains(Object o)` | Check exists | `pq.contains(10)` |
| `clear()` | Remove all | `pq.clear()` |
| `toArray()` | Convert to array | `pq.toArray()` |
| `comparator()` | Get comparator | `pq.comparator()` |

### Example:
```java
// Min Heap (default)
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
minHeap.offer(30);
minHeap.offer(10);
minHeap.offer(20);

minHeap.poll();  // 10 (smallest first)
minHeap.poll();  // 20
minHeap.poll();  // 30

// Max Heap
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
maxHeap.offer(30);
maxHeap.offer(10);
maxHeap.offer(20);

maxHeap.poll();  // 30 (largest first)
maxHeap.poll();  // 20
maxHeap.poll();  // 10

// Custom Comparator
PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> a.length() - b.length());
pq.offer("Apple");
pq.offer("Hi");
pq.offer("Banana");

pq.poll();  // "Hi" (shortest first)
```

---

# 6. Deque (Double Ended Queue)

### What is it?
- Insert/Remove from both ends
- Can be used as Stack or Queue
- ArrayDeque is the implementation

```java
import java.util.Deque;
import java.util.ArrayDeque;

Deque<Integer> deque = new ArrayDeque<>();
```

### All Methods:

| Method | Description | Front | Back |
|--------|-------------|-------|------|
| Add (throws exception) | | `addFirst(e)` | `addLast(e)` |
| Add (returns boolean) | | `offerFirst(e)` | `offerLast(e)` |
| Remove (throws exception) | | `removeFirst()` | `removeLast()` |
| Remove (returns null) | | `pollFirst()` | `pollLast()` |
| View (throws exception) | | `getFirst()` | `getLast()` |
| View (returns null) | | `peekFirst()` | `peekLast()` |

| Stack Operations | Queue Operations |
|------------------|------------------|
| `push(e)` = addFirst | `offer(e)` = offerLast |
| `pop()` = removeFirst | `poll()` = pollFirst |
| `peek()` = peekFirst | `peek()` = peekFirst |

### Example:
```java
Deque<Integer> deque = new ArrayDeque<>();

// Add elements
deque.addFirst(10);     // [10]
deque.addLast(20);      // [10, 20]
deque.addFirst(5);      // [5, 10, 20]

// Remove elements
deque.pollFirst();      // 5, deque = [10, 20]
deque.pollLast();       // 20, deque = [10]

// As Stack
deque.push(30);         // [30, 10]
deque.pop();            // 30

// As Queue
deque.offer(40);        // [10, 40]
deque.poll();           // 10
```

---

# 7. HashSet

### What is it?
- No duplicates allowed
- No order guaranteed
- O(1) for add, remove, contains
- Allows one null value

```java
import java.util.HashSet;

HashSet<String> set = new HashSet<>();
```

### All Methods:

| Method | Description | Example |
|--------|-------------|---------|
| `add(E e)` | Add element (returns true if new) | `set.add("Apple")` |
| `addAll(Collection c)` | Add all elements | `set.addAll(list)` |
| `remove(Object o)` | Remove element | `set.remove("Apple")` |
| `removeAll(Collection c)` | Remove all matching | `set.removeAll(list)` |
| `removeIf(Predicate p)` | Remove if condition | `set.removeIf(x -> x.length() > 5)` |
| `retainAll(Collection c)` | Keep only matching | `set.retainAll(list)` |
| `clear()` | Remove all | `set.clear()` |
| `size()` | Get size | `set.size()` |
| `isEmpty()` | Check empty | `set.isEmpty()` |
| `contains(Object o)` | Check exists | `set.contains("Apple")` |
| `containsAll(Collection c)` | Check all exist | `set.containsAll(list)` |
| `toArray()` | Convert to array | `set.toArray()` |
| `iterator()` | Get iterator | `set.iterator()` |
| `forEach(Consumer c)` | Loop through | `set.forEach(System.out::println)` |
| `clone()` | Create copy | `set.clone()` |

### Example:
```java
HashSet<Integer> set = new HashSet<>();

set.add(10);        // [10]
set.add(20);        // [10, 20]
set.add(10);        // [10, 20] - duplicate ignored

set.contains(10);   // true
set.remove(10);     // [20]
set.size();         // 1

// Loop
for(int n : set) {
    System.out.println(n);
}
```

---

# 8. LinkedHashSet

### What is it?
- No duplicates
- Maintains insertion order
- Slightly slower than HashSet

```java
import java.util.LinkedHashSet;

LinkedHashSet<String> set = new LinkedHashSet<>();
```

### Methods:
Same as HashSet, but maintains order.

### Example:
```java
LinkedHashSet<String> set = new LinkedHashSet<>();

set.add("C");
set.add("A");
set.add("B");

// Output: C, A, B (insertion order maintained)
for(String s : set) {
    System.out.println(s);
}
```

---

# 9. TreeSet

### What is it?
- No duplicates
- Sorted order (natural or custom comparator)
- O(log n) operations
- Does NOT allow null

```java
import java.util.TreeSet;

TreeSet<Integer> set = new TreeSet<>();
TreeSet<Integer> descSet = new TreeSet<>(Collections.reverseOrder());
```

### All Methods:

| Method | Description | Example |
|--------|-------------|---------|
| **Basic Methods** | | |
| `add(E e)` | Add element | `set.add(10)` |
| `remove(Object o)` | Remove element | `set.remove(10)` |
| `contains(Object o)` | Check exists | `set.contains(10)` |
| `size()` | Get size | `set.size()` |
| `isEmpty()` | Check empty | `set.isEmpty()` |
| `clear()` | Remove all | `set.clear()` |
| **Navigation Methods** | | |
| `first()` | Get smallest | `set.first()` |
| `last()` | Get largest | `set.last()` |
| `lower(E e)` | Greatest element < e | `set.lower(15)` |
| `floor(E e)` | Greatest element <= e | `set.floor(15)` |
| `higher(E e)` | Smallest element > e | `set.higher(15)` |
| `ceiling(E e)` | Smallest element >= e | `set.ceiling(15)` |
| `pollFirst()` | Remove & return smallest | `set.pollFirst()` |
| `pollLast()` | Remove & return largest | `set.pollLast()` |
| **Range Methods** | | |
| `headSet(E e)` | Elements < e | `set.headSet(20)` |
| `tailSet(E e)` | Elements >= e | `set.tailSet(20)` |
| `subSet(E from, E to)` | Elements in range | `set.subSet(10, 30)` |
| `descendingSet()` | Reverse order view | `set.descendingSet()` |
| `descendingIterator()` | Reverse iterator | `set.descendingIterator()` |
| `comparator()` | Get comparator | `set.comparator()` |

### Example:
```java
TreeSet<Integer> set = new TreeSet<>();

set.add(30);
set.add(10);
set.add(20);
set.add(40);

// Sorted: [10, 20, 30, 40]

set.first();        // 10
set.last();         // 40
set.lower(25);      // 20 (greatest < 25)
set.higher(25);     // 30 (smallest > 25)
set.floor(20);      // 20 (greatest <= 20)
set.ceiling(25);    // 30 (smallest >= 25)

set.headSet(30);    // [10, 20]
set.tailSet(30);    // [30, 40]
set.subSet(15, 35); // [20, 30]

set.pollFirst();    // 10, set = [20, 30, 40]
set.pollLast();     // 40, set = [20, 30]
```

---

# 10. HashMap

### What is it?
- Key-Value pairs
- No duplicate keys
- Allows one null key, multiple null values
- No order guaranteed
- O(1) operations

```java
import java.util.HashMap;

HashMap<String, Integer> map = new HashMap<>();
```

### All Methods:

| Method | Description | Example |
|--------|-------------|---------|
| **Basic Methods** | | |
| `put(K key, V value)` | Add/Update entry | `map.put("Apple", 100)` |
| `putAll(Map m)` | Add all entries | `map.putAll(map2)` |
| `putIfAbsent(K key, V value)` | Add only if key absent | `map.putIfAbsent("Apple", 100)` |
| `get(K key)` | Get value | `map.get("Apple")` |
| `getOrDefault(K key, V default)` | Get or default | `map.getOrDefault("Mango", 0)` |
| `remove(K key)` | Remove by key | `map.remove("Apple")` |
| `remove(K key, V value)` | Remove if matches | `map.remove("Apple", 100)` |
| `clear()` | Remove all | `map.clear()` |
| **Check Methods** | | |
| `containsKey(K key)` | Check key exists | `map.containsKey("Apple")` |
| `containsValue(V value)` | Check value exists | `map.containsValue(100)` |
| `isEmpty()` | Check empty | `map.isEmpty()` |
| `size()` | Get size | `map.size()` |
| **View Methods** | | |
| `keySet()` | Get all keys | `map.keySet()` |
| `values()` | Get all values | `map.values()` |
| `entrySet()` | Get all entries | `map.entrySet()` |
| **Update Methods** | | |
| `replace(K key, V value)` | Replace value | `map.replace("Apple", 200)` |
| `replace(K key, V old, V new)` | Replace if matches | `map.replace("Apple", 100, 200)` |
| `replaceAll(BiFunction f)` | Replace all values | `map.replaceAll((k,v) -> v*2)` |
| **Compute Methods** | | |
| `compute(K key, BiFunction f)` | Compute new value | `map.compute("Apple", (k,v) -> v+10)` |
| `computeIfAbsent(K key, Function f)` | Compute if absent | `map.computeIfAbsent("Mango", k -> 50)` |
| `computeIfPresent(K key, BiFunction f)` | Compute if present | `map.computeIfPresent("Apple", (k,v) -> v+10)` |
| `merge(K key, V value, BiFunction f)` | Merge values | `map.merge("Apple", 10, Integer::sum)` |
| **Loop Methods** | | |
| `forEach(BiConsumer c)` | Loop through | `map.forEach((k,v) -> System.out.println(k + "=" + v))` |

### Example:
```java
HashMap<String, Integer> map = new HashMap<>();

// Add
map.put("Apple", 100);
map.put("Banana", 50);
map.put("Mango", 80);

// Get
int price = map.get("Apple");           // 100
int price2 = map.getOrDefault("Orange", 0);  // 0

// Check
map.containsKey("Apple");    // true
map.containsValue(100);      // true

// Update
map.put("Apple", 120);       // updates value
map.replace("Apple", 150);   // another way to update

// Remove
map.remove("Banana");

// Loop through keys
for(String key : map.keySet()) {
    System.out.println(key);
}

// Loop through values
for(int val : map.values()) {
    System.out.println(val);
}

// Loop through entries
for(Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
}

// Frequency Count Example
String[] arr = {"a", "b", "a", "c", "b", "a"};
HashMap<String, Integer> freq = new HashMap<>();

for(String s : arr) {
    freq.put(s, freq.getOrDefault(s, 0) + 1);
}
// freq = {a=3, b=2, c=1}
```

---

# 11. LinkedHashMap

### What is it?
- Like HashMap but maintains insertion order
- Slightly slower than HashMap

```java
import java.util.LinkedHashMap;

LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
```

### Methods:
Same as HashMap + maintains order.

### Special Feature - Access Order:
```java
// Access order (for LRU cache)
LinkedHashMap<String, Integer> map = new LinkedHashMap<>(16, 0.75f, true);
```

---

# 12. TreeMap

### What is it?
- Sorted by keys
- O(log n) operations
- Does NOT allow null keys

```java
import java.util.TreeMap;

TreeMap<String, Integer> map = new TreeMap<>();
TreeMap<String, Integer> descMap = new TreeMap<>(Collections.reverseOrder());
```

### All Methods:

| Method | Description | Example |
|--------|-------------|---------|
| **Basic (same as HashMap)** | | |
| `put(K, V)`, `get(K)`, `remove(K)`, etc. | | |
| **Navigation Methods** | | |
| `firstKey()` | Get smallest key | `map.firstKey()` |
| `lastKey()` | Get largest key | `map.lastKey()` |
| `firstEntry()` | Get smallest entry | `map.firstEntry()` |
| `lastEntry()` | Get largest entry | `map.lastEntry()` |
| `lowerKey(K key)` | Greatest key < k | `map.lowerKey("M")` |
| `floorKey(K key)` | Greatest key <= k | `map.floorKey("M")` |
| `higherKey(K key)` | Smallest key > k | `map.higherKey("M")` |
| `ceilingKey(K key)` | Smallest key >= k | `map.ceilingKey("M")` |
| `lowerEntry(K key)` | Entry with greatest key < k | `map.lowerEntry("M")` |
| `floorEntry(K key)` | Entry with greatest key <= k | `map.floorEntry("M")` |
| `higherEntry(K key)` | Entry with smallest key > k | `map.higherEntry("M")` |
| `ceilingEntry(K key)` | Entry with smallest key >= k | `map.ceilingEntry("M")` |
| `pollFirstEntry()` | Remove & return smallest | `map.pollFirstEntry()` |
| `pollLastEntry()` | Remove & return largest | `map.pollLastEntry()` |
| **Range Methods** | | |
| `headMap(K key)` | Entries with keys < k | `map.headMap("M")` |
| `tailMap(K key)` | Entries with keys >= k | `map.tailMap("M")` |
| `subMap(K from, K to)` | Entries in range | `map.subMap("A", "M")` |
| `descendingMap()` | Reverse order view | `map.descendingMap()` |
| `descendingKeySet()` | Reverse key set | `map.descendingKeySet()` |
| `navigableKeySet()` | Navigable key set | `map.navigableKeySet()` |
| `comparator()` | Get comparator | `map.comparator()` |

### Example:
```java
TreeMap<String, Integer> map = new TreeMap<>();

map.put("Banana", 50);
map.put("Apple", 100);
map.put("Mango", 80);

// Sorted by key: Apple=100, Banana=50, Mango=80

map.firstKey();         // "Apple"
map.lastKey();          // "Mango"
map.lowerKey("Cherry"); // "Banana"
map.higherKey("Banana"); // "Mango"

map.headMap("Mango");   // {Apple=100, Banana=50}
map.tailMap("Banana");  // {Banana=50, Mango=80}
```

---

# 13. Hashtable

### What is it?
- Thread-safe version of HashMap
- Does NOT allow null key or value
- Legacy class (use ConcurrentHashMap instead)

```java
import java.util.Hashtable;

Hashtable<String, Integer> table = new Hashtable<>();
```

---

# 14. Collections Utility Class

```java
import java.util.Collections;
```

### All Methods:

| Method | Description | Example |
|--------|-------------|---------|
| **Sorting** | | |
| `sort(List)` | Sort ascending | `Collections.sort(list)` |
| `sort(List, Comparator)` | Sort with comparator | `Collections.sort(list, Collections.reverseOrder())` |
| `reverse(List)` | Reverse order | `Collections.reverse(list)` |
| `shuffle(List)` | Random shuffle | `Collections.shuffle(list)` |
| `rotate(List, int)` | Rotate elements | `Collections.rotate(list, 2)` |
| `swap(List, int, int)` | Swap two elements | `Collections.swap(list, 0, 1)` |
| **Searching** | | |
| `binarySearch(List, key)` | Binary search (list must be sorted) | `Collections.binarySearch(list, 5)` |
| `max(Collection)` | Find maximum | `Collections.max(list)` |
| `min(Collection)` | Find minimum | `Collections.min(list)` |
| `frequency(Collection, obj)` | Count occurrences | `Collections.frequency(list, 5)` |
| **Filling** | | |
| `fill(List, obj)` | Fill with value | `Collections.fill(list, 0)` |
| `copy(dest, src)` | Copy list | `Collections.copy(dest, src)` |
| `replaceAll(List, old, new)` | Replace all occurrences | `Collections.replaceAll(list, 1, 10)` |
| `nCopies(n, obj)` | Create n copies | `Collections.nCopies(5, "A")` |
| **Checking** | | |
| `disjoint(c1, c2)` | Check no common elements | `Collections.disjoint(list1, list2)` |
| **Unmodifiable** | | |
| `unmodifiableList(List)` | Make read-only | `Collections.unmodifiableList(list)` |
| `unmodifiableSet(Set)` | Make read-only | `Collections.unmodifiableSet(set)` |
| `unmodifiableMap(Map)` | Make read-only | `Collections.unmodifiableMap(map)` |
| **Synchronized** | | |
| `synchronizedList(List)` | Make thread-safe | `Collections.synchronizedList(list)` |
| `synchronizedSet(Set)` | Make thread-safe | `Collections.synchronizedSet(set)` |
| `synchronizedMap(Map)` | Make thread-safe | `Collections.synchronizedMap(map)` |
| **Empty Collections** | | |
| `emptyList()` | Empty immutable list | `Collections.emptyList()` |
| `emptySet()` | Empty immutable set | `Collections.emptySet()` |
| `emptyMap()` | Empty immutable map | `Collections.emptyMap()` |
| **Singleton** | | |
| `singleton(obj)` | Single element set | `Collections.singleton("A")` |
| `singletonList(obj)` | Single element list | `Collections.singletonList("A")` |
| `singletonMap(k, v)` | Single entry map | `Collections.singletonMap("A", 1)` |
| **Comparators** | | |
| `reverseOrder()` | Reverse comparator | `Collections.reverseOrder()` |
| `reverseOrder(Comparator)` | Reverse given comparator | `Collections.reverseOrder(comp)` |

---

# 15. Arrays Utility Class

```java
import java.util.Arrays;
```

### All Methods:

| Method | Description | Example |
|--------|-------------|---------|
| **Sorting** | | |
| `sort(array)` | Sort array | `Arrays.sort(arr)` |
| `sort(array, from, to)` | Sort range | `Arrays.sort(arr, 0, 5)` |
| `sort(array, Comparator)` | Sort with comparator | `Arrays.sort(arr, Collections.reverseOrder())` |
| `parallelSort(array)` | Parallel sort | `Arrays.parallelSort(arr)` |
| **Searching** | | |
| `binarySearch(array, key)` | Binary search | `Arrays.binarySearch(arr, 5)` |
| **Comparing** | | |
| `equals(arr1, arr2)` | Check equal | `Arrays.equals(arr1, arr2)` |
| `deepEquals(arr1, arr2)` | Deep compare (for 2D) | `Arrays.deepEquals(arr1, arr2)` |
| `compare(arr1, arr2)` | Compare arrays | `Arrays.compare(arr1, arr2)` |
| `mismatch(arr1, arr2)` | Find first mismatch | `Arrays.mismatch(arr1, arr2)` |
| **Filling** | | |
| `fill(array, value)` | Fill with value | `Arrays.fill(arr, 0)` |
| `fill(array, from, to, value)` | Fill range | `Arrays.fill(arr, 0, 5, 0)` |
| `setAll(array, generator)` | Set all with function | `Arrays.setAll(arr, i -> i*2)` |
| **Copying** | | |
| `copyOf(array, length)` | Copy with new length | `Arrays.copyOf(arr, 10)` |
| `copyOfRange(array, from, to)` | Copy range | `Arrays.copyOfRange(arr, 0, 5)` |
| **Converting** | | |
| `asList(array)` | Array to List | `Arrays.asList(arr)` |
| `toString(array)` | Array to String | `Arrays.toString(arr)` |
| `deepToString(array)` | 2D array to String | `Arrays.deepToString(arr2d)` |
| `stream(array)` | Array to Stream | `Arrays.stream(arr)` |
| **Hash** | | |
| `hashCode(array)` | Get hash code | `Arrays.hashCode(arr)` |
| `deepHashCode(array)` | Deep hash (for 2D) | `Arrays.deepHashCode(arr2d)` |

---

# 16. Quick Comparison Table

| Collection | Order | Duplicates | Null | Thread Safe | Use Case |
|------------|-------|------------|------|-------------|----------|
| **ArrayList** | Insertion | Yes | Yes | No | Random access |
| **LinkedList** | Insertion | Yes | Yes | No | Insert/Delete |
| **Stack** | LIFO | Yes | Yes | Yes | Undo, DFS |
| **Queue** | FIFO | Yes | Yes | No | BFS, Task queue |
| **PriorityQueue** | Priority | Yes | No | No | Scheduling |
| **ArrayDeque** | Both ends | Yes | No | No | Stack + Queue |
| **HashSet** | No order | No | 1 null | No | Unique items |
| **LinkedHashSet** | Insertion | No | 1 null | No | Ordered unique |
| **TreeSet** | Sorted | No | No | No | Sorted unique |
| **HashMap** | No order | No (keys) | 1 null key | No | Key-Value |
| **LinkedHashMap** | Insertion | No (keys) | 1 null key | No | Ordered map |
| **TreeMap** | Sorted | No (keys) | No | No | Sorted map |
| **Hashtable** | No order | No (keys) | No | Yes | Legacy |

---

# 17. Time Complexity

| Operation | ArrayList | LinkedList | HashSet | TreeSet | HashMap | TreeMap |
|-----------|-----------|------------|---------|---------|---------|---------|
| Add | O(1)* | O(1) | O(1) | O(log n) | O(1) | O(log n) |
| Remove | O(n) | O(1)** | O(1) | O(log n) | O(1) | O(log n) |
| Get/Contains | O(1) | O(n) | O(1) | O(log n) | O(1) | O(log n) |
| Search | O(n) | O(n) | O(1) | O(log n) | O(1) | O(log n) |

*amortized  
**if you have reference to node

---

# 18. When to Use What?

```
Need List?
├── Random access needed? → ArrayList
├── Frequent insert/delete? → LinkedList
└── Thread safe? → Vector or Collections.synchronizedList()

Need Set?
├── No order needed? → HashSet
├── Insertion order? → LinkedHashSet
└── Sorted order? → TreeSet

Need Map?
├── No order needed? → HashMap
├── Insertion order? → LinkedHashMap
├── Sorted by key? → TreeMap
└── Thread safe? → ConcurrentHashMap

Need Queue?
├── Normal FIFO? → LinkedList or ArrayDeque
├── Priority based? → PriorityQueue
└── Double ended? → ArrayDeque

Need Stack?
└── Use ArrayDeque (faster than Stack class)
```

---

# 19. Common Interview Patterns

### Frequency Count
```java
HashMap<Character, Integer> freq = new HashMap<>();
for(char c : str.toCharArray()) {
    freq.put(c, freq.getOrDefault(c, 0) + 1);
}
```

### Two Sum
```java
HashMap<Integer, Integer> map = new HashMap<>();
for(int i = 0; i < nums.length; i++) {
    int complement = target - nums[i];
    if(map.containsKey(complement)) {
        return new int[]{map.get(complement), i};
    }
    map.put(nums[i], i);
}
```

### Remove Duplicates
```java
List<Integer> unique = new ArrayList<>(new HashSet<>(list));
```

### Find First Non-Repeating
```java
LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
for(char c : str.toCharArray()) {
    map.put(c, map.getOrDefault(c, 0) + 1);
}
for(Map.Entry<Character, Integer> entry : map.entrySet()) {
    if(entry.getValue() == 1) return entry.getKey();
}
```

### Top K Frequent
```java
PriorityQueue<Map.Entry<Integer, Integer>> pq = 
    new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
pq.addAll(freqMap.entrySet());
```

### LRU Cache
```java
LinkedHashMap<Integer, Integer> cache = 
    new LinkedHashMap<>(capacity, 0.75f, true) {
        protected boolean removeEldestEntry(Map.Entry eldest) {
            return size() > capacity;
        }
    };
```
