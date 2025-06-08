package multithreading.producerConsumer;

public class Consumer extends Thread {
    private final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(1000); // Simulate time to consume
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
