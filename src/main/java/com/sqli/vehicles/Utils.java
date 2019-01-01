package com.sqli.vehicles;

import java.util.Arrays;
import java.util.List;

class Utils {
    static final String NAME_TYPE_FUEL_VEHICLES_SEPARATOR = ", ";
    static final String VEHICLE_SEPARATOR = ":";

    static String[] extractVehicle(String nameTypeFuelOfVehicles) {
        return nameTypeFuelOfVehicles.split(NAME_TYPE_FUEL_VEHICLES_SEPARATOR);
    }

    static String[] extractNameTypeFuel(String vehicle) {
        return vehicle.split(VEHICLE_SEPARATOR);
    }

    static Integer extractDistance(String distance) {
        String[] distanceUnit = distance.split(" ");

        if (distanceUnit.length == 2)
            return new Integer(distanceUnit[0]);

        return -1;
    }
}
