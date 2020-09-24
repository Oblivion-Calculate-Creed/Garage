package com.company;

public class Boat extends Vehicle {
	
    int speed;
    int sizeOfHullCubed;

    public Boat(float sizeOfEngine, int registrationNumber, int speed, int sizeOfHullCubed) {
        super(sizeOfEngine, registrationNumber);
        this.speed = speed;
        this.sizeOfHullCubed = sizeOfHullCubed;
        
    }
}
