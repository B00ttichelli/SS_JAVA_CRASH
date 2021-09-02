package CodewarsTasks.Loops;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class my_head_is_at_the_wrong_end {


    public static String[] fixTheMeerkat(String[] arr) {
        List<String> strings = Arrays.asList(arr);
        Collections.reverse(strings);
        String[] result = new String[arr.length];
        strings.toArray(result);
        return result;
    }

    @Test
    public void exampleTest1() {
        assertArrayEquals(new String[]{ "head", "body", "tail" },
                fixTheMeerkat(new String[]{ "tail", "body", "head" }));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new String[]{ "heads", "body", "tails" },
              fixTheMeerkat(new String[]{ "tails", "body", "heads" }));
    }


    @Test
    public void exampleTest3() {
        assertArrayEquals(new String[]{ "top", "middle", "bottom" },
               fixTheMeerkat(new String[]{ "bottom", "middle", "top" }));
    }

    @Test
    public void exampleTest4() {
        assertArrayEquals(new String[]{ "upper legs", "torso", "lower legs" },
                fixTheMeerkat(new String[]{ "lower legs", "torso", "upper legs" }));
    }

    @Test
    public void exampleTest5() {
        assertArrayEquals(new String[]{ "sky", "rainbow", "ground" },
                fixTheMeerkat(new String[]{ "ground", "rainbow", "sky" }));
    }
}
