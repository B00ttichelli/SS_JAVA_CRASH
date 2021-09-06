package CodewarsTasks.Strings;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class abbreviate_a_two_word_name {


    @Test
    public void testFixed() {
        assertEquals("S.H", AbbreviateTwoWords.abbrevName("Sam Harris"));
        assertEquals("P.F", AbbreviateTwoWords.abbrevName("Patrick Feenan"));
        assertEquals("E.C", AbbreviateTwoWords.abbrevName("Evan Cole"));
        assertEquals("P.F", AbbreviateTwoWords.abbrevName("P Favuzzi"));
        assertEquals("D.M", AbbreviateTwoWords.abbrevName("David Mendieta"));
    }

   static class AbbreviateTwoWords {

        public static String abbrevName(String name) {
            return String.valueOf(name.split(" ")[0].charAt(0)).toUpperCase(Locale.ROOT)+"."+String.valueOf(name.split(" ")[1].charAt(0)).toUpperCase(Locale.ROOT);
        }
    }

}
