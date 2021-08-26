package CodewarsTasks.BasicProgram;


import static org.junit.Assert.assertEquals;

public class convert_to_binary {
    public static void main(String[] args) {


        assertEquals(1, Kata.toBinary(1));
        assertEquals(10, Kata.toBinary(2));
        assertEquals(11, Kata.toBinary(3));
        assertEquals(101, Kata.toBinary(5));

    }

    public static class Kata {

        public static int toBinary(int n) {
            //парился с алгоритмами, а потом вспомнил о статическом классе Интежер, как хорошо что ты есть ;)
            return Integer.parseInt(Integer.toBinaryString(n));
        }

    }

}
