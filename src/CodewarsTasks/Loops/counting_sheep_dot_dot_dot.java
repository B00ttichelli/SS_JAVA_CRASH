package CodewarsTasks.Loops;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class counting_sheep_dot_dot_dot
{

    Boolean[] array1 = {true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true };

    @Test
    public void test() {
        assertEquals("There are 17 sheeps in total", 17, countSheeps(array1));
    }

    public int countSheeps(Boolean[] arrayOfSheeps) {
        // May the force be with you

                                                    //Devil is in detail ;)
        return Arrays.stream(arrayOfSheeps).filter(a->a==Boolean.TRUE).toArray().length;
    }

    // Задача с подвохом, пришлось повозитса пока не прочитал внимательно условия
}
