package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Garage garage = new Garage();
        Helicopter helicopter = new Helicopter(50,665,4,true);
        Car car = new Car(2,56,"audi",true,4,5);
        Boat boat = new Boat(10,678,120,150);
        
        System.out.println("Welcome to 'com.company' Garage!");
               
        garage.addToGarage(car);
        garage.addToGarage(helicopter);
        garage.addToGarage(boat);
        
        System.out.println(boat.getClass().getSimpleName());
        
        garage.removeVehicleByID(665);
        garage.removeVehicleByType("Car");
        System.out.println("ID: " + garage.vehicles.get(0));
        
        garage.fixVehicle();
        System.out.println("Price: $" + garage.bill);
        
    }
}
