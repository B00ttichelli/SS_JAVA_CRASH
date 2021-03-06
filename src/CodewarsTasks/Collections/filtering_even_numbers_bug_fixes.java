package CodewarsTasks.Collections;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class filtering_even_numbers_bug_fixes {

    @Test
    public void firstTest() throws Exception {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4, 5, 6, 7));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList(1, 3, 5, 7));
        assertEquals(expectedResult,Kata13December.filterOddNumber(listOfNumbers));
    }

    @Test
    public void secondTest()
    {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList( 1, 2, 2, 2, 4, 3, 4 ));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList( 1, 3 ));
        assertEquals(Arrays.toString(expectedResult.toArray()), Arrays.toString(Kata13December.filterOddNumber(listOfNumbers).toArray()));
    }

    static class Kata13December {
        public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
        {

            return listOfNumbers.stream().filter(a->a%2!=0).collect(Collectors.toList());
        }
    }


}
