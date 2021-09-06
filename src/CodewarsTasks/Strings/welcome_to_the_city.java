package CodewarsTasks.Strings;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class welcome_to_the_city {

    @Test
    public void test1() throws Exception {
        Hello h = new Hello();
        String[] name = {"John", "Smith"};
        assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!",
                h.sayHello(name, "Phoenix", "Arizona"));
    }

    class Hello{
        public String sayHello(String [] name, String city, String state){

            return String.format("Hello, %s! Welcome to %s, %s!",String.join(" ", name),city,state);
        }
    }

}
