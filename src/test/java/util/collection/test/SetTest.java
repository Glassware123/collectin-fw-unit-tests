package util.collection.test;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SetTest {


    @Test
    public void setTest(){

        Set<Integer> integerSet = new HashSet<Integer>();
        integerSet.add(5);
        integerSet.add(5);

        assertEquals(1,integerSet.size());
    }

    @Test
    public void canHashSetClusteringProcesses(){
        Set<Integer> firstIntegers = new HashSet<Integer>();
        Set<Integer> nextIntegers = new HashSet<Integer>();
        Set<Integer> diffOfIntegers = new HashSet<Integer>();

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
        Set<Integer> integerSet = new TreeSet<Integer>();
        integerSet.add(5);
        integerSet.add(4);
        integerSet.add(19);
        integerSet.add(10);

        assertEquals(4, integerSet.toArray()[0]);
        assertEquals(19, integerSet.toArray()[3]);
    }


}
