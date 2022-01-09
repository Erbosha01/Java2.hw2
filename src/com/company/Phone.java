package com.company;

public abstract class Phone implements Printable {
    public Phone(int year, int memory) {
        this.year = year;
        this.memory = memory;
    }

    private int year;
    private int memory;

    public int getMemory() {
        return memory;
    }

    public int getYear() {
        return year;
    }
}
