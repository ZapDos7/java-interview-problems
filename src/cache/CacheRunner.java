package cache;

public class CacheRunner {
    public static void main(String[] args) {
        // SimpleCache
        System.out.println("Simple Cache::");
        SimpleCache<Integer, String> scache = new SimpleCache<>();
        scache.put(1, "A");
        scache.put(2, "B");
        scache.put(3, "C");
        System.out.println(scache); // {1=A, 2=B, 3=C}

        scache.get(2); // Access 2 to make it recently used - nothing changes
        scache.put(4, "D"); // Add another entry - nothing is removed
        System.out.println(scache); // {1=A, 2=B, 3=C, 4=D}

        // LRU
        System.out.println("LRU Cache::");
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        System.out.println(cache); // {1=A, 2=B, 3=C}

        cache.get(1); // Access 1 to make it recently used
        cache.put(4, "D"); // 2 should be removed (least recently used)
        System.out.println(cache); // {3=C, 1=A, 4=D}
    }
}
