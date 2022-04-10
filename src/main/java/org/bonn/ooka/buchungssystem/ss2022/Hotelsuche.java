package org.bonn.ooka.buchungssystem.ss2022;

public interface Hotelsuche {
    Hotel[] getAllHotels();
    Hotel[] getHotelByName(String name);
    void openSession();
    void closeSession();
}
