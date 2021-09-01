package CodewarsTasks.Conditions;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class basic_mathematical_operations {



    @Test
    public void testBasics()
    {
        System.out.println("Basic Tests");
        assertThat(basicMath("+", 4, 7), is(11));
        assertThat(basicMath("-", 15, 18), is(-3));
        assertThat(basicMath("*", 5, 5), is(25));
        assertThat(basicMath("/", 49, 7), is(7));
    }


    public static Integer basicMath(String op, int v1, int v2)
    {
        switch(op){
            case "+": return v1+v2;
            case "-": return v1-v2;
            case "*": return v1*v2;
            case "/": return v1/v2;
        }
        return 0;
    }

}
