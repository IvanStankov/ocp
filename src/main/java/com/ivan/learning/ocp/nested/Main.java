package com.ivan.learning.ocp.nested;

import static com.ivan.learning.ocp.nested.abc.A.B;

public class Main {

    public static void main(String[] args) {
        B b = new B();
    }

    public void method() {
        class A {
            int a;
//            static int b; - Illegal
        }
    }
}
