package com.github;

import javafx.scene.chart.PieChart;

public class LogDecorator implements DataService {
    DataService delegate;

    public LogDecorator(DataService delegate){
        this.delegate = delegate;
    }

    public String a(int i) {
//        System.out.println("开始");
        String val = delegate.a(1);
//        System.out.println("结束，value=" + val);
        return val;
    }

    public String b(int i) {
//        System.out.println("开始");
        String val = delegate.a(1);
//        System.out.println("结束，value=" + val);
        return val;
    }
}
