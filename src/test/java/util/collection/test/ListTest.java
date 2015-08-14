package util.collection.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListTest {

    @Test
    public void listTest() {

        List<Integer> integerList = new ArrayList<Integer>();

        integerList.add(5);
        integerList.add(5);

        assertEquals(2, integerList.size());

    }
}
