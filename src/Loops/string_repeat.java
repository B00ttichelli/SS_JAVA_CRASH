package Loops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class string_repeat {

    @Test
    public void test4a() {
        assertEquals("aaaa", repeatStr(4, "a"));
    }
    @Test public void test3Hello() {
        assertEquals("HelloHelloHello", repeatStr(3, "Hello"));
    }
    @Test public void test5empty() {
        assertEquals("", repeatStr(5, ""));
    }
    @Test public void test0kata() {
        assertEquals("", repeatStr(0, "kata"));
    }

    public static String repeatStr(final int repeat, final String string) {



        return String.valueOf(string).repeat(Math.max(0, repeat));  // И тут в одну строчку
    }

}
