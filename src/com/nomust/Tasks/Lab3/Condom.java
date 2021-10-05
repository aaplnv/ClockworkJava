package com.nomust.Tasks.Lab3;

public class Condom extends Item {
    protected int length;
    public Condom(String name, int price, int length) {
        super(name, price);
        this.length = length;
    }

    @Override
    public String toString() {
        return "Condom: " +
                "length=" + length +
                ", price=" + price +
                ", name='" + name + '\'';
    }
}
