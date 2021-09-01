package CodewarsTasks.Conditions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class transportation_on_vacation {

    @Test
    public void under3Tests() {
        assertEquals(40, rentalCarCost(1));
        assertEquals(80, rentalCarCost(2));
    }

    @Test
    public void under7Tests() {
        assertEquals(100, rentalCarCost(3));
        assertEquals(140, rentalCarCost(4));
        assertEquals(180, rentalCarCost(5));
        assertEquals(220, rentalCarCost(6));
    }

    @Test
    public void over7Tests() {
        assertEquals(230, rentalCarCost(7));
        assertEquals(270, rentalCarCost(8));
        assertEquals(310, rentalCarCost(9));
        assertEquals(350, rentalCarCost(10));
    }



    public static int rentalCarCost(int d) {
        // Your solution here


        return d<3?d*40:d<7?(d*40)-20:(d*40)-50;
    }




}
