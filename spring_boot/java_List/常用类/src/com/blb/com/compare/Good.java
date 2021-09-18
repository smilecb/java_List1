package com.blb.com.compare;

public class Good  implements Comparable{
    private String name;
    private double piece;

    public Good() {
    }

    public Good(String name, double piece) {
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

    @Override
    public int compareTo(Object o)
    {
        if(o instanceof Good)
        {
            Good good=(Good)o;
            if(this.piece>good.piece)
            {
                return 1;
            }
            else if(this.piece<good.piece)
            {
                return -1;
            }
            return 0;
        }
        return 0;
    }
}
