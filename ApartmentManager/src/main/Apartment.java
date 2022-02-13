package main;

import java.time.LocalDateTime;

public class Apartment {
    private int apartmentId;
    private String location;
    private String apartmentNum;
    private int squareFeet;
    private double price;
    private LocalDateTime updated;
    //different constructors
    public Apartment() {
        this.apartmentId = 0;
        this.location = "";
        this.apartmentNum = "";
        this.squareFeet = 0;
        this.price = 0.00;
        this.updated = LocalDateTime.now();
    }
    public Apartment(int apartmentId, String location, String apartmentNum, int squareFeet, double price) {
        this.apartmentId = apartmentId;
        this.location = location;
        this.apartmentNum = apartmentNum;
        this.squareFeet = squareFeet;
        this.price = price;
        this.updated = LocalDateTime.now();
    }
    //auto-populating get and set functions
    public int getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getApartmentNum() {
        return apartmentNum;
    }

    public void setApartmentNum(String apartmentNum) {
        this.apartmentNum = apartmentNum;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated() {
        this.updated = LocalDateTime.now();
    }

    // apartment return using auto generated toString
    @Override
    public String toString() {
        return "Apartment [apartmentId=" + apartmentId + ", apartmentNum=" + apartmentNum + ", location=" + location
                + ", price=" + price + ", squareFeet=" + squareFeet + ", updated=" + updated + "]";
    }

    
    
}
