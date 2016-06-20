package LRUcache;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/lru-cache/
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and set.
 * <p>
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 * set(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.
 * <p>
 * Created by Michael on 6/19/2016.
 */

/**
 * Use a custom LinkedHashMap class that orders by access order instead of insertion order.
 * Remove the oldest entry by overriding existing method and remove when capacity is surpassed.
 */
public class LRUCache {
    /**
     * Custom LinkedHashMap class. 2 modifications:
     * 1. Record the capacity.
     * 2. Override removeEldestEntry and use the recorded capacity as a limit.
     */
    public class AccessLinkedHashMap<K, V> extends LinkedHashMap {
        private int capacity;

        public AccessLinkedHashMap(int initialCapacity,
                                   float loadFactor,
                                   boolean accessOrder) {
            super(initialCapacity, loadFactor, accessOrder);
            this.capacity = initialCapacity;
        }

        protected boolean removeEldestEntry(Map.Entry eldest) {
            return size() > capacity;
        }
    }

    AccessLinkedHashMap<Integer, Integer> LRUCache;

    public LRUCache(int capacity) {
        LRUCache = new AccessLinkedHashMap<>(capacity, .75f, true);
    }

    /**
     * Run a get on the hashmap, and return -1 if null, otherwise the answer.
     * @param key Integer value of the key that we are accessing in the cache.
     * @return Integer -1 if key doesn't exist in cache, otherwise the recorded value of the given key.
     */
    public int get(int key) {
        Integer answer = (Integer) LRUCache.get(key);
        return (answer != null) ? answer : -1;
    }

    /**
     * Run a put. This implies a call to removeEldestEntry if capacity is surpassed. This deletes the
     * Least Recently Accessed (or Used) item. This is kept track in the internal LinkedHashMap that moves
     * any node that is modified to go to the back of the queue to evict.
     * @param key
     * @param value
     */
    public void set(int key, int value) {
        LRUCache.put(key, value);
    }

}
