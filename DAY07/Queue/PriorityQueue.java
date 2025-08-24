package DAY07.Queue;

import java.util.Collections;

public class PriorityQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();   // Min-Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // Max-Heap

    }
}


/*          • Implements Min-Heap (smallest at head).
            • Used in Dijkstra, Huffman coding, scheduling.
            • Orders elements by natural order or comparator.
*/

/*   Methods of PriorityQueue ----
   1) .offer(element) - inserts element.
   2) .add(element) - inserts element (exception if fails).
   3) .poll() - removes and returns smallest element.
   4) .remove() - removes head, exception if empty.
   5) .peek() - returns smallest element.
   6) .element() - returns head, exception if empty.
   7) .size() - returns number of elements.
   8) .isEmpty() - checks if queue is empty.
*/

