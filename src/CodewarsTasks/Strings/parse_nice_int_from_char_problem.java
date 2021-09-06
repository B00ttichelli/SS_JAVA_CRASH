package CodewarsTasks.Strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class parse_nice_int_from_char_problem {

    @Test
    public void test1() {
        assertEquals(5, CharProblem.howOld("5 years old"));
    }

    @Test
    public void test2() {
        assertEquals(9, CharProblem.howOld("9 years old"));
    }

    @Test
    public void test3() {
        assertEquals(1, CharProblem.howOld("1 year old"));
    }

    static class CharProblem {
        public static int howOld(final String herOld) {

            //your code here, return correct age as int ; )
            return ((int)herOld.charAt(0))-48;

        }
    }


}
