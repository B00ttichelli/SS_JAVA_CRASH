package CodewarsTasks.Loops;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class beginner_lost_without_a_map {

    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2, 4, 6}, map(new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {8, 2, 2, 2, 8}, map(new int[] {4, 1, 1, 1, 4}));
        assertArrayEquals(new int[] {2, 2, 2, 2, 2, 2}, map(new int[] {1, 1, 1, 1, 1, 1}));
    }


    public static int[] map(int[] arr) {


            return Arrays.stream(arr).map(a->a*2).toArray();
    }
}
