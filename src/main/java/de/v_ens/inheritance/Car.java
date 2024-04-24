package de.v_ens.inheritance;

public class Car extends Vehicle{
    private int numberOfDoors;
    private String color;

    public Car(){

    }

    public Car(String manufacturer, String model, int yearOfManufacture, int numberOfDoors, String color){
        super(manufacturer, model, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
public String toString() {
    return super.toString() + ", Car{" +
            "numberOfDoors=" + numberOfDoors +
            ", color='" + color + '\'' +
            '}';
}
}
