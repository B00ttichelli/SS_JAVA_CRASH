package CodewarsTasks.Loops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class beginner_reduce_but_grow {

    public static int grow(int[] x) {


        int result = 1;
        for (int i = 0; i < x.length; i++) {
            result *= x[i];
        }
        return result;

    }

    @Test
    public void testSomething() {
        assertEquals(6, grow(new int[]{1, 2, 3}));
        assertEquals(16, grow(new int[]{4, 1, 1, 1, 4}));
        assertEquals(64, grow(new int[]{2, 2, 2, 2, 2, 2}));
    }
}
