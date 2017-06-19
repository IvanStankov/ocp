package com.ivan.learning.ocp.singleton;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
        System.out.println();

        System.out.println("before initializing EnumBased singleton data");
        EnumBased.INSTANCE.initData();

        System.out.println("before invoking EnumBased getData method");
        EnumBased.INSTANCE.getData();

        System.out.println("*******************************************************");

        System.out.println("before initializing EagerSingleton singleton data");
        EagerSingleton.getInstance().initData();

        System.out.println("before invoking EagerSingleton getData method");
        EagerSingleton.getInstance().getData();
    }

}
