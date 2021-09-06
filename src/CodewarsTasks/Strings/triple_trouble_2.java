package CodewarsTasks.Strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class triple_trouble_2 {

    @Test
    public void tests() {
        assertEquals("ttlheoiscstk", Kata.tripleTrouble("this", "test", "lock"));
        assertEquals("abcabc", Kata.tripleTrouble("aa", "bb", "cc"));
        assertEquals("Batman", Kata.tripleTrouble("Bm", "aa", "tn"));
        assertEquals("LexLuthor", Kata.tripleTrouble("LLh", "euo", "xtr"));
    }

    static class Kata {
        public static String tripleTrouble(String one, String two, String three) {
            // Solution
            String result = "";
            for (int i = 0; i < one.length(); i++) {
                result = result + one.charAt(i) + two.charAt(i) + three.charAt(i);
            }
            return result;
        }
    }

}
