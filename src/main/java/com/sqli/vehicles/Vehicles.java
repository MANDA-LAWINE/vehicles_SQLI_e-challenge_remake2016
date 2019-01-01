package com.sqli.vehicles;

import java.util.HashMap;
import java.util.Map;

class Vehicles {

    private Map<String, Vehicle> vehicles = new HashMap<>();


    Vehicles(String nameTypeFuelOfVehicles) {
        buildVehicles(nameTypeFuelOfVehicles);
    }

    private void buildVehicles(String nameTypeFuelOfVehicles) {
        String[] nameTypeFuelVehicleCollection = Utils.extractVehicle(nameTypeFuelOfVehicles);
        for (String vehicle : nameTypeFuelVehicleCollection
        ) {
            buildVehicle(vehicle);
        }
    }

    private void buildVehicle(String vehicle) {
        String[] nameTypeFuel = Utils.extractNameTypeFuel(vehicle);

        if (nameTypeFuel.length == 3) {
            Vehicle vechileObj = VehicleFactory.create(nameTypeFuel[1]);
            Fuel fuel = FuelFactory.create(nameTypeFuel[2]);
            vechileObj.setFuel(fuel);
            vehicles.put(nameTypeFuel[0], vechileObj);
        } else {
            throw new IllegalArgumentException();
        }
    }

    void move(String vehicle, String distance) {
        vehicles.get(vehicle).move(distance);
    }

    String status(String vehicle) {
        return vehicles.get(vehicle).status();
    }

    String consumption(String vehicle) {
        return vehicles.get(vehicle).consumption();
    }

    void openDoor(String vehicle, String doorNumber) throws IllegalAccessException {
        if (vehicles.get(vehicle).numberOfDoors() != 0) {
            vehicles.get(vehicle).openDoor(Integer.valueOf(doorNumber));
            vehicles.get(vehicle).setDoorOpenFlag(true);
        } else {
            throw new IllegalAccessException();
        }
    }
}
