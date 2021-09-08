package CodewarsTasks.Collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class unfinished_loop_bug_fixing {
    Kata k = new Kata();

    @Test
    public void SampleTests() {
        assertEquals(Arrays.asList(1), k.CreateList(1));
        assertEquals(Arrays.asList(1,2), k.CreateList(2));
        assertEquals(Arrays.asList(1,2,3), k.CreateList(3));
        assertEquals(Arrays.asList(1,2,3,4), k.CreateList(4));
        assertEquals(Arrays.asList(1,2,3,4,5), k.CreateList(5));
    }

      class Kata {
        public  List CreateList(int number)
        {
            List list = new ArrayList();

            for(int count = 1; count <= number; count++)
            {
                list.add(count);
            }

            return list;
        }
    }


}
