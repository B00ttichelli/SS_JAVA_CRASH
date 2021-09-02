package CodewarsTasks.Loops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class find_nearest_square_number {

    @Test
    public void basicTests() {
        assertEquals(1, nearestSq(1));
        assertEquals(1, nearestSq(2));
        assertEquals(9, nearestSq(10));
        assertEquals(121, nearestSq(111));
        assertEquals(10000, nearestSq(9999));
    }


    public static int nearestSq(final int n) {
        int sqrt = (int)Math.sqrt(n);
            if(sqrt*sqrt == n){
                return n;
            }else {
                int floorSqr = sqrt*sqrt;
                int ceilingSqr = (sqrt+1)*(sqrt+1);
                    if (Math.abs(floorSqr-n)<Math.abs(ceilingSqr-n)){
                        return floorSqr;
                    }else {
                        return ceilingSqr;
                    }
            }

    }
}
