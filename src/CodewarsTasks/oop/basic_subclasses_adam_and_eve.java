package CodewarsTasks.oop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class basic_subclasses_adam_and_eve {


    public static class God {


        public static Human[] create() {
            //code
            return new Human[]{new Man(), new Woman()};
        }

        @Test
        public void makingAdam() {
            Human[] paradise = God.create();
            assertEquals("Adam are a man", true, paradise[0] instanceof Man);
        }
    }


    public static class Human {

    }

    public static class Man extends Human {

    }

    public static class Woman extends Human {

    }
}
