package CodewarsTasks.Strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class convert_a_number_to_a_string {





        @Test
        public void tests() {
            assertEquals("67", numberToString(67));
            assertEquals("123", numberToString(123));
            assertEquals("999", numberToString(999));
        }
        public static String numberToString(int num) {
            // Return a string of the number here!

            return ""+num;
        }
}
