package com.debug.multithread;
 
import java.util.concurrent.ArrayBlockingQueue;
 
//only one thread can access either produce or consume methods as both are synchronized
public class ProducerConsumer {
 
    private int count = 0;
    private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(3);
 
    public synchronized void produce() {
        while (true) {
            try {
                wait(100);
            } catch (InterruptedException ie) {}
 
            if (queue.isEmpty()) {
                count++;
                try {
                    Thread.sleep(4000); // takes 4 secs to produce
                } catch (InterruptedException e) {}
                queue.add(count);
                System.out.println(Thread.currentThread().getName() + " produced: " + count);
                notifyAll();
            }
        }//end while
    }
 
    public synchronized void consume() {
        while (true) {
            try {
                wait(100);
            } catch (InterruptedException ie) {}
 
            if (!queue.isEmpty()) {
                Integer consumed = queue.remove(); // consumed
                System.out.println(Thread.currentThread().getName() + " consumed: " + consumed);
                notifyAll();
            }
        }//end while
    }
} 