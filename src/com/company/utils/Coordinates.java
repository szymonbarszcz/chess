package com.company.utils;

public class Coordinates<T,U> {
    private T x;
    private U y;

    public Coordinates(T x, U y){
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public U getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
