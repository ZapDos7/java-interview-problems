package multithreading.deadlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

// How can we avoid a deadlock scenario?
// One solution is using ReentrantLock and tryLock() with a timeout.
// tryLock(timeout) attempts to acquire the lock within a given time.
// If it can't, it can give up and avoid being stuck forever → no deadlock.
public class DeadlockAvoidance {
    private static final ReentrantLock lock1 = new ReentrantLock();
    private static final ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> attemptLocking("Thread 1", lock1, lock2));
        Thread thread2 = new Thread(() -> attemptLocking("Thread 2", lock2, lock1));

        thread1.start();
        thread2.start();
    }

    private static void attemptLocking(String threadName, ReentrantLock firstLock, ReentrantLock secondLock) {
        try {
            if (firstLock.tryLock(1, TimeUnit.SECONDS)) { // tryLock for 1 second
                System.out.println(threadName + ": Acquired first lock.");

                Thread.sleep(100); // Simulate some work

                if (secondLock.tryLock(1, TimeUnit.SECONDS)) {
                    try {
                        System.out.println(threadName + ": Acquired second lock. Doing work...");
                    } finally {
                        secondLock.unlock();
                        System.out.println(threadName + ": Released second lock.");
                    }
                } else { // give up
                    System.out.println(threadName + ": Could not acquire second lock. Avoiding deadlock.");
                }

                firstLock.unlock();
                System.out.println(threadName + ": Released first lock.");
            } else {
                System.out.println(threadName + ": Could not acquire first lock. Skipping work.");
            }
        } catch (InterruptedException e) {
            System.err.print(e.getMessage());
        }
    }
}
