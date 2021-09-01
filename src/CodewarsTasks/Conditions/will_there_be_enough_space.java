package CodewarsTasks.Conditions;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class will_there_be_enough_space {

    @Test
    public void testBob() {
        assertEquals("Should return 0.", 0, enough(10, 5, 5));
        assertEquals("Should return 10.", 10, enough(100, 60, 50));
        assertEquals("Should return 0.", 0, enough(20, 5, 5));
    }



    public static int enough(int cap, int on, int wait){
        // your code here

        return cap>=on+wait?0:on-wait;
    }
}
