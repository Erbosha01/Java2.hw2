package com.company;

public class Iphone extends Phone {
    private String faceID;
    private String camera;

    public Iphone(int year, int memory, String faceID, String camera) {
        super(year, memory);
        this.faceID = faceID;
        this.camera = camera;
    }

    @Override
    public void print() {
        System.out.println("Iphone" +
                "\nYear: " + getYear() +
                "\nMemory: " + getMemory() +
                "\nFace id: " + faceID +
                "\nCamera: " + camera);
    }
}
