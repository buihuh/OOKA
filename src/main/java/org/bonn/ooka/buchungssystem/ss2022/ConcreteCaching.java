package org.bonn.ooka.buchungssystem.ss2022;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConcreteCaching implements Caching {

    private Map<String, List<Object>> cacheMap;

    public ConcreteCaching(){
        cacheMap = new HashMap<>();
    }

    @Override
    public void cacheResult(String key, List<Object> value) {
        cacheMap.put(key, value);
    }

    @Override
    public boolean contains(String key) {
        return cacheMap.containsKey(key);
    }

    @Override
    public List<Object> getCachedResult(String key) {
        if(contains(key))
            return cacheMap.get(key);
        return null;
    }
}
