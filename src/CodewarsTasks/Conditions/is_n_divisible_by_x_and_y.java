package CodewarsTasks.Conditions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class is_n_divisible_by_x_and_y {






        @Test
        public void test1() {
            assertEquals(true, isDivisible(12,4,3));
        }
        @Test
        public void test2() {
            assertEquals(false, isDivisible(3,3,4));
        }



    public static boolean isDivisible(long n, long x, long y) {
        return n%x==0&&n%y==0;
    }



}
