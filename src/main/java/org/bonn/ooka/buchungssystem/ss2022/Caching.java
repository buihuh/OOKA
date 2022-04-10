package org.bonn.ooka.buchungssystem.ss2022;

import java.util.List;

public interface Caching {
    void cacheResult(String key, List<Object> value);
    boolean contains(String key);
    List<Object> getCachedResult(String key);
}
