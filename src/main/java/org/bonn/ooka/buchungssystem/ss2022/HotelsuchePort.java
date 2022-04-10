package org.bonn.ooka.buchungssystem.ss2022;


import java.time.LocalDateTime;

public class HotelsuchePort implements Hotelsuche{

    private HotelRetrieval hotelRetrieval;

    public HotelsuchePort(){
        hotelRetrieval = new HotelRetrieval();
    }

    @Override
    public Hotel[] getAllHotels() {
        logAccess("getAllHotels", "");
        return hotelRetrieval.getAllHotels();
    }

    @Override
    public Hotel[] getHotelByName(String name) {
        logAccess("getHotelByName", name);
        return hotelRetrieval.getHotelByName(name);
    }

    @Override
    public void openSession() {
        hotelRetrieval.openSession();
    }

    @Override
    public void closeSession() {
        hotelRetrieval.closeSession();
    }

    private void logAccess(String methodName, String searchKey) {
        String output = LocalDateTime.now() + ": Zugriff auf Buchungssystem über Methode " + methodName + ".";
        if (!searchKey.equals("")){
            output += " Suchwort : " + searchKey;
        }
        System.out.println(output);
    }

}
