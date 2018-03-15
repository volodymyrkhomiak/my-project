package com.company;

public class Prism extends Figure {
    private int length;
    private int width;
    private int height;

    public Prism(int length, int width, int height) {
        super(length, width, height);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public int Square() {
        return (width * length)*2+(width * height)*2+(length * height)*2;
    }
}