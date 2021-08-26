package CodewarsTasks.BasicProgram;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class century_from_year {
    public static void main(String[] args) {
        assertEquals(18, Solution.century(1705));
        assertEquals(19, Solution.century(1900));
        assertEquals(17, Solution.century(1601));
        assertEquals(20, Solution.century(2000));
        assertEquals(1, Solution.century(89));
    }


    public static class Solution {
        public static int century(int number) {
            return number % 10 == 0 ? (number / 100) : (number / 100) + 1; // мой любимый тренарный !!!
        }
    }
}