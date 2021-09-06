package CodewarsTasks.Strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class find_the_position {

    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", Kata.position('a'));
        assertEquals("Position of alphabet: 26", Kata.position('z'));
        assertEquals("Position of alphabet: 5", Kata.position('e'));
    }


    static class Kata
    {
        public static String position(char alphabet)
        {

            return "Position of alphabet: " +(((int)Character.toString(alphabet).toLowerCase().charAt(0))-96);
        }
    }
}
