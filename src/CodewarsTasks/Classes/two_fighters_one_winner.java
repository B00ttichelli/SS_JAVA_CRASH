package CodewarsTasks.Classes;

import static org.junit.Assert.assertEquals;


public class two_fighters_one_winner {

    public static void main(String[] args) {

        assertEquals("Lew", two_fighters_one_winner.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"));
        assertEquals("Harry", two_fighters_one_winner.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", two_fighters_one_winner.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
        assertEquals("Harald", two_fighters_one_winner.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
        assertEquals("Harald", two_fighters_one_winner.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
        assertEquals("Harald", two_fighters_one_winner.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));

    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        // Your code goes here. Have fun!
        //Бойцов выдали не ООПшных никакой инкапсуляции

        //определяем самого борзого
        if (fighter1.name.equals(firstAttacker)) {
            fighter1.isAttacker = true;
        } else {
            fighter2.isAttacker = true;
        }

        // начинаем раздавать друг другу люлей
        while (true) {
            if (fighter1.isAttacker) {
                fighter2.health = fighter2.health - fighter1.damagePerAttack; // ай-ой больна
                fighter1.isAttacker = false;
                fighter2.isAttacker = true; // ну я щас тебе вмажу
                if (fighter2.health <=0){
                    break; // вмажу еси не труп
                }
            } else {

                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                fighter2.isAttacker = false;
                fighter1.isAttacker = true;
                if(fighter1.health <=0){
                    break;
                }
            }
        }

        return fighter1.health > 0 ? fighter1.name : fighter2.name; // смотрим кто труп
    }


}
