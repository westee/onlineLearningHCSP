package com.github;

import java.lang.reflect.Proxy;

public class Main {
    static DataService service = new DataServiceImp();
    public static void main(String[] args) {
        DataService dataService = (DataService) Proxy.newProxyInstance(
                service.getClass().getClassLoader(),
                new Class[]{DataService.class},
                new LogProxy(service));
        System.out.println("main" + dataService.a(11112222));
    }
}
