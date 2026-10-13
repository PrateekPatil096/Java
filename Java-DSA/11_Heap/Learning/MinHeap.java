import java.util.*;

public class MinHeap {
    
    private int[] heap;
    private int size;
    private int capacity;
    
    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }
    
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);
        
        minHeap.insert(3);
        minHeap.insert(2);
        minHeap.insert(15);
        minHeap.insert(5);
        minHeap.insert(4);
        minHeap.insert(45);
        
        System.out.println("Min element: " + minHeap.peek());
        System.out.println("Extracted min: " + minHeap.extractMin());
        System.out.println("Min element after extraction: " + minHeap.peek());
    }
    
    private int parent(int i) { return (i - 1) / 2; }
    private int leftChild(int i) { return 2 * i + 1; }
    private int rightChild(int i) { return 2 * i + 2; }
    
    public void insert(int val) {
        if (size == capacity) {
            System.out.println("Heap is full!");
            return;
        }
        
        heap[size] = val;
        int current = size;
        size++;
        
        while (current > 0 && heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }
    
    public int extractMin() {
        if (size == 0) return Integer.MIN_VALUE;
        
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);
        
        return min;
    }
    
    public int peek() {
        return size > 0 ? heap[0] : Integer.MIN_VALUE;
    }
    
    private void heapify(int i) {
        int smallest = i;
        int left = leftChild(i);
        int right = rightChild(i);
        
        if (left < size && heap[left] < heap[smallest]) smallest = left;
        if (right < size && heap[right] < heap[smallest]) smallest = right;
        
        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }
    
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
