package CodewarsTasks.Loops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _21_sticks {


    @Test
    public void sampleTest() {
        assertEquals(3, makeMove(3));
        assertEquals(1, makeMove(21));
    }


    public static int makeMove(int sticks) {
        // Your code goes here. Good luck!
      return sticks<4?sticks:sticks%4;
    }




}
