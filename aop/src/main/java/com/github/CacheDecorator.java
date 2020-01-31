package com.github;

import java.util.HashMap;
import java.util.Map;

public class CacheDecorator implements DataService{
    DataService delegate;
    private Map<String, String> cache = new HashMap<String, String>();

    public CacheDecorator(DataService delegate) {
        this.delegate = delegate;
    }

    public String a(int i) {
        String cacheValue = cache.get("a");
        if(cacheValue == null){
            String val = delegate.a(1);
            cache.put("a", val);
            return  val;
        }
        System.out.println("have cache");
        return cacheValue;
    }

    public String b(int i) {
        String cacheValue = cache.get("b");
        if(cacheValue == null){
            String val = delegate.b(1);
            cache.put("b", val);
            return  val;
        }
        System.out.println("have cache");
        return cacheValue;
    }
}
