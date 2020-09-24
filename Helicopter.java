package com.company;

public class Helicopter extends Vehicle {
	
    int numOfBlades;
    boolean hasRadar;

    public Helicopter(float sizeOfEngine, int registrationNumber, int numOfBlades, boolean hasRadar) {
        super(sizeOfEngine, registrationNumber);
        this.numOfBlades = numOfBlades;
        this.hasRadar = hasRadar;
        
    }
}
