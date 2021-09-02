package CodewarsTasks.Loops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class grasshopper_summation {

    @Test
    public void test1() {
        assertEquals(1,
                summation(1));
    }
    @Test
    public void test2() {
        assertEquals(36,
                summation(8));
    }

    //классический вариант решения )))
    public static int summation(int n) {

        int result = 0;

        for (int i = 0; i <=n; i++) {
         result+=i;
        }

        return result;
    }

}
