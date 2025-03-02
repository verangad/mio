package com.example.spring_boot.models;

public class Tuple<X, Y> {
    public final X x;
    public final Y y;
    public Tuple(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public X getX() { return this.x; }
    public Y getY() { return this.y; }
}
