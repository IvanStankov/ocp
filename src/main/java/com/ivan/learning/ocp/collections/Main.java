package com.ivan.learning.ocp.collections;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Comparator<A> comparator = (a, b) -> {
            Comparator<A> c = Comparator.comparing(x -> x.a);
            c = c.thenComparingInt(x -> x.b);
            return c.compare(a, b);
        };

        List<A> list = new ArrayList<>();
        list.add(new A("qwe", 5));
        list.add(new A("asd", 1));
        list.add(new A("qwe", 2));
        list.add(new A("qwe", 8));
        list.add(new A("asd", -9));
        list.add(new A("rty", 15));

        list.sort(comparator);

        System.out.println(list);


        List<String> list2 = new ArrayList<>();
        list2.add("Magician");
        list2.add("Assistant");
        list2.removeIf(s -> s.startsWith(s));
    }

    static class A {
        String a;
        int b;

        public A(String a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return "A{" +
                    "a='" + a + '\'' +
                    ", b=" + b +
                    '}';
        }
    }

}
