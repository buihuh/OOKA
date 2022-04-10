package org.bonn.ooka.buchungssystem.ss2022;

import java.util.ArrayList;
import java.util.List;

public class CachingPort implements Caching {

    private Caching usedCache = null;

    @Override
    public void cacheResult(String key, List<Object> value) {
        try {
            usedCache.cacheResult(key, value);
        }
        catch (Exception e){

        }
    }

    @Override
    public boolean contains(String key) {
        try {
            return usedCache.contains(key);
        }
        catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Object> getCachedResult(String key) {
        try {
            return usedCache.getCachedResult(key);
        }
        catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public void assignCache(Caching cache){
        usedCache = cache;
    }
}
