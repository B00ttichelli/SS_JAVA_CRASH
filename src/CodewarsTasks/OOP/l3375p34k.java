package CodewarsTasks.OOP;

/*
        a -> 4
        e -> 3
        l -> 1
        m -> /^^\
        o -> 0
        u -> (_)
*/


import static org.junit.Assert.assertTrue;

public class l3375p34k extends Encoder {

        //where is a fucking OOP there ?
    public static void main(String[] args) {
         l3375p34k myEncoder = new l3375p34k();



            assertTrue("empty string", myEncoder.encode("").equals(""));
            assertTrue("abcdef string", myEncoder.encode("abcdef").equals("4bcd3f"));

    }

    public String encode(String source){

        return source == null?"":source.replace("a","4").replace("e","3").
                replace("l","1").
                replace("m","/^^\\").replace("o","0").
                replace("u","(_)").replace("A","4").replace("E","3").
                replace("L","1").
                replace("M","/^^\\").replace("O","0").replace("U","(_)");
    }
}

abstract class Encoder{
    public abstract String encode(String source);
}



