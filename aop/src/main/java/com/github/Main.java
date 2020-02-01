package com.github;

import net.sf.cglib.proxy.Enhancer;

public class Main {
    static DataServiceImp service = new DataServiceImp();

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(DataServiceImp.class);
        enhancer.setCallback(new LogInterceptor(service));

        DataServiceImp enhancedService = (DataServiceImp) enhancer.create();
        System.out.println(enhancedService.a(1));
    }
}
