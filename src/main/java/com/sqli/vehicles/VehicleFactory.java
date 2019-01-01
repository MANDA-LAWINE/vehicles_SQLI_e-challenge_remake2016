package com.sqli.vehicles;

class VehicleFactory {
    static Vehicle create(String s) {
        switch (s) {
            case "CAR":
                return new Car();
            case "TRUCK":
                return new Truck();
            case "MOTORCYCLE":
                return new Motorcyle();
            default:
                throw new IllegalArgumentException();
        }
    }
}
