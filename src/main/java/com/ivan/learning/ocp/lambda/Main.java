package com.ivan.learning.ocp.lambda;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void a(Consumer<String> func) {
        func.accept("lololo");
    }

    public static void main(String[] args) {
        a((a) -> {
            a = "sdf";
            System.out.println(a);
        });

        Consumer<List<Integer>> methodRef1 = Collections::sort;
    }
}
