package com.sqli.vehicles;

import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    List<Door> doors = new ArrayList<>();
    Fuel fuel;
    Double consumption = 0d;
    boolean doorOpenFlag = false;


    abstract Integer numberOfDoors();

    abstract String consumption();

    abstract void createDoors();

    void move(String distance) {
        if (doorOpenFlag) {
            return;
        }
        consumption += fuel.fuelLeterPerKiloConsumption() * Utils.extractDistance(distance);
    }

    String status() {
        String result = Configuration.DESTINATION_REACHED_STATUS;


        if (doorOpenFlag && doors.size() > 0) {
            result = Configuration.ALL_DOORS_MUST_BE_CLOSED + "\n";
            result += "  _\n";

            for (Door door :
                    doors) {

                if (door.doorNumber() == doors.size())
                    result += "_" + door.getContent();
                else
                    result += " " + door.getContent();

                if (door.doorNumber() % 2 == 0 && doors.size() != door.doorNumber())
                    result += "\n";
            }
        }


        return result;
    }

    void openDoor(Integer doorNumber) {
        if (doorNumber > 0)
            doors.get(doorNumber - 1).open();
    }

    void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    void setDoorOpenFlag(boolean doorFlag) {
        this.doorOpenFlag = doorFlag;
    }
}
