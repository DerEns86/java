package de.v_ens.inheritance;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Toyota", "Camry", 2021);
        Car car1 = new Car("VW", "Golf", 2020, 4, "Red");

        System.out.println(vehicle1);
        System.out.println(car1);


    }
}

/*Create another derived class from "Vehicle" called "Motorcycle". Add appropriate properties to this class.

Implement a method in the "Motorcycle" class that returns the type of motorcycle (e.g. Chopper, Sportbike, Cruiser).

Create instances of both "Car" and "Motorcycle" and call the methods to output the information.

Discuss together how inheritance was applied in this scenario and what advantages it offers.*/