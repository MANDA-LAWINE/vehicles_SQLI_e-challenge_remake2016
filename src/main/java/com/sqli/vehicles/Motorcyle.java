package com.sqli.vehicles;

public class Motorcyle extends Vehicle {


    @Override
    Integer numberOfDoors() {
        return Configuration.MOTORCYCLE_DOORS_NUMBER;
    }

    @Override
    String consumption() {
        return "The Motorcycle will consume " + String.format("%.2f", consumption) + " L";
    }

    @Override
    protected void createDoors() {
        return;
    }

}
