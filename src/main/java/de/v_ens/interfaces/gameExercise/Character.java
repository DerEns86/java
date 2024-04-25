package de.v_ens.interfaces.gameExercise;

import java.util.Objects;

public class Character {

    private int positionX;
    private int positionY;
    private String name;


    public Character() {
    }

    public Character(int positionX, int positionY, String name) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Character character)) return false;
        return positionX == character.positionX && positionY == character.positionY && Objects.equals(name, character.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(positionX, positionY, name);
    }

    @Override
    public String toString() {
        return "Character{" +
                "positionX=" + positionX +
                ", positionY=" + positionY +
                ", name='" + name + '\'' +
                '}';
    }
}
