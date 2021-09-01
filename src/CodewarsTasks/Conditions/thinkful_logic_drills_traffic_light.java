package CodewarsTasks.Conditions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class thinkful_logic_drills_traffic_light {


    @Test
    public void update_light() {
        assertEquals("green", updateLight("red"));
        assertEquals("yellow", updateLight("green"));
        assertEquals("red", updateLight("yellow"));
    }


    public static String updateLight(String current) {

        return current.equals("red")?"green":current.equals("yellow")?"red":"yellow";
    }

}

