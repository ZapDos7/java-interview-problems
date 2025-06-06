package producerConsumer;

public class Producer extends Thread {
    private final SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int i = 0;
        try {
            while (true) {
                buffer.produce(i++);
                Thread.sleep(500); // Simulate time to produce
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}