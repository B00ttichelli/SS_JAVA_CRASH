package CodewarsTasks.Classes;

import org.junit.Assert;
import org.junit.Test;


public class Fractions



{
    @Test
    public void T1_GeneralTests() {

        Assert.assertEquals(new Fraction(37, 40), new Fraction(1, 8).add(new Fraction(4, 5)));
        Assert.assertEquals(new Fraction(1, 1), new Fraction(1, 4).add(new Fraction(3, 4)));
        Assert.assertEquals(new Fraction(863483, 416760), new Fraction(911, 920).add(new Fraction(980, 906)));
        Assert.assertEquals(new Fraction(838923, 926885), new Fraction(610, 941).add(new Fraction(253, 985)));
        Assert.assertEquals(new Fraction(16880, 3591), new Fraction(956, 798).add(new Fraction(662, 189)));
        Assert.assertEquals(new Fraction(1011239, 417585), new Fraction(694, 485).add(new Fraction(853, 861)));
        Assert.assertEquals(new Fraction(191737, 20757), new Fraction(982, 111).add(new Fraction(219, 561)));
        Assert.assertEquals(new Fraction(41201, 23571), new Fraction(344, 873).add(new Fraction(658, 486)));
        Assert.assertEquals(new Fraction(184563, 68951), new Fraction(662, 361).add(new Fraction(322, 382)));
        Assert.assertEquals(new Fraction(33926, 23577), new Fraction(740, 813).add(new Fraction(184, 348)));
        Assert.assertEquals(new Fraction(78524, 39543), new Fraction(579, 441).add(new Fraction(543, 807)));
        Assert.assertEquals(new Fraction(83997, 283910), new Fraction(212, 979).add(new Fraction(46, 580)));
    }

    @Test
    public void T2_ReductionTests() {

        Assert.assertEquals(new Fraction(1, 2), new Fraction(4, 8));
        Assert.assertEquals(new Fraction(2, 3), new Fraction(10, 15));
        Assert.assertEquals(new Fraction(4, 9), new Fraction(24, 54));
    }

    @Test
    public void T3_ToStringTests() {

        Assert.assertEquals("4/5", (new Fraction(2, 5).add(new Fraction(2, 5))).toString());
        Assert.assertEquals("5/6", (new Fraction(2, 4).add(new Fraction(1, 3))).toString());
        Assert.assertEquals("13/15", (new Fraction(1, 5).add(new Fraction(4, 6))).toString());
    }


    public class Fraction implements Comparable<Fraction>
    {

        private final long top;
        private final long bottom;



        public Fraction(long numerator, long denominator) {
            top = numerator;
            bottom = denominator;
        }

        @Override
        public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }
        @Override
        public boolean equals(Object o) { return compareTo((Fraction)o) == 0; }  // 'equals()' should check the class of its parameter
        @Override
        public int compareTo(Fraction f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }

        // Your work here!

        public long getTop() {
            return top;
        }

        public long getBottom() {
            return bottom;
        }


        //Add two fractions
        // А говорили что для программирования математики не надо, опять гуглить прийдетсо ухх ж эти погромизды
        public Fraction add(Fraction f2) {
            return new Fraction((top* f2.getBottom())+(bottom* f2.getTop()),bottom* f2.getBottom());
        }

        //...and make this class string representable

        //Прийдетса написать функцию для поиска НОД великий и ужасный алогритм Эвклида реализованый в говнокоде
        private long euclidAlg(long a , long b){  // вот где можно имя написать с маленькой
         return b==0?a: euclidAlg(b,a%b); // рекурсия иногда )
        }




  // Смори как Репрезентабельно то, дальше некуда
        @Override
        public String toString() {
            long nod = euclidAlg(top,bottom);
            return  top/nod +
                    "/" + bottom/nod ;
        }
    }
}
