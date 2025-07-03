package src.com.java.workshop.temperaturedata.beans;

public class location {
    private String name;
    private double latitute;
    private double longitute;
    private String description;
    private String country;
    private String city;
    private String address;
    private long postalcode;
    public void setName(String aName){
        name=aName;

    }
    public String getName(){
        return name;
    }
    public void setLatittute(double aLatitute){
        latitute=aLatitute;

    }
    public double  getLatitute(){
        return latitute;
    }
    public void setLongitute(double aLongitute){
        longitute=aLongitute;

    }
    public double getLongitute(){
        return longitute;
    }
    public void setDescription(String aDsecription){
        description=aDsecription;

    }
    public String getDescription(){
        return description;
    }
    public void setCountry(String aCountry){
        country=aCountry;

    }
    public String getCountry(){
        return country;
    }
    public void setCity(String aCity){
        city=aCity;

    }
    public String getCity(){
        return city;
    }
    public void setAddress(String aAddress){
        address=aAddress;

    }
    public String getAddress(){
        return address;
    }    
    public void setPostalCode(long aPostalCode){
        postalcode=aPostalCode;

    }
    public long getPostalCode(){
        return postalcode;
    }


    

}

