package com.github;


import java.util.UUID;

public class DataServiceImp implements DataService {

    public String a(int i) {
        return UUID.randomUUID().toString();
    }

    public String b(int i) {
        return UUID.randomUUID().toString();
    }
}
