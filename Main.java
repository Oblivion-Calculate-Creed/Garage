package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Garage garage = new Garage();
        Helicopter helicopter = new Helicopter(50,665,4,true);
        Car car = new Car(2,56,"audi",true,4,5);
        Boat boat = new Boat(10,678,120,150);
        garage.addToGarage(car);
        garage.addToGarage(helicopter);
        garage.addToGarage(boat);
        garage.fixVehicle();
        System.out.println(garage.bill);
        garage.removeVehicleByID(665);
        garage.removeVehicleByType("Car");
        System.out.println(garage.vehicles.get(0));
    }
}
