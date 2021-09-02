package CodewarsTasks.Loops;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class sum_of_positive {


    @Test
    public void testSomething() {
        assertEquals(15, sum(new int[]{1,2,3,4,5}));
        assertEquals(13, sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, sum(new int[]{}));
        assertEquals(0, sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, sum(new int[]{-1,2,3,4,-5}));
    }


    public static int sum(int[] arr){

        return Arrays.stream(arr).filter(a->a>0).sum();
    }
}
