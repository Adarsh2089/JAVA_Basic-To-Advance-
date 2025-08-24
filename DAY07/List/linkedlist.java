package DAY07.List;

import java.util.LinkedList;
import java.util.List;

public class linkedlist {


    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
    }
}


/*          • LinkedList implements List and Deque.
            • Doubly linked list (not index-based).
            • Faster insertions and deletions (no shifting).
            • Slower random access (need traversal).
*/

/*   Methods of LinkedList ----
   1) .add(element) - adds element at end.
   2) .addFirst(element) - adds at beginning.
   3) .addLast(element) - adds at end.
   4) .remove() - removes first element.
   5) .removeFirst() - removes first element.
   6) .removeLast() - removes last element.
   7) .get(index) - returns element at given index.
   8) .getFirst() - returns first element.
   9) .getLast() - returns last element.
  10) .size() - returns number of elements.
  11) .isEmpty() - checks if list is empty.
  12) .contains(element) - checks if element exists.
*/

