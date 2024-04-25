package de.v_ens.interfaces.gameExercise;

import java.util.Objects;

public class Player extends Character {

    private String weapon;

    public Player() {
    }

    public Player(int positionX, int positionY, String name, String weapon) {
        super(positionX, positionY, name);
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player player)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(weapon, player.weapon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weapon);
    }

    @Override
    public String toString() {
        return "Player{" +
                "weapon='" + weapon + '\'' +
                "} " + super.toString();
    }



}
