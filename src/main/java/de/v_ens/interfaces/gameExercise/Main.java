package de.v_ens.interfaces.gameExercise;

public class Main {

    public static void main(String[] args) {

        Character c1 = new Character(0, 0, "Character1");

        Player p1 = new Player(0, 0, "Player1", "Sword");

        Movable p2 = new Player(0, 0, "Player2", "nothing");

        System.out.println("Char1: " +c1);
        c1.setPositionX(10);
        System.out.println("Char1: " + c1);

        System.out.println("Player1: " + p1);
        p1.setPositionY(20);
        p1.setWeapon("Gun");

        System.out.println("Player2: " + p2);
        p2.moveInX(12);
        System.out.println("Player2: " + p2);
        p2.moveInY(13);
        System.out.println("Player2: " + p2);
        System.out.println("Player1: " + p1);

    }
}
