package CodewarsTasks.Strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class all_star_code_challenge_number_18 {

    @Test
    public void testSomething() {
        assertEquals(1, CodeWars.strCount("Hello", 'o'));
        assertEquals(2, CodeWars.strCount("Hello", 'l'));
        assertEquals(0, CodeWars.strCount("",'z'));
    }

    static class CodeWars {
        public static int strCount(String str, char letter) {
            //write code here
            return (int) str.chars().filter(a->a==letter).count();
        }
    }
}
