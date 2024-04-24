package de.v_ens.rockPaperScissors;

public class Main {
    public static void main(String[] args) {
        System.out.println(rps("rock", "scissors"));
    }

    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        }
        if (p1.equals("rock") && p2.equals("scissors")) {
            return "Player 1 won!";
        }
        if (p1.equals("scissors") && p2.equals("paper")) {
            return "Player 1 won!";
        }
        if (p1.equals("paper") && p2.equals("rock")) {
            return "Player 1 won!";
        }
        return "Player 2 won!";
    }
}