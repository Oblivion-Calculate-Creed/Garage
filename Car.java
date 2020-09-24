package com.company;

public class Car extends Vehicle {
	
    String brand;
    boolean rightHandDrive;
    int numOfSeats;
    int numOfWheels;

    public Car(float sizeOfEngine, int registrationNumber, String brand, boolean rightHandDrive, int numOfSeats, int numOfWheels) {
        
    	super(sizeOfEngine, registrationNumber);
        this.brand = brand;
        this.rightHandDrive = rightHandDrive;
        this.numOfSeats = numOfSeats;
        this.numOfWheels = numOfWheels;

    }
}
