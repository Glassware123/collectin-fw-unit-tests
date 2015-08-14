package util.collection.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListTest {

    @Test
    public void isArrayListUnique() {

        List<Integer> integers = new ArrayList<Integer>();

        integers.add(5);
        integers.add(5);

        assertEquals(2, integers.size());

    }


    @Test
    public void couldArrayListClusteringProcesses() {
        List<Integer> firstIntegers = new ArrayList<Integer>();
        List<Integer> nextIntegers = new ArrayList<Integer>();

        firstIntegers.add(5);
        firstIntegers.add(7);
        firstIntegers.add(9);
        firstIntegers.add(20);
        firstIntegers.add(10);

        nextIntegers.add(9);
        nextIntegers.add(7);
        nextIntegers.add(9);
        nextIntegers.add(30);
        nextIntegers.add(10);

        nextIntegers.retainAll(firstIntegers);

        assertEquals(4,nextIntegers.size());

    }
}
