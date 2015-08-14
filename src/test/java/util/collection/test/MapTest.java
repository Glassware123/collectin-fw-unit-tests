package util.collection.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class MapTest {

    @Test
    public void baseMapTest() {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("firstKey", 10);
        map.put("nextKey", 200);

        assertEquals(10, (int) map.get("firstKey"));

        assertEquals(200,(int) map.get("nextKey"));

    }

    @Test
    public void emptyMap(){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put(null,null);

        assertFalse(map.isEmpty());
    }

    @Test
    public void removeMap(){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("firstKey",10);
        map.put("secondKey",100);
        map.remove("firstKey");
        assertNotNull(map);
    }

    @Test
    public void shouldGiveMapSize(){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("firstKey",10);
        map.put("secondKey",109);
        assertEquals(2,map.size());
    }

    @Test
    public void shouldReturnKeySet(){
        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
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

        map.put("firstKey",firstIntegers);
        map.put("secondKey",nextIntegers);

        assertEquals(2,map.keySet().size());
    }

    @Test
    public void shouldReturnKeysSize(){
        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
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
        nextIntegers.add(15);

        map.put("firstKey",firstIntegers);
        map.put("secondKey",nextIntegers);

        assertEquals(5,map.get("firstKey").size());
        assertEquals(6,map.get("secondKey").size());
    }
}
