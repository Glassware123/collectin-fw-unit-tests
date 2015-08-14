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


}
