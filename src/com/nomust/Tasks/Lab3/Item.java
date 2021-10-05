package com.nomust.Tasks.Lab3;

public abstract class Item {
    public int price;
    public String name;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void sell() {
        System.out.println("Congratulations! It yours!");
    }

    public int getPrice() {
        return price;
    }

    public String getName() { return name; }

    public abstract String toString();
}
