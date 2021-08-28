package CodewarsTasks.Conditions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class opposite_number {

    public static void main(String[] args) {


            assertEquals(-1, opposite(1));

    }

    public static int opposite(int number)
    {
        return number>0?-number:+number;
    }



}
