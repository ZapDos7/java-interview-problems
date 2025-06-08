package multithreading.deadlock;

public class DeadlockThread {

    private static final Object Lock1 = new Object();
    private static final Object Lock2 = new Object();

    /**
     * <a href="https://www.baeldung.com/java-synchronized">Synchronized in Java</a>
     * */
    public static void main(String[] args) {
        // we create 2 threads that try to lock in opposite order
        Thread thread1 = new Thread(() -> {
            synchronized (Lock1) {
                System.out.println("Thread 1: Holding Lock1...");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }

                System.out.println("Thread 1: Waiting for Lock2...");
                synchronized (Lock2) {
                    System.out.println("Thread 1: Acquired Lock2!");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (Lock2) {
                System.out.println("Thread 2: Holding Lock2...");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }

                System.out.println("Thread 2: Waiting for Lock1...");
                synchronized (Lock1) {
                    System.out.println("Thread 2: Acquired Lock1!");
                }
            }
        });

        thread1.start();
        thread2.start();
    }

    /*
     * A deadlock happens when the following conditions are true:
     * 1. Mutual exclusion – at least one resource must be held in a non-shareable mode.
     * 2. Hold and wait – a thread is holding at least one resource and waiting to acquire additional resources.
     * 3. No preemption – resources cannot be forcibly taken from threads.
     * 4. Circular wait – a set of threads are each waiting for each other to release a resource.
     * */
}
