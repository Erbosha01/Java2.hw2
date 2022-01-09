package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
//        createObject("Iphone").print();
//        System.out.println("-----------------");
//        createObject("Samsung").print();
//        System.out.println("-----------------");
//        createObject("Xiaomi").print();
        Phone[] phones = {createObject("Iphone"), createObject("Samsung"), createObject("Xiaomi")};
        for (Phone a : phones) {
            a.print();
            System.out.println("----------------");
        }

    }

    public static Phone createObject(String className) {
        switch (className) {
            case "Iphone":
                Iphone iphone = new Iphone(2020, 256, "Face id", "The best camera");
                return iphone;
            case "Samsung":
                Samsung samsung = new Samsung(2021, 64, "Touch ID");
                return samsung;
            case "Xiaomi":
                Xiaomi xiaomi = new Xiaomi(2018, 64, "The cheapest price");
                return xiaomi;
        }
        return null;
    }
}
