package CodewarsTasks.Strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class exclamation_marks {


    @Test
    public void fixedTests() {
        // assertEquals("expected", "actual");
        assertEquals("Hi", Kata.remove("Hi!", 1));
        assertEquals("Hi", Kata.remove("Hi!", 100));
        assertEquals("Hi!!", Kata.remove("Hi!!!", 1));
        assertEquals("Hi", Kata.remove("Hi!!!", 100));
        assertEquals("Hi", Kata.remove("!Hi", 1));
        assertEquals("Hi!", Kata.remove("!Hi!", 1));
        assertEquals("Hi", Kata.remove("!Hi!", 100));
        assertEquals("!!Hi !!hi!!! !hi", Kata.remove("!!!Hi !!hi!!! !hi", 1));
        assertEquals("Hi !!hi!!! !hi", Kata.remove("!!!Hi !!hi!!! !hi", 3));
        assertEquals("Hi hi!!! !hi", Kata.remove("!!!Hi !!hi!!! !hi", 5));
        assertEquals("Hi hi hi", Kata.remove("!!!Hi !!hi!!! !hi", 100));
    }

    static class Kata {

        public static String remove(String s, int n){
            for (int i = 0; i < n; i++) {
                       s = s.replaceFirst("!","");
            }
            return s;

        }

    }

}
