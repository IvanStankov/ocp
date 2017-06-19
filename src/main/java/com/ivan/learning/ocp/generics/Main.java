package com.ivan.learning.ocp.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
    }

    static class A<T extends A<T>> {

        T param;

        public void setParam(T param) {
            this.param = param;
        }

        public int func() {
            return 3;
        }

        public void action() {
            System.out.println(param.func());
        }

    }

    static class B extends A<B> {

    }

    static class C extends A<B> {

    }

}
