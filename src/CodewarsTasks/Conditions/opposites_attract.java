package CodewarsTasks.Conditions;

import org.junit.Test;

import static org.junit.Assert.*;

public class opposites_attract {

    @Test
    public void testOddAndEven() {
        assertTrue(isLove(1, 4));
    }

    @Test
    public void testEvenAndEven() {
        assertFalse(isLove(2, 2));
    }

    @Test
    public void testOddAndOdd() {
        assertFalse(isLove(1, 1));
    }

    @Test
    public void testEvenAndOdd() {
        assertTrue(isLove(0, 1));
    }




    public static boolean isLove(final int flower1, final int flower2) {

        return (flower1 % 2 != 0 || flower2 % 2 != 0) && (flower1 % 2 == 0 || flower2 % 2 == 0);

    }

}
