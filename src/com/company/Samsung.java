package com.company;

public class Samsung extends Phone {
    private String touchID;

    public Samsung(int year, int memory, String touchID) {
        super(year, memory);
        this.touchID = touchID;
    }

    @Override
    public void print() {
        System.out.println("Samsung" +
                "\nYear: " + getYear() +
                "\nMemory: " + getMemory() +
                "\nTouch id: " + touchID);
    }
}
