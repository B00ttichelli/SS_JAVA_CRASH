package CodewarsTasks.Collections;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class nteractive_dictionary {

    @Test
    public void Tests()
    {
        Dictionary d = new Dictionary();

        d.newEntry("Apple", "A fruit");
        assertEquals("A fruit", d.look("Apple"));

        d.newEntry("Soccer", "A sport");
        assertEquals("A sport", d.look("Soccer"));

        assertEquals("Cant find entry for Hi", d.look("Hi"));
        assertEquals("Cant find entry for Ball", d.look("Ball"));

        d.newEntry("soccer", "a sport");
        assertEquals("a sport", d.look("soccer"));
    }


     class Dictionary {
        private Map<String,String> dict = new HashMap<>();

        public Dictionary(){
            // your code
        }

        public void newEntry(String key, String value){
            // your code

            dict.put(key,value);


        }

        public String look(String key){
            // your code
            return dict.get(key)==null?"Cant find entry for "+key:dict.get(key);
        }
    }
}
