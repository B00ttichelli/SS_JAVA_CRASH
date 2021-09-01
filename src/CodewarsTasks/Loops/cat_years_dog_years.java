package CodewarsTasks.Loops;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class cat_years_dog_years {


    @Test
    public void one() {
        assertArrayEquals(new int[]{1,15,15}, humanYearsCatYearsDogYears(1));
    }

    @Test
    public void two() {
        assertArrayEquals(new int[]{2,24,24}, humanYearsCatYearsDogYears(2));
    }

    @Test
    public void ten() {
        assertArrayEquals(new int[]{10,56,64}, humanYearsCatYearsDogYears(10));
    }



    public static int[] humanYearsCatYearsDogYears(final int humanYears) {




        // Your code here!

        int catYears;
        int dogYears;
        if(humanYears == 1){
            return new int[]{1,15,15};
        }else {
            catYears = 24;
            dogYears = 24;
        }
        for(int i = 2; i<humanYears;i++){
            catYears += 4;
            dogYears += 5;
        }


        return new int[]{humanYears,catYears,dogYears};


    }



}
