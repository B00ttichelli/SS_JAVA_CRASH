package CodewarsTasks.BasicProgram;


/*You're laying out a rad pixel art mural to paint on your living room wall in homage to Paul Robertson, your favorite pixel artist.

        You want your work to be perfect down to the millimeter. You haven't decided on the dimensions of your piece,
        how large you want your pixels to be, or which wall you want to use. You just know that you want to fit an exact number of pixels.

        To help decide those things you've decided to write a function, is_divisible() that will tell you whether a wall of
         a certain length can exactly fit an integer number of pixels of a certain length.

        Your function should take two arguments: the size of the wall in millimeters and the size of a pixel in millimeters.
         It should return True if you can fit an exact number of pixels on the wall, otherwise it should return False.
          For example is_divisible(4050, 27) should return True, but is_divisible(4066, 27) should return False.

        */

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class thinkful_number_drills_pixelart_planning {
    public static void main(String[] args) {
        System.out.println(Kata.isDivisible(2000, 10)); //true
        System.out.println(Kata.isDivisible(16, 3)); //false

        assertTrue(Kata.isDivisible(4050, 27));
        assertTrue(Kata.isDivisible(10000, 20));
        assertTrue(Kata.isDivisible(10005, 1));
        assertFalse(Kata.isDivisible(4066, 27));
        assertFalse(Kata.isDivisible(10005, 2));


    }


    public static class Kata {

        public static boolean isDivisible(int wallLength, int pixelSize) {

            return wallLength % pixelSize == 0;
        }
    }
}
