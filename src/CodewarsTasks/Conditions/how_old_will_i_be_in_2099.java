package CodewarsTasks.Conditions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class how_old_will_i_be_in_2099 {


    public static String CalculateAge(int birth, int yearTo) {


        if (birth == yearTo) {
            return "You were born this very year!";
        } else {
            int x;
            if (birth > yearTo) {
                x = birth - yearTo;
                return x > 1 ? "You will be born in " + x + " years." : "You will be born in " + x + " year.";

            } else {
                x = yearTo - birth;
                return x > 1 ? "You are " + x + " years old." : "You are " + x + " year old.";
            }

        }




    }

    @Test
    public void testAge() {

        assertEquals("You are 4 years old.", how_old_will_i_be_in_2099.CalculateAge(2012, 2016));
        assertEquals("You are 27 years old.", how_old_will_i_be_in_2099.CalculateAge(1989, 2016));
        assertEquals("You are 90 years old.", how_old_will_i_be_in_2099.CalculateAge(2000, 2090));
        assertEquals("You will be born in 10 years.", how_old_will_i_be_in_2099.CalculateAge(2000, 1990));
        assertEquals("You were born this very year!", how_old_will_i_be_in_2099.CalculateAge(3400, 3400));
        assertEquals("You are 2000 years old.", how_old_will_i_be_in_2099.CalculateAge(900, 2900));
        assertEquals("You will be born in 110 years.", how_old_will_i_be_in_2099.CalculateAge(2010, 1900));
        assertEquals("You will be born in 510 years.", how_old_will_i_be_in_2099.CalculateAge(2010, 1500));
        assertEquals("You are 1 year old.", how_old_will_i_be_in_2099.CalculateAge(2011, 2012));
        assertEquals("You will be born in 1 year.", how_old_will_i_be_in_2099.CalculateAge(2000, 1999));

    }
}
