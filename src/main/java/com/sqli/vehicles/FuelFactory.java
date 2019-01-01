package com.sqli.vehicles;

class FuelFactory {
    static Fuel create(String fuel) {
        switch (fuel) {
            case "Hybrid":
                return Fuel.Hybrid;
            case "Diesel":
                return Fuel.Diesel;
            case "Gasoline":
                return Fuel.Gasoline;
            default:
                throw new IllegalArgumentException();
        }
    }
}
