package com.ivan.learning.ocp.functions;

import java.nio.file.DirectoryStream;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> lolo = Main::lolo;

        Main main = new Main();

        Predicate<Main> lolo2 = Main::lolo2;
        Predicate<String> lolo3 = main::lolo3;

        boolean asdf = isEmpty.test("asdf");

        System.out.println(asdf);
    }

    static boolean lolo(String param) {
        return true;
    }

    public boolean lolo2() {
        return false;
    }

    private boolean lolo3(String param) {
        return true;
    }
}
