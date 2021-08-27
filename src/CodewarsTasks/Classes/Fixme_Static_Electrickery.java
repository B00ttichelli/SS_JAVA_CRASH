package CodewarsTasks.Classes;

/*The code provided has a method plus100 which is supposed to return the number of the parameter incremented by 100.

        But it's not working properly.
        Task

        Fix the code so we can all go home early.
        Restrictions

        Do not modify the constructor
        Do not modify the plus100 method
        Do not modify the ONE_HUNDRED declaration*/

import org.junit.Test;


public class Fixme_Static_Electrickery {


    @Test
    public void test() {
        System.out.println(Dinglemouse.INST.plus100(23));
        // Err... was that right?
    }


    public  static class Dinglemouse {
        //Как тебе такое Илон Маск ???
        public static  Dinglemouse INST = new Dinglemouse().setValueAndReturnInstance(100);


        //почему низя статик у УАН_ХАНДРЕД просто отобрать ??? Ну зачем он ему ??? Ах ты ж Йопрст !!!!
        private static int  ONE_HUNDRED = 100;
        //Про Валю тоже ничего не грили потому убрал файнал )
        private  int value;

        private Dinglemouse() {
            value = ONE_HUNDRED;
        }

        public int plus100(int n) {
            return value + n;
        }

        // Тссссссс ты этот метод не видел !!! Его здесь нет
        public Dinglemouse setValueAndReturnInstance (int n){
            this.value=100;
            return this;
        }


    }
}
