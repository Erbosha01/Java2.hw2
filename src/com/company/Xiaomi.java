package com.company;

public class Xiaomi extends Phone {
    private String price;

    public Xiaomi(int year, int memory, String price) {
        super(year, memory);
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Xiaomi" +
                "\nYear: " + getYear() +
                "\nMemory: " + getMemory() +
                "\nPrice: " + price);
    }
}
