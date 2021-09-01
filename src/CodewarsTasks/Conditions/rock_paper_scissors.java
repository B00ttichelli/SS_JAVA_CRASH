package CodewarsTasks.Conditions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class rock_paper_scissors {

    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", rock_paper_scissors.rps("rock", "scissors"));
        assertEquals("Player 1 won!", rock_paper_scissors.rps("scissors", "paper"));
        assertEquals("Player 1 won!", rock_paper_scissors.rps("paper", "rock"));
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", rock_paper_scissors.rps("scissors", "rock"));
        assertEquals("Player 2 won!", rock_paper_scissors.rps("paper", "scissors"));
        assertEquals("Player 2 won!", rock_paper_scissors.rps("rock", "paper"));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", rock_paper_scissors.rps("scissors", "scissors"));
        assertEquals("Draw!", rock_paper_scissors.rps("paper", "paper"));
        assertEquals("Draw!", rock_paper_scissors.rps("rock", "rock"));
    }


    public static String rps(String p1, String p2) {
        // your code
        if(p1.equals(p2)){
            return "Draw!";

        } else {

            if((p1.equals("scissors") && !p2.equals("rock")) || (p1.equals("paper") && !p2.equals("scissors")) ||(p1.equals("rock") && !p2.equals("paper"))){
                return "Player 1 won!";
            } else {
                return "Player 2 won!";
            }
        }

    }
}
