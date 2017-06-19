package com.ivan.learning.ocp;

import java.util.ArrayList;
import java.util.List;

public class Main {

    interface Action {
        void execute();
    }

    static class DeleteAction implements Action {
        @Override
        public void execute() {
            System.out.println("Deleted");
        }
    }

    public static void main(String[] args) {

        List<String> strings = newList();

    }

    private static List<String> newList() {
        return new ArrayList<String>();
    }

}
