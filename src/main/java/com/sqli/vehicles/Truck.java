package com.sqli.vehicles;

class Truck extends Vehicle {

    Truck() {
        createDoors();
    }

    @Override
    Integer numberOfDoors() {
        return Configuration.TRUCK_DOORS_NUMBER;
    }

    @Override
    String consumption() {
        if (doorOpenFlag)
            return "The Truck will consume " + String.format("%.2f", consumption) + " L";
        return "The Truck consumed " + String.format("%.2f", consumption) + " L";
    }

    @Override
    protected void createDoors() {
        for (int i = 0; i < numberOfDoors(); i++) {
            doors.add(new Door(i + 1));
        }
    }
}
