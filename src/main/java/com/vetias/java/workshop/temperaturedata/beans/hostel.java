package com.java.workshop.temperaturedata.beans;

public class hostel extends  Building {
    private boolean isMessAvailable;
    private int noofrooms;
    public void setIsMessAvailable(boolean aIsMessAvailable){
        isMessAvailable=aIsMessAvailable;
    }
    public boolean getIsMessAvailable(){
        return isMessAvailable;
    }
    public void setNoOfRooms(int aNoOfRooms){
        noofrooms=aNoOfRooms;

    }
    public int getNoOfRooms(){
        return noofrooms;
    }
    
}
