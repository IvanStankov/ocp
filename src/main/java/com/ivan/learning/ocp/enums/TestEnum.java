package com.ivan.learning.ocp.enums;

public enum TestEnum {

    MERCURY {
        public void print() {
            System.out.println("MERCURY");
        }
    },
    VENUS {
        public void print() {
            System.out.println("VENUS");
        }
    },
    EARTH {
        public void print() {
            System.out.println("EARTH");
        }
    },
    MARS {
        public void print() {
            System.out.println("MARS");
        }
    };

    public abstract void print();

}
