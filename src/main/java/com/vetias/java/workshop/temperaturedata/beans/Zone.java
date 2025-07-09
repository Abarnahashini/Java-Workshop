package src.com.java.workshop.temperaturedata.beans;

public class Zone {
    private String name;
    private int zoneId;
    private double area;
    public void setName(String aName){
        name=aName;
    }
    public String getaName(){
        return name;
    }
    public void setZoneid(int aZoneid){
        zoneId=aZoneid;
    }
    public int getaZoneid(){
        return zoneId;
    }
    public void set(double  aArea){
        area=aArea;
    }    
    public double getaArea(){
        return area;
    }
}
