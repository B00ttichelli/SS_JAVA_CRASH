package CodewarsTasks.Loops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class twice_as_old {

    @Test
    public void testSomething() {
        assertEquals(30, TwiceAsOld(30,0));
        assertEquals(16, TwiceAsOld(30,7));
        assertEquals(15, TwiceAsOld(45,30));

    }

    public static int TwiceAsOld(int dadYears, int sonYears){
        return (dadYears-(sonYears*2))>0?(dadYears-(sonYears*2)):-(dadYears-(sonYears*2));
        //Вот решаю эти задачи и не понимаю причем здесь циклы ;)

    }
}

