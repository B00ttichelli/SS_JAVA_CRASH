package CodewarsTasks.Conditions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class convert_a_boolean_to_a_string {
    @Test
    public void testTrue(){
        assertEquals(convert(true), "true");
    }

    @Test public void testFalse(){
        assertEquals(convert(false), "false");
    }

    public static String convert(boolean b){
        return b?"true":"false";
    }
}
