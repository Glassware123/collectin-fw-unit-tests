package util.collection.test;

import org.junit.Test;

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
}
