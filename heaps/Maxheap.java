package heaps;

public class Maxheap {
    private int[] heap;
    private int size;
    private static final int MAX_SIZE = 256;

    public Maxheap() {
        this.heap = new int[MAX_SIZE];
        this.size = 0;
    }

    // Helper method to get the parent index
    private int parent(int index) { return (index - 1) / 2; }

    // Helper method to get the left child index
    private int leftChild(int index) { return 2 * index + 1; }

    // Helper method to get the right child index
    private int rightChild(int index) { return 2 * index + 2; }

    // Insert a new value into the heap
    public void insert(int value) {
        if (size >= MAX_SIZE) {
            System.out.println("heaps.Heap is full!");
            return;
        }
        // Add the new value at the end of the heap
        heap[size] = value;
        int current = size;
        size++;

        // Bubble up to maintain the max-heap property
        while (current > 0 && heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Remove and return the maximum element (root) of the heap
    public int extractMax() {
        if (size == 0) {
            throw new IllegalStateException("heaps.Heap is empty!");
        }
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;

        // Bubble down to maintain the max-heap property
        heapify(0);
        return max;
    }

    // Maintain the heap structure by bubbling down
    private void heapify(int index) {
        int largest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }
        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }
        if (largest != index) {
            swap(index, largest);
            heapify(largest);
        }
    }

    // Swap two elements in the heap array
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Print the heap
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Maxheap maxHeap = new Maxheap();

        // Insert 256 random values (for demonstration)
        for (int i = 1; i <= 256; i++) {
            maxHeap.insert(i);  // Use i as the value for simplicity
        }

        // Print the heap
        maxHeap.printHeap();

        // Extract max and print the heap
        System.out.println("Extracted max: " + maxHeap.extractMax());
        maxHeap.printHeap();
    }
}

