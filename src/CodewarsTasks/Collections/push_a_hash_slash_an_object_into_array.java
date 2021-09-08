package CodewarsTasks.Collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class push_a_hash_slash_an_object_into_array {


    @Test
    public void testSomething() {
        List<String> items = PushAnObjectIntoArray.push();
        assertEquals(1,items.size());
        assertEquals("an object", items.get(0));
    }

     static class PushAnObjectIntoArray {
        public static List<String> push(){
            List<String> items = new ArrayList<>();
            items.add ("an object");
            return items;
        }
    }

}
