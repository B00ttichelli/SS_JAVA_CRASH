package CodewarsTasks.BasicProgram;
import static org.junit.Assert.assertEquals;


public class return_negative {
    public static void main(String[] args) {


        assertEquals(-42, Kata.makeNegative(42));
        assertEquals(-5,Kata.makeNegative(-5));
    }

    public static class Kata {

        public static int makeNegative(final int x) {

            return x>0?-x :x; // Your code here.

        }

    }

}
