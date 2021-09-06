package CodewarsTasks.Strings;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class fixme_replace_all_dots {

    @Test
    public void testSomeDots() {
        System.out.println(Dinglemouse.replaceDots("one.two.three"));

        assertTrue("Sorry, try again :-(", "one-two-three".equals(Dinglemouse.replaceDots("one.two.three")));

    }

    static class Dinglemouse {

        public static String replaceDots(final String str) {
            return str.replaceAll("\\.", "-");
        }

    }
}
