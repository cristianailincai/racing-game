package org.example.vehicles.cheater;

import org.example.vehicles.Vehicle;

public class CheatingVehicle extends Vehicle {
    public void cheat() {
        totalTraveledDistance *= 2;
    }
}
