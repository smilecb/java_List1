package com.blb.com.compare;

public class Good1 {
    private String name;
    private double piece;

    public Good1() {
    }

    public Good1(String name, double piece) {
        this.name = name;
        this.piece = piece;
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                ", piece=" + piece +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPiece() {
        return piece;
    }

    public void setPiece(double piece) {
        this.piece = piece;
    }
}
