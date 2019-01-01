package com.sqli.vehicles;

public class Car extends Vehicle {


    Car() {
        createDoors();
    }

    @Override
    Integer numberOfDoors() {
        return Configuration.CAR_DOORS_NUMBER;
    }

    @Override
    String consumption() {
        if (doorOpenFlag)
            return "The Car will consume " + String.format("%.2f", consumption) + " L";

        return "The Car consumed " + String.format("%.2f", consumption) + " L";
    }

    @Override
    protected void createDoors() {
        for (int i = 0; i < numberOfDoors(); i++) {
            doors.add(new Door(i + 1));
        }
    }


}
