package com.sqli.vehicles;

public enum Fuel {
    Hybrid(0.03), Diesel(0.05), Gasoline(0.06);


    private final double fuelLeterPerKilo;

    Fuel(double fuelLeterPerKilo) {
        this.fuelLeterPerKilo = fuelLeterPerKilo;
    }

    public double fuelLeterPerKiloConsumption() {
        return fuelLeterPerKilo;
    }
}
