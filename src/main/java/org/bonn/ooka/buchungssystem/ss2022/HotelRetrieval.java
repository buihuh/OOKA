package org.bonn.ooka.buchungssystem.ss2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HotelRetrieval implements Hotelsuche {
    private DBAccess dbAccess;
    private Caching caching;

    public HotelRetrieval(){
        dbAccess = new DBAccess();
        caching = new CachingPort();
    }

    @Override
    public Hotel[] getAllHotels() {
        return getHotelByName("*");
    }

    @Override
    public Hotel[] getHotelByName(String name) {
        List<String> searchResult = dbAccess.getObjects(dbAccess.HOTEL, name);
        Hotel[] output = new Hotel[searchResult.size()/3];

        int index = 0;
        for (int i = 0; i < searchResult.size(); i+=3) {
            output[index++] = new Hotel(searchResult.get(i), searchResult.get(i+1), searchResult.get(i+2));
        }

        ArrayList<Object> cacheList = new ArrayList<>();
        Collections.addAll(cacheList, output);
        caching.cacheResult(name, cacheList);

        return output;
    }

    @Override
    public void openSession() {
        dbAccess.openConnection();
    }

    @Override
    public void closeSession() {
        dbAccess.closeConnection();
    }
}
