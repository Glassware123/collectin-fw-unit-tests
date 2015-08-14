package util.collection.test;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class SetTest {


    @Test
    public void setTest(){

        Set<Integer> integers = new HashSet<Integer>();
        integers.add(5);
        integers.add(5);

        assertEquals(1, integers.size());
    }

    @Test
    public void canHashSetClusteringProcesses(){
        Set<Integer> firstIntegers = new HashSet<Integer>();
        Set<Integer> nextIntegers = new HashSet<Integer>();

        firstIntegers.add(5);
        firstIntegers.add(8);
        firstIntegers.add(12);
        firstIntegers.add(20);

        nextIntegers.add(9);
        nextIntegers.add(8);
        nextIntegers.add(15);
        nextIntegers.add(20);

        nextIntegers.retainAll(firstIntegers);

        assertEquals(2,nextIntegers.size());

    }
    @Test
    public void isTreeSetImplSorted() {
        Set<Integer> integers = new TreeSet<Integer>();
        integers.add(5);
        integers.add(4);
        integers.add(19);
        integers.add(10);

        assertEquals(4, integers.toArray()[0]);
        assertEquals(19, integers.toArray()[3]);
    }

    @Test
    public void isLinkedHashSetImplSorted() {
        Set<Integer> integers = new LinkedHashSet<Integer>();
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(7);
        integers.add(9);
        integers.add(3);

        assertEquals(3, integers.toArray()[4]);
        assertEquals(7, integers.toArray()[2]);
        assertEquals(5, integers.toArray()[0]);

    }

}
