package util.collection.test;

import org.junit.Test;

import java.util.HashMap;
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
        map.put("secondKey",10);
        map.remove("firstKey");
        assertNotNull(map);
    }

}
