package src.com.java.workshop.temperaturedata.beans;

public class Sensor {
    private int  sensorid;
    private String sensorname;
    private double temperature;
    public void setSensorId(int aSensorId){
        sensorid=aSensorId;

    }
    public int getSensorId(){
        return sensorid;
    }
    public void setSensorName(String aSensorName){
       sensorname=aSensorName;
    }
     public String getSensorName(String aSensorName){
        return sensorname;

    }
    public void setTemperature(double aTemperature){
        temperature=aTemperature;
    }
    public double getTemperature(){
        return temperature;
    }
}
