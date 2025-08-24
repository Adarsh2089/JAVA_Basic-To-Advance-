package DAY07.Map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class treemap {

    public static void main(String[] args) {
        TreeMap<Integer,String> tmap = new TreeMap<>();
        NavigableMap<String,Integer> nmap = new TreeMap<>();
    }
}
/*          • Stores Key-Value pairs in sorted order of keys.
            • Backed by Red-Black Tree.
            • O(log n) operations.
*/

/*   Methods of TreeMap ----
   1) .put(key,value) - adds or updates mapping.
   2) .get(key) - returns value for key.
   3) .firstKey() - returns smallest key.
   4) .lastKey() - returns largest key.
   5) .higherKey(key) - least key > given.
   6) .lowerKey(key) - greatest key < given.
   7) .ceilingKey(key) - least key ≥ given.
   8) .floorKey(key) - greatest key ≤ given.
   9) .containsKey(key) - checks key.
  10) .entrySet() - returns key-value pairs.
  11) .keySet() - returns all keys.
  12) .values() - returns all values.
*/
