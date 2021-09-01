package CodewarsTasks.Conditions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class convert_boolean_values_to_strings_yes_or_no {

    @Test
    public void testBoolToWord() {
        assertEquals(boolToWord(true),"Yes");
        assertEquals(boolToWord(false),"No");
    }


    public static String boolToWord(boolean b)
    {
        return b?"Yes":"No";
    }

}
