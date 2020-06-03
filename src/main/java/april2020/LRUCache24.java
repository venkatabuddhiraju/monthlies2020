package april2020;

import java.util.*;

/**
 *   LRU Cache
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.
 *
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 * put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.
 *
 * The cache is initialized with a positive capacity.
 *
 * Follow up:
 * Could you do both operations in O(1) time complexity?
 *
 * Example:
 *
 *
        LRUCache cache = new LRUCache( 2  capacity  );
        *
        *cache.put(1,1);
        *cache.put(2,2);
        *cache.get(1);       // returns 1
        *cache.put(3,3);    // evicts key 2
        *cache.get(2);       // returns -1 (not found)
        *cache.put(4,4);    // evicts key 1
        *cache.get(1);       // returns -1 (not found)
        *cache.get(3);       // returns 3
        *cache.get(4);       // returns 4
 *
 *
 * eg : 2
 * ["LRUCache","get","put","get","put","put","get","get"]
 * [[2],  [2],[2,6],  [1],[1,5],[1,2], [1],[2]]
 * [null,-1,    null, -1,  null, null,  2,  6]

 **/
public class LRUCache24 {
    public static void main(String []adsdsds){
        LRUCache24 cache = new LRUCache24( 2 /* capacity */ );

//        cache.put(1, 1);
//        cache.put(2, 2);
//        cache.get(1);       // returns 1
//        cache.put(3, 3);    // evicts key 2
//        cache.get(2);       // returns -1 (not found)
//        cache.put(4, 4);    // evicts key 1
//        cache.get(1);       // returns -1 (not found)
//        cache.get(3);       // returns 3
//        cache.get(4);       // returns 4
        cache.get(2);
        cache.put(2,6);
        cache.get(1);
        cache.put(1,5);
        cache.put(1,2);
        cache.get(1);
        cache.get(2);

    }

    private Map<Integer, Integer> cacheMap;
    private Deque<Integer> priority;
    private int capacity = 0;

    public LRUCache24(int capacity) {
        cacheMap = new HashMap<>(capacity);
        priority = new LinkedList<Integer>();
        this.capacity = capacity;
    }

    public int get(int key) {
        if(!cacheMap.containsKey(key)){
            System.out.println(-1);
            return -1;
        }
        priority.remove(key);
        priority.addLast(key);
        System.out.println("get " + cacheMap.get(key));
        return cacheMap.get(key);
    }

    public void put(int key, int value) {
        System.out.println("put " + value);
        if(cacheMap.containsKey(key)){
            priority.remove(key);
            priority.addLast(key);
            cacheMap.put(key, value);
        }
        else if(cacheMap.size() == capacity){
            int remove = priority.getFirst();
            priority.removeFirst();
            priority.addLast(key);
            cacheMap.remove(remove);
            cacheMap.put(key, value);
        }
        else{
            priority.addLast(key);
            cacheMap.put(key, value);
        }
    }

}
