package CodewarsTasks.BasicProgram;
import static org.junit.Assert.assertEquals;
public class beginner_series_number_2_clock {


    public static void main(String[] args) {
        assertEquals(61000, Clock.Past(0,1,1));

    }

    public static  class Clock
    {
        public static int Past(int h, int m, int s)
        {
            //Happy Coding! ^_^

            return (h*60*60000)+(m*60000)+(s*1000);
        }
    }


}
