package multithreading.singletonThreadSafe;

public class ThreadSafeSingleton {

    // Volatile: changes are visible across threads
    // it ensures correct behavior under JVM instruction reordering
    private static volatile ThreadSafeSingleton instance = null;

    // Private constructor: no instantiation
    private ThreadSafeSingleton() {}

    // Public method to provide access to the instance
    public static ThreadSafeSingleton getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (ThreadSafeSingleton.class) { // synchronized: thread safety
                if (instance == null) { // Second check (with locking)
                    instance = new ThreadSafeSingleton(); // lazy loading
                }
            }
        }
        return instance;
    }

    // example method
    public void doSomething() {
        System.out.println("ThreadSafeSingleton...");
    }

    public static void main(String[] args) {
        ThreadSafeSingleton s1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton s2 = ThreadSafeSingleton.getInstance();

        System.out.println(s1 == s2); // prints true, it's singleton!
        s1.doSomething();
    }
}

/* Alternatives:
* 1. Holder Pattern:
* private static class Holder { // this class holds the Singleton — but it’s not created until needed!
        private static final Singleton INSTANCE = new Singleton();
    }
* 2. Enum Singleton - Java's enum makes sures only 1 exists
* public enum Singleton {
    INSTANCE;
    // ...
}
* */