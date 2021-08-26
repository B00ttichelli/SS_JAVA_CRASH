package CodewarsTasks.BasicProgram;

import static org.junit.Assert.assertEquals;
public class jennys_secret_message {
    public static void main(String[] args) {

        assertEquals("should greet some people normally", "Hello, Jim!", Greeter.greet("Jim"));
        assertEquals("should greet some people normally", "Hello, Jane!", Greeter.greet("Jane"));
        assertEquals("should greet some people normally", "Hello, Simon!", Greeter.greet("Simon"));
        assertEquals("should greet Johnny a little bit more special", "Hello, my love!", Greeter.greet("Johnny"));


    }


    public static class Greeter {
        public static String greet(String name) {


            if(name.equals("Johnny")){
                return "Hello, my love!";
            }

            return String.format("Hello, %s!", name);

        }
    }
}
