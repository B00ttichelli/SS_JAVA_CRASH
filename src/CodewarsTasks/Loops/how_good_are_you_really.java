package CodewarsTasks.Loops;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class how_good_are_you_really {




    @Test
    public void tests() {
        assertEquals(true, betterThanAverage(new int[] {2, 3}, 5));
        assertEquals(true, betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
        assertEquals(true, betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        assertEquals(false, betterThanAverage(new int[] {100, 90}, 11));
    }


    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Your code here


        return yourPoints>Arrays.stream(classPoints).average().getAsDouble();
    }

}
