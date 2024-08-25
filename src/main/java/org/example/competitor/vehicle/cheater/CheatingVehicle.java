package org.example.competitor.vehicle.cheater;

import org.example.competitor.vehicle.Vehicle;

public class CheatingVehicle extends Vehicle {

    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println(getName() + " is accelerating with " + speed + "km/h " + durationInHours + "h");
        System.out.println("Cheater!!!");

        double distance = speed * durationInHours * 2;

        totalTraveledDistance += distance;

        System.out.println("Total traveled distance for vehicle " + getName() + ":" + totalTraveledDistance);
        return distance;
    }

    // method access can be more permissive than in the parent class
// co-variant return type
    @Override
    public CheatingVehicle reset() {
        super.reset();

        return this;
    }

    public void cheat() {totalTraveledDistance *= 2;
        System.out.println("Updated total distance: " + totalTraveledDistance);
    }
}
