package com.ivan.learning.ocp.singleton;

public enum EnumBased {

    INSTANCE;

    private int someData;

    EnumBased() {
        System.out.println("EnumBased singleton has been instantiated");
    }

    public void initData() {
        someData = 50;
    }

    public int getData() {
        return someData;
    }
}
