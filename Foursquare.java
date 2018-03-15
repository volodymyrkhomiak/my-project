package com.company;

public class Foursquare extends Figure{

    private int length;
    private int width;

    public Foursquare(int length, int width, int height){
       super(length, width, height);
        this.length = length;
        this.width = width;
    }

    @Override
    public int Square(){
        return width*length;
    }

}
