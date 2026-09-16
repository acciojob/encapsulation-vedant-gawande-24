package com.driver;

public class Main {

    public static void main(String[] args) {

        RWOnly obj = new RWOnly();

        // Set value using setter
        obj.setName("Vedant");

        // Get value using getter
        System.out.println(obj.getName());
    }
}
