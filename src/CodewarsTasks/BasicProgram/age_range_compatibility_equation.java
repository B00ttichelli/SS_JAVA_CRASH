package CodewarsTasks.BasicProgram;

import static org.junit.Assert.assertEquals;


public class age_range_compatibility_equation {

    public static void main(String[] args) {
        assertEquals("15-20", Kata.datingRange(17));
        assertEquals("27-66", Kata.datingRange(40));
        assertEquals("14-16", Kata.datingRange(15));
        assertEquals("24-56", Kata.datingRange(35));
        assertEquals("9-11", Kata.datingRange(10));
    }


    public static  class Kata{
        public static String datingRange(int age) {
            //return min-max
            // Пока ещё удаетса решить в одну строчку кода ))
            return age <= 14?((int)(age-0.1*age)) +"-"+ ((int)(age+0.1*age)):age/2+7 +"-"+((age-7)*2);
        }
    }
}
