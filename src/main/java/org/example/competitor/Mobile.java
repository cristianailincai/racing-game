package org.example.competitor;

public interface Mobile {

    double acceleration(double speed, double durationInHours);
    double getTotalTraveledDistance();

    boolean canMove();


    String getName();
}