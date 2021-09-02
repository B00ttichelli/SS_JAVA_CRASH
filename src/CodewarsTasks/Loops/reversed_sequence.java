package CodewarsTasks.Loops;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class reversed_sequence {

    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1},reverse(5));
    }


    public static int[] reverse(int n){
        
        int [] result  =  new int[n];
        //your code
        for (int i = 0; i < result.length ; i++) {
            result[i] = n;
            n--;
        }

        return result;
    }
}
