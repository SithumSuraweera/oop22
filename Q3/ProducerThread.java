package Q3;

import java.util.List;

class ProducerThread implements Runnable {
    private final List<Integer> queue;
    private static final int MAX_SIZE = 1;
    private int value = 10;

    public ProducerThread(List<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.size() == MAX_SIZE) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Producer adding value = " + value + " to Queue");
                queue.add(value);
                value += 10;
                queue.notifyAll();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}