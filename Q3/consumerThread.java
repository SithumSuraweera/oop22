package Q3;

import java.util.List;

class ConsumerThread implements Runnable {
    private final List<Integer> queue;

    public ConsumerThread(List<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.isEmpty()) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                int value = queue.remove(0);
                System.out.println("Consumer thread consumes " + value);
                queue.notify();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}