package CodewarsTasks.Classes;

import lombok.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/*Не очень понял нужнго ли использовать  Ломбок или не нужно зделал оба варианта от греха подальше*/
public class lombok_encapsulation {
    @Test
    public void testSample() {
        EncapsulationDemo ed = new EncapsulationDemo();
        assertEquals(
                0,
                ed.getNumber()
        );

    }
    public static @Data @NoArgsConstructor @AllArgsConstructor
    class EncapsulationDemo {


       @Getter
       @Setter
       private int number;
        @Getter
        @Setter
        private String stringValue;
        @Getter
        @Setter
        private Object anObject;
    }


///

   /* public static class EncapsulationDemo{

        private int number;
        private String stringValue;
        private Object anObject;

        public EncapsulationDemo() {
        }

        public EncapsulationDemo(int number, String stringValue, Object anObject) {
            this.number = number;
            this.stringValue = stringValue;
            this.anObject = anObject;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getStringValue() {
            return stringValue;
        }

        public void setStringValue(String stringValue) {
            this.stringValue = stringValue;
        }

        public Object getAnObject() {
            return anObject;
        }

        public void setAnObject(Object anObject) {
            this.anObject = anObject;
        }
    }*/
}
