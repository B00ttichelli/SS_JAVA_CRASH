package CodewarsTasks.Strings;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class sort_and_star {



    @Test
    public void testFixed() {
        assertEquals("b***i***t***c***o***i***n", SortAndStar.twoSort(new String[]{"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        assertEquals("a***r***e", SortAndStar.twoSort(new String[]{"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
    }

    static class SortAndStar {

        public static String twoSort(String[] s) {

            List<String> arr  = Arrays.asList(s);
            Collections.sort(arr);
            String result = arr.get(0).replaceAll("(.{1})", "$1***");
            return result.substring(0,result.length()-3);
        }
    }


}
