package org.bonn.ooka.buchungssystem.ss2022;

public class Hotel {
    private String hotelNumber;
    private String hotelName;
    private String hotelLocation;

    public Hotel(String number, String name, String location){
        hotelNumber = number;
        hotelName = name;
        hotelLocation = location;
    }

    public String getHotelNumber(){
        return hotelNumber;
    }

    public String getHotelName(){
        return hotelName;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }
}
