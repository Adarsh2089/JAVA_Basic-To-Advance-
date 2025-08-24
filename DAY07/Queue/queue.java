package DAY07.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
    }
}

/*          • Queue is FIFO (First In First Out).
            • Used in BFS, scheduling.
            • Implemented by LinkedList, PriorityQueue.
*/

/*   Methods of Queue ----
   1) .offer(element) - inserts element (returns true/false).
   2) .add(element) - inserts element (throws exception if full).
   3) .poll() - removes and returns head, null if empty.
   4) .remove() - removes and returns head, exception if empty.
   5) .peek() - returns head, null if empty.
   6) .element() - returns head, exception if empty.
   7) .isEmpty() - checks if queue is empty.
   8) .size() - returns size.
*/

