package com.nomust.Tasks.Lab3;

public class Doll extends Item {
    protected int size;
    public Doll(String name, int price, int size) {
        super(name, price);
        this.size = size;
    }
    @Override
    public String toString() {
        return "Doll: " +
                "size=" + size +
                ", price=" + price +
                ", name='" + name + '\'';
    }
}
