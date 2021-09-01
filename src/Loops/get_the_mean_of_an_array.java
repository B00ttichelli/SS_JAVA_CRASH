package Loops;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class get_the_mean_of_an_array {

    @Test
    public void simpleTest() {
        assertEquals(2,getAverage(new int[] {2,2,2,2}));
        assertEquals(3,getAverage(new int[] {1,2,3,4,5}));
        assertEquals(1,getAverage(new int[] {1,1,1,1,1,1,1,2}));
    }

    public static int getAverage(int[] marks){

        return Math.round(Arrays.stream(marks).sum() / marks.length);
       /* return (int) Math.round(Arrays.stream(marks).average().getAsDouble());*/  //  ну или так
    }

}
