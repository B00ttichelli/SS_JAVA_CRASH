package CodewarsTasks.Conditions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class do_i_get_a_bonus {
   
        @Test
        public void basicTests() {
            boolean wellConfigured=unicodeTest();
            assertEquals((wellConfigured?"£":"\u00A3")+"100000",do_i_get_a_bonus.bonusTime(10000, true));
            assertEquals((wellConfigured?"£":"\u00A3")+"250000",do_i_get_a_bonus.bonusTime(25000, true));
            assertEquals((wellConfigured?"£":"\u00A3")+"10000",do_i_get_a_bonus.bonusTime(10000, false));
            assertEquals((wellConfigured?"£":"\u00A3")+"60000",do_i_get_a_bonus.bonusTime(60000, false));
            assertEquals((wellConfigured?"£":"\u00A3")+"20",do_i_get_a_bonus.bonusTime(2, true));
            assertEquals((wellConfigured?"£":"\u00A3")+"78",do_i_get_a_bonus.bonusTime(78, false));
            assertEquals((wellConfigured?"£":"\u00A3")+"678900",do_i_get_a_bonus.bonusTime(67890, true));
        }

        public boolean unicodeTest(){
            System.out.println("\u00A3 == £:"+"\u00A3".equalsIgnoreCase("£"));
            System.out.println("if previous result was false or had ? symbol then perhaps you need to escape unicode due to misconfiguration");
            return "\u00A3".equalsIgnoreCase("£");
        }
    

    public static String bonusTime(final int salary, final boolean bonus) {
        return bonus?"£"+ Integer.toString(salary * 10) :"£"+ Integer.toString(salary);
    }
}
