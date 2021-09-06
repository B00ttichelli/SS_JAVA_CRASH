package CodewarsTasks.Strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class reversed_strings {


    @Test
    public void sampleTests() {
        assertEquals("dlrow", solution("world"));
    }

    public static String solution(String str) {
        // Your code here...
        return new StringBuffer(str).reverse().toString();
    }

}
