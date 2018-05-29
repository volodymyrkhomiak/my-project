package com.company;

public abstract class Figure {
    private int length;
    private int width;
    private int height;

    public Figure(int length, int width, int height){
        this.length = length;
        this.width = width;
    }

    public abstract int Square();
}
