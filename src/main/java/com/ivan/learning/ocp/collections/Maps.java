package com.ivan.learning.ocp.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "b");
        map.put("b", "c");
        map.put("c", null);
        map.put("d", "dV");
        map.put("e", null);
        map.put("f", null);

        map.merge("a", "c", (v1, v2) -> {
            System.out.println("v1: " + v1);
            System.out.println("v2: " + v2);
            return v1.compareTo(v2) > 1 ? v1 : v2;
        });

        // map.merge("b", null, (v1, v2) -> v1); NullPointerException in here

        map.merge("c", "a", (v1, v2) -> v1);

        map.computeIfPresent("d", (k, v) -> k + v);
        map.computeIfPresent("e", (k, v) -> k + v);

        map.computeIfAbsent("d", k -> "ff");
        map.computeIfAbsent("f", k -> "ff");
        map.computeIfAbsent("g", k -> "new");

        System.out.println(map);
    }

}
