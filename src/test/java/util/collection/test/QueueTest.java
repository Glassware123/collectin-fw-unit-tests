package util.collection.test;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void baseQueueTest()
    {
        Queue<Integer> queue = new PriorityQueue<Integer>();

        queue.add(10);
        queue.add(8);
        queue.add(12);
        queue.add(5);

        queue.remove();

        assertEquals(8,(int)queue.element());
    }

    @Test
    public void peekQueueTest(){
        Queue<Integer> queue = new PriorityQueue<Integer>();

        queue.add(10);
        queue.add(8);
        queue.add(12);
        queue.add(90);

        assertEquals(8,(int)queue.peek());
        assertEquals(8,(int)queue.element());

    }

    @Test
    public void pollQueueTest(){
        Queue<Integer> queue = new PriorityQueue<Integer>();

        queue.add(10);
        queue.add(8);
        queue.add(12);
        queue.add(90);

        assertEquals(8,(int)queue.poll());
        assertEquals(10,(int)queue.element());
    }

    @Test
    public void offerQueueTest(){
        Queue<Integer> queue = new PriorityQueue<Integer>();

        queue.add(10);
        queue.add(8);
        queue.add(12);
        queue.add(90);

        assertEquals(true,queue.offer(5));
        assertEquals(5,(int)queue.peek());

    }

    @Test
    public void linkedListOfferTest(){
        Deque<Integer> queue = new LinkedList<Integer>();

        queue.add(10);
        queue.add(8);
        queue.add(12);
        queue.add(90);

        assertEquals(10,(int)queue.peek());
        assertTrue(queue.offerFirst(5));
        assertTrue(queue.offerLast(20));
        assertEquals(5,(int)queue.peek());
        assertEquals(20,(int)queue.peekLast());

    }

    @Test
    public void linkedListClearTest(){
        Deque<Integer> queue = new LinkedList<Integer>();

        queue.add(10);
        queue.add(8);
        queue.add(12);
        queue.add(90);

        queue.clear();

        assertEquals(0,queue.size());
    }


}