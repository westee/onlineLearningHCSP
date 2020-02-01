package com.github;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LogInterceptor implements MethodInterceptor {
    private DataServiceImp delegate;

    public LogInterceptor(DataServiceImp delegate) {
        this.delegate = delegate;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object retValue = method.invoke(delegate, objects);
        return retValue;
    }
}