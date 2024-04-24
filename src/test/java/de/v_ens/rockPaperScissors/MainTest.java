package de.v_ens.rockPaperScissors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", Main.rps("rock", "scissors"));
        assertEquals("Player 1 won!", Main.rps("scissors", "paper"));
        assertEquals("Player 1 won!", Main.rps("paper", "rock"));
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", Main.rps("scissors", "rock"));
        assertEquals("Player 2 won!", Main.rps("paper", "scissors"));
        assertEquals("Player 2 won!", Main.rps("rock", "paper"));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", Main.rps("scissors", "scissors"));
        assertEquals("Draw!", Main.rps("paper", "paper"));
        assertEquals("Draw!", Main.rps("rock", "rock"));
    }

}
