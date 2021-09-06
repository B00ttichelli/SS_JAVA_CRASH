package CodewarsTasks.Strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class are_you_playing_banjo {

    @Test
    public void PeopleThatPlayBanjo() {
        assertEquals( "Nope!", "Martin does not play banjo", Banjo.areYouPlayingBanjo("Martin"));
        assertEquals( "Nope!", "Rikke plays banjo", Banjo.areYouPlayingBanjo("Rikke"));
    }

    static class Banjo {
        public static String areYouPlayingBanjo(String name) {
            return name.toLowerCase().startsWith("r")?name+" plays banjo":name +" does not play banjo";
        }
    }

}
