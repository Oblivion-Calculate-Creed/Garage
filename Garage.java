package com.company;

import java.util.ArrayList;

public class Garage {
	
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    int bill = 0;
    void removeVehicleByID(int ID){

        for(int i = 0; i<vehicles.size();i++){

            if(vehicles.get(i).registrationNumber == ID){
                vehicles.remove(i);
            }
        }
    }

    void removeVehicleByType(String type){

        for(int i = 0; i<vehicles.size();i++){
            type = "com.company." + type;
            if(vehicles.get(i).getClass().getName().equals(type)){
                vehicles.remove(i);
            }
        }
    }

    void fixVehicle(){
    	
        for(int i = 0; i<vehicles.size();i++){
            if(vehicles.get(i) instanceof Car){
                bill += 1000;
                if(((Car) vehicles.get(i)).rightHandDrive == false){
                    bill += 500;
                }
            }

            else if(vehicles.get(i) instanceof Helicopter){
                if(((Helicopter) vehicles.get(i)).numOfBlades> 4) bill += 10000;
                else bill+=8000;
            }

            else if(vehicles.get(i) instanceof Boat){
                if(((Boat) vehicles.get(i)).sizeOfHullCubed> 1000){
                    bill += 10000;
                }
                else bill += 7500;
            }
        }
    }



    void emptyGarage(){
        vehicles.clear();
    }

    void addToGarage(Vehicle vehicle){
        vehicles.add(vehicle);
    }
}
