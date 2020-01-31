package com.github;

public class Main {
    static DataService service = new CacheDecorator(new LogDecorator(new DataServiceImp()));

    public static void main(String[] args) {
//        System.out.println(service.a(1));
//        System.out.println(service.b(2));
        for (int i = 0; i < 2; i++) {
            service.a(1);
            service.b(1);
        }
    }
}
