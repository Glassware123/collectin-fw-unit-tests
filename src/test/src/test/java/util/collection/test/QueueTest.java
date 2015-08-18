package util.collection.test;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.*;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void baseQueueTest() {
        Queue<Integer> queue = new PriorityQueue<Integer>();

        queue.add(10);
        queue.add(8);
        queue.add(12);
        queue.add(5);

        queue.remove();

        assertEquals(8, (int) queue.element());
    }

    @Test
    public void peekQueueTest() {
        Queue<Integer> queue = new PriorityQueue<Integer>();

        queue.add(10);
        queue.add(8);
        queue.add(12);
        queue.add(90);

        assertEquals(8, (int) queue.peek());
        assertEquals(8, (int) queue.element());

    }

    @Test
    public void pollQueueTest() {
        Queue<Integer> queue = new PriorityQueue<Integer>();

        queue.add(10);
        queue.add(8);
        queue.add(12);
        queue.add(90);

        assertEquals(8, (int) queue.poll());
        assertEquals(10, (int) queue.element());
    }

    @Test
    public void offerQueueTest() {
        Queue<Integer> queue = new PriorityQueue<Integer>();

        queue.add(10);
        queue.add(8);
        queue.add(12);
        queue.add(90);

        assertEquals(true, queue.offer(5));
        assertEquals(5, (int) queue.peek());

    }

    @Test
    public void linkedListOfferTest() {
        Deque<Integer> queue = new LinkedList<Integer>();

        queue.add(10);
        queue.add(8);
        queue.add(12);
        queue.add(90);

        assertEquals(10, (int) queue.peek());
        assertTrue(queue.offerFirst(5));
        assertTrue(queue.offerLast(20));
        assertEquals(5, (int) queue.peek());
        assertEquals(20, (int) queue.peekLast());

    }

    @Test
    public void linkedListClearTest() {
        Deque<Integer> queue = new LinkedList<Integer>();

        queue.add(10);
        queue.add(8);
        queue.add(12);
        queue.add(90);

        queue.clear();

        assertEquals(0, queue.size());
    }

    @Test
    public void linkedBlockingQueueBaseTest() throws InterruptedException {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();

        queue.add(10);
        queue.add(8);
        queue.add(12);
        queue.add(90);

        assertEquals(10, (int) queue.take());
        assertEquals(3, queue.size());
        assertEquals(8, (int) queue.peek());
    }

    @Test
    public void linkedBlockingQueuePutTest() throws InterruptedException {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();

        queue.add(10);
        queue.add(8);
        queue.add(12);
        queue.add(90);

        assertEquals(4, queue.size());
        queue.put(5);
        assertEquals(5, queue.size());

    }

    @Test
    public void linkedBlockingQueuePollTimeoutTest() throws InterruptedException {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();

        queue.add(10);
        queue.add(8);
        queue.add(12);
        queue.add(90);

        assertEquals(4, queue.size());
        assertEquals(10, (int) queue.poll(50, TimeUnit.SECONDS));
        assertEquals(3, queue.size());
        assertEquals(8, (int) queue.peek());

    }

    @Test
    public void linkedBlockingQueueRemainingCapacityTest() {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();

        assertEquals(2147483647, queue.remainingCapacity());
        queue.add(10);
        queue.add(8);
        queue.add(12);
        queue.add(90);

        assertEquals(2147483643, queue.remainingCapacity());
        queue.add(50);
        assertEquals(2147483642, queue.remainingCapacity());
    }

    @Test
    public void arrayBlockingQueueAddElementTest() {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

        assertEquals(10, queue.remainingCapacity());
        while (queue.remainingCapacity() > 0) {
            queue.add(10);
        }
        assertEquals(10, queue.size());

    }

    @Test(expected = IllegalStateException.class)
    public void shouldThrowIllegalStateExceptionWhenAddElementFullQueue() {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

        assertEquals(10, queue.remainingCapacity());
        while (queue.remainingCapacity() > 0) {
            queue.add(10);
        }
        queue.add(120);
    }

    @Test
    public void priorityBlockingQueueContainsTest() {
        BlockingQueue<Integer> queue = new PriorityBlockingQueue<Integer>();
        queue.add(10);
        queue.add(50);
        queue.add(12);
        queue.add(90);
        assertTrue(queue.contains(50));
    }

    @Test
    public void priorityBlockingQueueContainsAllTest() {
        BlockingQueue<Integer> queue = new PriorityBlockingQueue<Integer>();
        List<Integer> queueList = new ArrayList<Integer>();

        queue.add(10);
        queue.add(50);
        queue.add(12);
        queue.add(90);

        queueList.add(12);
        queueList.add(10);
        queueList.add(50);
        queueList.add(90);


        assertTrue(queue.containsAll(queueList));
    }

}