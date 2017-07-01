package LRUcache;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Michael on 6/19/2016.
 */
public class LRUCacheTest {

    @Test
    public void set1() throws Exception {
        LRUCache cache = new LRUCache(3);
        cache.set(1, 50);
        assertEquals(50, cache.get(1));

    }

    @Test
    public void set1capacity1() throws Exception {
        LRUCache cache = new LRUCache(1);
        cache.set(1, 50);
        assertEquals(50, cache.get(1));
    }

    @Test
    public void set3capacity2() throws Exception {
        LRUCache cache = new LRUCache(2);
        cache.set(1, 50);
        cache.set(2, 75);
        cache.set(3, 100);
        assertEquals(-1, cache.get(1));
    }

    @Test
    public void set3capacity2getToAccess() throws Exception {
        LRUCache cache = new LRUCache(2);
        cache.set(1, 50);
        cache.set(2, 75);
        cache.get(1);
        cache.set(3, 100);
        assertEquals(-1, cache.get(2));
    }

    @Test
    public void set3capacity2setToAccess() throws Exception {
        LRUCache cache = new LRUCache(2);
        cache.set(1, 50);
        cache.set(2, 75);
        cache.set(1, 100);
        cache.set(3, 100);
        assertEquals(-1, cache.get(2));
    }


}