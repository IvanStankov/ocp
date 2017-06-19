package com.ivan.learning.ocp.singleton;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    public int data;

    private EagerSingleton() {
        System.out.println("Eager singleton has been created");
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void initData() {
        data = 100;
    }

    public int getData() {
        return data;
    }

    private Object readResolve() {
        return instance;
    }
}
