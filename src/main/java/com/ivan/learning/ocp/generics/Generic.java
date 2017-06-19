package com.ivan.learning.ocp.generics;

public class Generic<T> {

    private T object;

    public Generic(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public static <T extends Number> void doSomething(T param) {
        System.out.println(param.doubleValue());
    }
}
